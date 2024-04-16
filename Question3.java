import java.util.Scanner;

public class Question3 {
    public static void main(String[] args) {
        // Create a Scanner object to read input from the user
        Scanner in = new Scanner(System.in);
        
        // Prompt the user to enter an integer
        System.out.print("Enter an integer: ");
        
        // Read the integer entered by the user
        int number = in.nextInt();
        
        // Multiply the integer by itself
        int result = number * number;
        
        // Print out only the result without additional text
        System.out.print(result);
        
        // Close the Scanner object to prevent resource leak
        in.close();
    }
}

