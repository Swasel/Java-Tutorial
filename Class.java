import java.util.*;

class Calculator {

  // Method overloading
  /* Same class name ifferent number of parameters */
  public int add(int num1, int num2) {
    int result = num1 + num2;
    return result;
  }

  public int add(int num1, int num2, int num3) {
    int result = num1 + num2 + num3;
    return result;
  }
}

class Mobile {
  String brand;
  int price;
  static String name;// static variable

  static {// static block
    // this block will be called only one even if we have more than one object
    name = "Phone";
    System.out.println("In static block");
  }

  public Mobile() {
    // this block will be called as many times as object created
    brand = "";
    price = 200;
    System.out.println("In constructor");

  }

  public void show() {
    System.out.println(brand + " " + price + " " + name);
  }

  // static method
  public static void show1(Mobile obj) {
    System.out.println("In static method");
    // we can print static varible in static method but cant print non static
    // varible directly
    System.out.println(obj.brand + " " + obj.price + " " + name);
  }
}

public class Class {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    Calculator c = new Calculator();
    // obj of the class calculator. this obj can use the methods in that class
    System.out.print("Enter a value: ");
    int num1 = sc.nextInt();
    System.out.print("Enter a value: ");
    int num2 = sc.nextInt();
    int result = c.add(num1, num2);
    int result2 = c.add(num1, num2, 10);
    System.out.println(num1 + "+" + num2 + "=" + result);
    System.out.println(result2);
    sc.close();

    // for call Mobile
    Mobile obj1 = new Mobile();
    obj1.brand = "Apple";
    obj1.price = 1500;
    Mobile.name = "Smartphone";

    Mobile obj2 = new Mobile();
    obj2.brand = "Samsung";
    obj2.price = 1700;

    obj1.show();
    obj2.show();

    Mobile.show1(obj1);
  }
}

// naming convention
// we use camel casting
// class name always starts with capital
// varibla and method name in small letter
// constants PIE
// bookMyShow() - camel for easier reading