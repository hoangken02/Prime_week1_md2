import java.util.Scanner;

public class Prime {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your number");
        int number = scanner.nextInt();

        if (number < 2) {
            System.out.println("Number is not prime");
        } else {
            boolean check = true;
            for (int i = 2; i <= Math.sqrt(number); i++) {
                check = false;
            }
            if (check) {
                System.out.println(number + " is prime");
            } else {
                System.out.println(number + " is not prime");
            }
        }
    }
}
