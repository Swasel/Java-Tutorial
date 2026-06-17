import java.util.*;
import java.io.*;

class Calculator {
  public int add(int num1, int num2) {
    int result = num1 + num2;
    return result;
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
    System.out.println(num1 + "+" + num2 + "=" + result);
  }
}