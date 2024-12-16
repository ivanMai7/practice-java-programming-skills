package xyz.ivan.skills.oop.easy._02;

// Task: Design an Animal class and its subclasses
// Description: Design an Animal class with the attribute: name (animal name).
// Create two subclasses:
// Dog, add a bark() method, output "Dog is barking".
// Cat, add a meow() method, output "Cat is meowing".

public class Main {
    public static void main(String[] args) {
        Dog dog = new Dog("Buddy");
        dog.bark();

        Cat cat = new Cat("Whiskers");
        cat.meow();
    }
}

// Define the Animal class
class Animal {
    protected String name;

    public Animal(String name) {
        this.name = name;
    }
}

// Define the Dog class, inheriting from Animal
class Dog extends Animal {
    public Dog(String name) {
        super(name);
    }

    public void bark() {
        System.out.println("Dog is barking");
    }
}

// Define the Cat class, inheriting from Animal
class Cat extends Animal {
    public Cat(String name) {
        super(name);
    }

    public void meow() {
        System.out.println("Cat is meowing");
    }
}
