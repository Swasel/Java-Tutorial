interface A {

  // variables in interface is final and static
  int age = 17;
  String name = "Logan";

  void show();

  void config();
}

interface X {
  void run();
}

interface Y extends X {

}

// a class can implement multiple interface
class B implements A, Y {
  public void show() {
    System.out.println("in show");
  }

  public void config() {
    System.out.println("in config");
  }

  public void run() {
    System.out.println("in run");
  }
}
//Enum (Enumeration) is a special data type used to represent a fixed set of constants.
enum Day {
  MONDAY, TUESDAY, WEDNESDAY
}
enum Level {
    LOW(1),
    MEDIUM(2),
    HIGH(3);

    private int value;

    Level(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }
}
public class Interface {
  public static void main(String[] args) {
    A obj = new B();
    obj.show();
    obj.config();

    System.out.println(Day.MONDAY.ordinal()); // 0
    System.out.println(Day.valueOf("TUESDAY")); // TUESDAY

    for (Day d : Day.values()) {
      System.out.println(d);
    }
    System.out.println(Level.HIGH.getValue());
  }
}
