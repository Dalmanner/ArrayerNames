import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("How many names do you want to enter? ");
        int numNames = sc.nextInt();
        sc.nextLine(); // Consume the newline character

        String[] allNames = new String[numNames]; // Create an array to store the names

        System.out.println("Enter the names:");

        for (int i = 0; i < numNames; i++) {
            allNames[i] = sc.nextLine();
        }

        // Print all the names forwards and backwards
        System.out.println("You have entered the following names:");
        for (int i = 0; i < numNames; i++) {
            System.out.println("Forward: " + allNames[i]);
            System.out.println("Backward: " + reverseString(allNames[i]));
        }
    }

    // Function to reverse a string
    public static String reverseString(String str) {
        StringBuilder reversed = new StringBuilder();
        for (int i = str.length() - 1; i >= 0; i--) {
            reversed.append(str.charAt(i));
        }
        return reversed.toString();
    }
}

