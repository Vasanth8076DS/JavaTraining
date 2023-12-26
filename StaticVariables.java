public class StaticVariables {
    // Static variable
    static int staticVariable = 0;

    // Instance variable
    int instanceVariable;

    // Constructor to initialize instance variable
    public StaticVariables(int value) {
        instanceVariable = value;
    }

    // Static method
    public static void staticMethod() {
        System.out.println("This is a static method.");
        // Accessing static variable within a static method
        System.out.println("Static Variable: " + staticVariable);
    }

    // Instance method
    public void instanceMethod() {
        System.out.println("This is an instance method.");
        // Accessing instance variable within an instance method
        System.out.println("Instance Variable: " + instanceVariable);
        // Accessing static variable within an instance method
        System.out.println("Static Variable: " + staticVariable);
    }

    public static void main(String[] args) {
        // Create objects of the class
        StaticVariables obj1 = new StaticVariables(10);
        StaticVariables obj2 = new StaticVariables(20);

        // Accessing static variable through the class
        System.out.println("Static Variable via class: " + StaticVariables.staticVariable);

        // Accessing static variable through an object (not recommended)
        System.out.println("Static Variable via object (not recommended): " + obj1.staticVariable);

        // Modifying static variable
        StaticVariables.staticVariable = 100;

        // Calling static method through the class
        StaticVariables.staticMethod();

        // Calling instance method through an object
        obj1.instanceMethod();
        obj2.instanceMethod();
    }
}
