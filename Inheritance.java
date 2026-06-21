interface Father {
  void fatherProperty();
}

interface Mother {
  void motherProperty();
}

// Single Inheritance
class Animal {
  void eat() {
    System.out.println("Animal eats");
  }
}

class Dog extends Animal {
  void bark() {
    System.out.println("Dog barks");
  }
}

// Multilevel Inheritance
class Puppy extends Dog {
  void weep() {
    System.out.println("Puppy weeps");
  }
}

// Hierarchical Inheritance
class Cat extends Animal {
  void meow() {
    System.out.println("Cat meows");
  }
}

// Multiple Inheritance using Interfaces
class Child implements Father, Mother {
  public void fatherProperty() {
    System.out.println("Inherited Father's property");
  }

  public void motherProperty() {
    System.out.println("Inherited Mother's property");
  }
}

public class Inheritance {
  public static void main(String[] args) {

    System.out.println("----- Single Inheritance -----");
    Dog d = new Dog();
    d.eat();
    d.bark();

    System.out.println("\n----- Multilevel Inheritance -----");
    Puppy p = new Puppy();
    p.eat();
    p.bark();
    p.weep();

    System.out.println("\n----- Hierarchical Inheritance -----");
    Cat c = new Cat();
    c.eat();
    c.meow();

    System.out.println("\n----- Multiple Inheritance (Interfaces) -----");
    Child ch = new Child();
    ch.fatherProperty();
    ch.motherProperty();
  }
}