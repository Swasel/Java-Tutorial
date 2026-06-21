class Human {

  // Private variables hide the data from outside classes
  private int age;
  private String name;

  // default constructor
  public Human() {
    age = 18;
    name = "Dean";
  }

  // parameterised constructor
  public Human(int age, String name) {
    this.age = age;
    this.name = name;
  }

  public int getAge() {
    return age;
  }

  public void setAge(int age) {
    this.age = age;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }
}

public class Encapsulation {
  public static void main(String[] args) {
    Human obj = new Human();
    Human obj1 = new Human(27, "Logan");
    obj.setAge(22);
    obj.setName("Swathy");
    System.out.println(obj.getName() + " " + obj.getAge());
    System.out.println(obj1.getName() + " " + obj1.getAge());

  }
}
