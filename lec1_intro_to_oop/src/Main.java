// Class: Person
class Person {
    // Attributes (Variables)
    private final String name;
    private final int age;

    // Constructor (Special method to initialize new objects)
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Method: Get the person's name
    public String getName() {
        return name;
    }

    // Method: Get the person's age
    public int getAge() {
        return age;
    }
    public static void main(String[] args) {
        // Object Person1: Creating an instance of Person
        Person person1 = new Person("Alice", 30);

        // Object Person2: Creating an instance of Person
        Person person2 = new Person("John", 35);

        // Using methods to manipulate and access object's data
        System.out.println("Name: " + person1.getName() + ", Age: " + person1.getAge());

        // Accessing the modified object's data
        System.out.println("Name: " + person2.getName() + ", Age: " + person2.getAge());
}}

//// Main class
//public class Main {
//
//    }
//}
