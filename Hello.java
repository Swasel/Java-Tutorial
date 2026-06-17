public class Hello {
  public static void main(String[] args) {
    System.out.println("Hello World!");

    // variables (to store data or value)
    int num = 22;
    char letter = 'S';
    String str = "Swathy";
    boolean b = true;
    System.out.println(str + "." + letter + " " + num + " " + b);

    // data types: primitive and non- primitive
    /*
     * Primitive => integer charater float boolean
     * => interger - byte(8 bits) short(16 bits) int(32 bits) long(64 bits)
     * => float - float(32 bits) double(64 bits)
     * => chararter - char(16 bits) // java floowos unicode
     */
    long l = 6543l;
    System.out.println(l);

    // Type conversion and casting
    /*
     * Conversion means assigning smaller data type to larger data type (widenning)
     * byte → short → char → int → long → float → double
     * Casting means assigning larger datatype to smaller datatype (Narrowing)
     * double → float → long → int → char → short → byte
     * 
     * => Type Promotion
     * All byte, short, and char values are promoted to int first.
     * If one operand is long, the entire expression becomes long.
     * If one operand is float, the entire expression becomes float.
     * If one operand is double, the entire expression becomes double
     */

    byte a = 123;
    int c = 76;
    c = a; // (conversion)
    a = (byte) c; // (casting)

    // Operators
    int num1 = 15;
    int num2 = 3;
    int res = 0;
    boolean fact = true;

    // Arithmetic operations
    res = num1 + num2;
    res = num1 - num2;
    res = num1 / num2;
    res = num1 % num2;
    res = num1 * num2;

    // unary operations
    num1++; // postfix increment
    ++num2; // prefix increment
    num2--;
    --num2;
    fact = !fact; // logical not

    /*
     * => Assignment operators
     * =, +=, -=, /=, %=
     * 
     * => Relational operators
     * >, <, ==, >=, <=, !=
     * 
     * => logical operator
     * AND &&
     * OR ||
     */

    // Ternary operator
    int max = num1 > num2 ? num1 : num2;

    // Conditional Statements (if else)
    if (num1 > 0) {
      System.out.println("Positive");
    } else if (num1 < 0) {
      System.out.println("Negative");
    } else {
      System.out.println("Zero");
    }

    int n = 3;
    switch (n) {
      case 1:
        System.out.println("One");
        break;
      case 2:
        System.out.println("Two");
        break;
      default:
        System.out.println("Other");
        break;
    }

    // Looping Statements
    for (int i = 1; i <= 4; i++) {
      System.out.print(i + " ");
    }
    System.out.println();
    while (n > 0) {
      System.out.print(n-- + " ");
    }
    System.out.println();
    int j = 1;
    do {
      System.out.println(j++);
    } while (j <= 4);
  }
}
