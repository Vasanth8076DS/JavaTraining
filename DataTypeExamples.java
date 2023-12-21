public class DataTypeExamples {
    public static void main(String[] args) {
        // Primitive Data Types
        byte byteValue = 127;
        short shortValue = 32767;
        int intValue = 2147483647;
        long longValue = 9223372036854775807L;

        float floatValue = 3.14f;
        double doubleValue = 3.14;

        char charValue = 'A';

        boolean booleanValue = true;

        // Reference Data Types
        String stringValue = "Hello, Java!";

        int[] numbers = {1, 2, 3, 4, 5};

        Person person1 = new Person();
        person1.name = "VASANTH";
        person1.age = 25;

        // Print Values
        System.out.println("Primitive Data Types:");
        System.out.println("byte: " + byteValue);
        System.out.println("short: " + shortValue);
        System.out.println("int: " + intValue);
        System.out.println("long: " + longValue);
        System.out.println("float: " + floatValue);
        System.out.println("double: " + doubleValue);
        System.out.println("char: " + charValue);
        System.out.println("boolean: " + booleanValue);

        System.out.println("\nReference Data Types:");
        System.out.println("String: " + stringValue);

        System.out.println("\nArray:");
        for (int number : numbers) {
            System.out.print(number + " ");
        }
        System.out.println();

        System.out.println("\nUser-Defined Type:");
        System.out.println("Person: Name - " + person1.name + ", Age - " + person1.age);
    }
}

class Person {
    public Person(String string, int i) {
    }
    String name;
    int age;
    public void displayInfo() {
    }
    public void setAge(int i) {
    }
}
