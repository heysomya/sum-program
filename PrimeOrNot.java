import java.util.Scanner;

public class PrimeOrNot {
    public static boolean isPrime(int num) {
        // Numbers less than or equal to 1 are not prime
        if (num <= 1) {
            return false;
        }

        // 2 is the only even prime number
        if (num == 2) {
            return true;
        }

        // Even numbers greater than 2 are not prime
        if (num % 2 == 0) {
            return false;
        }

        // Check for divisibility from 3 up to the square root of the number,
        // incrementing by 2 to only check odd divisors
        for (int i = 3; i * i <= num; i += 2) {
            if (num % i == 0) {
                return false; // Found a divisor, so it's not prime
            }
        }

        return true; // No divisors found, so it's prime
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number to check if it's prime: ");
        int number = scanner.nextInt();

        if (isPrime(number)) {
            System.out.println(number + " is a prime number.");
        } else {
            System.out.println(number + " is not a prime number.");
        }

        scanner.close();
    }
}
