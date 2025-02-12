import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int birthMonth = 0;


        System.out.print("Enter your birth month (1-12): ");


        if (in.hasNextInt()) {
            birthMonth = in.nextInt();


            if (birthMonth >= 1 && birthMonth <= 12) {
                System.out.println("Your birth month is: " + birthMonth);
            }
            else
            {

                System.out.println("You entered an incorrect month value: " + birthMonth);
            }

        }
        else
        {

            String trash = in.next(); // Read the invalid input
            System.out.println("Invalid input: " + trash);
            System.out.println("Please enter a valid number between 1 and 12.");
        }


        in.close();
    }
}
