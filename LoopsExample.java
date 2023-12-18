public class LoopsExample {
    public static void main(String[] args) {
        // If-Else Statement
        int number = 10;

        if (number > 0) {
            System.out.println("Number is positive.");
        } else if (number < 0) {
            System.out.println("Number is negative.");
        } else {
            System.out.println("Number is zero.");
        }

        // For Loop
        System.out.println("\nFor Loop:");
        for (int i = 1; i <= 5; i++) {
            System.out.println("Iteration " + i);
        }

        // While Loop
        System.out.println("\nWhile Loop:");
        int counter = 0;
        while (counter < 5) {
            System.out.println("Counter: " + counter);
            counter++;
        }

        // Do-While Loop
        System.out.println("\nDo-While Loop:");
        int doWhileCounter = 0;
        do {
            System.out.println("Do-While Counter: " + doWhileCounter);
            doWhileCounter++;
        } while (doWhileCounter < 5);

        // Break Statement
        System.out.println("\nBreak Statement:");
        for (int i = 1; i <= 10; i++) {
            if (i == 6) {
                System.out.println("Breaking the loop at i = 6");
                break;
            }
            System.out.println("Iteration " + i);
        }

        // Continue Statement
        System.out.println("\nContinue Statement:");
        for (int i = 1; i <= 5; i++) {
            if (i == 3) {
                System.out.println("Skipping iteration at i = 3");
                continue;
            }
            System.out.println("Iteration " + i);
        }
    }
}
