public class ClassObj {

    // Define a nested class named "Person" inside ClassObj
    public static class Person {
        // Fields (attributes) of the Person class
        String name;
        int age;

        // Constructor for the Person class
        public Person(String personName, int personAge) {
            name = personName;
            age = personAge;
        }

        // Method to display information about the person
        public void displayInfo() {
            System.out.println("Name: " + name);
            System.out.println("Age: " + age);
        }
    }

    // Main method to demonstrate the usage of the Person class
    public static void main(String[] args) {
        // Create an object of the Person class using the constructor
        Person person1 = new Person("VASANTH DS", 25);

        // Accessing fields of the object
        System.out.println("Person 1 - Name: " + person1.name + ", Age: " + person1.age);

        // Using a method to display information about the person
        person1.displayInfo();

        // Create another object of the Person class
        Person person2 = new Person("PRAVEEN DS", 30);
        person2.displayInfo();
    }
}
