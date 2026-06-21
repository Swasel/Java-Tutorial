import java.util.*;

class Student {

  // these are instance variable
  int rollno;
  String name;
  int mark;

  // stactic variable will be shared by all obj i.e. all have common value
  // use static variable with class name
}

public class Array {
  public static void main(String[] args) {

    // array index always starts with 0 1 2 3...

    int[] arr = { 1, 6, 3, 2, 5 };
    int[] arr1 = new int[5];
    for (int i : arr) {
      System.out.println(i);
    }

    // multi-dimensional array
    int[][] mat = new int[3][3];
    int k = 1;
    for (int i = 0; i < 3; i++) {
      for (int j = 0; j < 3; j++) {
        mat[i][j] = k++;
      }
    }
    for (int i = 0; i < 3; i++) {
      for (int j = 0; j < 3; j++) {
        System.out.print(mat[i][j] + " ");
      }
      System.out.println();
    }

    // generate random value
    int random = (int) (Math.random() * 10);
    System.out.println(random);

    // jagged array
    int[][] mat2 = new int[3][];
    mat2[0] = new int[3];
    mat2[1] = new int[4];
    mat2[2] = new int[2];

    // Arrays is a class
    // sorting
    Arrays.sort(arr);
    // converts 1D array to string
    System.out.println(Arrays.toString(arr));
    // converts multi dimension array to string
    System.out.println(Arrays.deepToString(mat2));
    // fill arr with particular value
    Arrays.fill(arr1, 22);
    System.out.println(Arrays.toString(arr1));

    // array of objects
    Student s1 = new Student();
    s1.rollno = 1;
    s1.name = "logan";
    s1.mark = 88;

    Student s2 = new Student();
    s2.rollno = 2;
    s2.name = "Dean";
    s2.mark = 98;

    Student s3 = new Student();
    s3.rollno = 3;
    s3.name = "Garrett";
    s3.mark = 90;

    Student[] students = new Student[3];
    students[0] = s1;
    students[1] = s2;
    students[2] = s3;

    for (int i = 0; i < students.length; i++) {
      System.out.println(students[i].rollno + " " + students[i].name + " " + students[i].mark);
    }
  }
}
