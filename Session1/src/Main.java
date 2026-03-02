import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // --- 1. PRIMITIVE DATATYPES ---
        // Stored directly in memory (Stack)
        int x = 3;               // 32-bit whole number
        float y = 4.99F;         // 32-bit decimal (requires 'F')
        double z = 4.231312;     // 64-bit decimal (standard for math)
        char n = 'c';            // 16-bit Unicode character (not 8-bit in Java!)
        short r = 3;             // 16-bit whole number
        boolean isTrue = false;  // 1-bit (true/false)
        final int PI = 4;        // 'final' makes it a constant (cannot change)

        // --- 2. NON-PRIMITIVE (REFERENCE) DATATYPES ---
        // Complex objects or collections
        int[] t = {1, 2, 3, 4, 5};   // Array with predefined values
        int[] s = new int[5];        // Empty array with size 5

        // --- 3. NAMING CONVENTIONS ---
        int $x = 2;   // Valid but not recommended
        int _x = 2;   // Valid
        int age = 20; // Recommended (camelCase)

        // --- 4. TYPE CASTING ---
        // Widening (Implicit): float to double happens automatically
        // Narrowing (Explicit): double to float requires manual casting
        double o = 4.23233213123213321;
        float k = (float) o;

        // --- 5. OPERATORS ---
        // Arithmetic
        int sum = 10 + 5;
        int diff = 10 - 5;
        int prod = 10 * 5;
        int quot = 10 / 5;
        int mod = 29 % 3; // Remainder operator (result: 2)

        // Comparison (Returns Boolean)
        boolean check = (x == 3); // Equality
        // Others: !=, >, <, >=, <=

        // Logical
        // && (AND), || (OR), ! (NOT)

        // Assignment / Shorthand
        x++;      // x = x + 1
        y /= 5;   // y = y / 5

        // --- 6. INPUT & OUTPUT ---
        Scanner sc = new Scanner(System.in);

        // Inputting Numbers
        System.out.print("Enter your age: ");
        int age2 = sc.nextInt();

        // IMPORTANT: Consume the leftover newline character
        // so the next 'nextLine()' doesn't skip!
        sc.nextLine();

        // Inputting Strings
        System.out.print("Enter your name: ");
        String name1 = sc.nextLine();

        System.out.println("Hello " + name1 + ", age " + age2);

        sc.close(); // Always close your scanner to prevent memory leaks


        // --- 7. CONDITIONS ---
        // Use if/else for ranges or complex logic
        if (x > 20) {
            System.out.println("Greater than 20");
        } else if (x == 10) {
            System.out.println("Exactly 10");
        } else {
            System.out.println("Something else");
        }

        // Use switch for discrete, single-value matches
        switch (x) {
            case 10: System.out.println("Matched 10"); break;
            default: System.out.println("No match");
        }

        // --- 8. LOOPING ---
        // For: When you know the number of iterations
        for (int i = 0; i < 5; i++) {
            if (i == 3) continue; // Skip the rest of this turn
            System.out.println("Count: " + i);
        }

        // While: When you repeat based on a condition
        int j = 0;
        while (j < 5) {
            System.out.println(j);
            j++;
            if (j == 4) break; // Exit the loop entirely
        }
    }
}