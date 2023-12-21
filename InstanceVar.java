public class InstanceVar {
    // Instance variables
    String name;
    int age;

    // Constructor to initialize instance variables
    public InstanceVar(String personName, int personAge) {
        name = personName;
        age = personAge;
    }

    // Method to display information about the person
    public void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }

    // Method to update the age of the person
    public void setAge(int newAge) {
        age = newAge;
    }

    public static void main(String[] args) {
        // Create an object of the Person class
        InstanceVar person1 = new InstanceVar("Vasanth", 25);

        // Accessing and displaying instance variables
        System.out.println("Person 1 - Name: " + person1.name + ", Age: " + person1.age);

        // Using methods to interact with instance variables
        person1.displayInfo();

        // Update the age of the person
        person1.setAge(26);

        // Display updated information
        person1.displayInfo();
    }
}
