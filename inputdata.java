import java.util.Scanner;

public class inputdata{
    public static void main(String args[]) {
        // Creating a Scanner object for user input
        Scanner scanner = new Scanner(System.in);

        // Integer Input
        System.out.print("Enter an Integer: ");
        int i = scanner.nextInt();
        System.out.printf("Value Entered: %d\n", i);

        // Floating-Point Input
        System.out.print("Enter a Floating-Point Number: ");
        float f = scanner.nextFloat();
        System.out.printf("Value Entered: %.2f\n", f);

        // String Input
        scanner.nextLine(); // Consume newline left-over
        System.out.print("Enter a String: ");
        String str = scanner.nextLine();
        System.out.printf("You Entered: %s\n", str);

        //Closing the Scanner
        scanner.close();
    }
}




