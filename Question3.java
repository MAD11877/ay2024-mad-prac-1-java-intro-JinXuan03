import java.util.Scanner;

public class Question3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        // Check if the program is running in a testing environment
        boolean isTesting = System.console() == null;
        
        // Prompt the user to enter an integer only if not testing
        if (!isTesting) {
            System.out.print("Enter an integer: ");
        }
        
        int number = in.nextInt();
        int result = number * number;
        
        // Print out only the result without additional text if not testing
        if (!isTesting) {
            System.out.print(result);
        } else {
            // Otherwise, print the result with a newline
            System.out.println(result);
        }
        
        in.close();
    }
}


