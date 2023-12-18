public class OperatorsExample {
    public static void main(String[] args) {
        // Arithmetic Operators
        int a = 10;
        int b = 5;

        System.out.println("Addition: " + (a + b));
        System.out.println("Subtraction: " + (a - b));
        System.out.println("Multiplication: " + (a * b));
        System.out.println("Division: " + (a / b));
        System.out.println("Modulus: " + (a % b));

        // Relational Operators
        System.out.println("a > b: " + (a > b));
        System.out.println("a < b: " + (a < b));
        System.out.println("a >= b: " + (a >= b));
        System.out.println("a <= b: " + (a <= b));
        System.out.println("a == b: " + (a == b));
        System.out.println("a != b: " + (a != b));

        // Logical Operators
        boolean x = true;
        boolean y = false;

        System.out.println("x && y: " + (x && y));
        System.out.println("x || y: " + (x || y));
        System.out.println("!x: " + (!x));

        // Bitwise Operators
        int c = 5;  // Binary: 0101
        int d = 3;  // Binary: 0011

        System.out.println("c & d: " + (c & d));  // Bitwise AND
        System.out.println("c | d: " + (c | d));  // Bitwise OR
        System.out.println("c ^ d: " + (c ^ d));  // Bitwise XOR
        System.out.println("~c: " + (~c));         // Bitwise NOT
        System.out.println("c << 1: " + (c << 1)); // Left shift
        System.out.println("c >> 1: " + (c >> 1)); // Right shift

        // Assignment Operators
        int result = 0;
        result += 10; // Equivalent to result = result + 10
        System.out.println("result += 10: " + result);

        result -= 5; // Equivalent to result = result - 5
        System.out.println("result -= 5: " + result);

        result *= 2; // Equivalent to result = result * 2
        System.out.println("result *= 2: " + result);

        result /= 4; // Equivalent to result = result / 4
        System.out.println("result /= 4: " + result);

        result %= 3; // Equivalent to result = result % 3
        System.out.println("result %= 3: " + result);
    }
}
