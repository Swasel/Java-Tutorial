import java.util.*;

class Car {
    int id;
    char location;
    int freeAt;
    double earnings;

    Car(int id) {
        this.id = id;
        this.location = 'A'; // all cars start at A
        this.freeAt = 0;
        this.earnings = 0;
    }

    public String toString() {
        return "Car-" + id + " | Location: " + location + " | FreeAt: " + freeAt + " | Earnings: ₹" + earnings;
    }
}

class Booking {
    int bookingId;
    int customerId;
    char from;
    char to;
    int pickupTime;
    int dropTime;
    double fare;
    int carId;

    Booking(int bookingId, int customerId, char from, char to, int pickupTime, int carId) {
        this.bookingId = bookingId;
        this.customerId = customerId;
        this.from = from;
        this.to = to;
        this.pickupTime = pickupTime;
        this.carId = carId;
    }

    void calculateFareAndTime() {
        int distUnits = Math.abs(to - from); // 15km per unit
        int distance = distUnits * 15;

        // fare logic: 100 for first 5km, 10/km after
        fare = 100 + Math.max(0, distance - 5) * 10;
        dropTime = pickupTime + distUnits; // 1hr per 15km
    }

    public String toString() {
        return "BookingID: " + bookingId + " | Car: " + carId + " | Customer: " + customerId +
               " | From: " + from + " | To: " + to + " | Pickup: " + pickupTime +
               " | Drop: " + dropTime + " | Fare: ₹" + fare;
    }
}

public class TaxiBookingSystem {

    static List<Car> cars = new ArrayList<>();
    static List<Booking> bookings = new ArrayList<>();
    static int bookingId = 1;

    public static void bookTaxi(int custId, char from, char to, int time) {
        List<Car> available = new ArrayList<>();

        for (Car car : cars) {
            int timeToReach = Math.abs(car.location - from);
            if (car.freeAt <= time - timeToReach) {
                available.add(car);
            }
        }

        if (available.size() == 0) {
            System.out.println("No cars available now. Try later.");
            return;
        }

        Car selected = null;
        int minDist = Integer.MAX_VALUE;

        for (Car car : available) {
            int dist = Math.abs(car.location - from);
            if (dist < minDist) {
                minDist = dist;
                selected = car;
            } else if (dist == minDist && car.earnings < selected.earnings) {
                selected = car;
            }
        }

        Booking b = new Booking(bookingId++, custId, from, to, time, selected.id);
        b.calculateFareAndTime();

        selected.location = to;
        selected.freeAt = b.dropTime;
        selected.earnings += b.fare;

        bookings.add(b);
        System.out.println("Taxi Booked. Car-" + selected.id + " is assigned.");
    }

    public static void showCars() {
        System.out.println("\n-- Car Status --");
        for (Car c : cars) {
            System.out.println(c);
        }
        System.out.println();
    }

    public static void showBookings() {
        System.out.println("\n-- Booking History --");
        if (bookings.size() == 0) {
            System.out.println("No bookings done yet.");
        } else {
            for (Booking b : bookings) {
                System.out.println(b);
            }
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        for (int i = 1; i <= 4; i++) {
            cars.add(new Car(i));
        }

        int ch = 0;
        while (ch != 4) {
            System.out.println("---- TAXI BOOKING SYSTEM ----");
            System.out.println("1. Book Taxi");
            System.out.println("2. View Bookings");
            System.out.println("3. View Cars");
            System.out.println("4. Exit");
            System.out.print("Enter option: ");
            ch = sc.nextInt();

            switch (ch) {
                case 1:
                    System.out.print("Customer ID: ");
                    int cid = sc.nextInt();
                    System.out.print("Pickup Point (A-G): ");
                    char from = sc.next().toUpperCase().charAt(0);
                    System.out.print("Drop Point (A-G): ");
                    char to = sc.next().toUpperCase().charAt(0);
                    System.out.print("Pickup Time (0-23): ");
                    int time = sc.nextInt();

                    if (from < 'A' || from > 'G' || to < 'A' || to > 'G') {
                        System.out.println("Invalid point. Use A to G only.");
                        break;
                    }

                    bookTaxi(cid, from, to, time);
                    break;

                case 2:
                    showBookings();
                    break;

                case 3:
                    showCars();
                    break;

                case 4:
                    System.out.println("Exiting. Bye!");
                    break;

                default:
                    System.out.println("Invalid option. Try again.");
            }
        }

        sc.close();
    }
}
