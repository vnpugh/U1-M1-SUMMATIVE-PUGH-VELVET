import java.util.Scanner;

public class ValidNumber {
    public static void main(String[] args) {

        System.out.println("Enter a number between 1 and 10");
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();

        //range (if statement)
        {
            if (n >= 1 && n <= 10)
                System.out.println(n);

            else //prompt (false)
                System.out.println("You must enter a number between 1 and 10, please try again.");

        }
    }
}
