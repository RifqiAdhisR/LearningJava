import java.util.Scanner;

public class Solution2 {
    public static void main(String args[]) {
        Scanner reader = new Scanner(System.in);

        System.out.print("Enter the maximum number: ");
        int maxNumber = reader.nextInt();

        System.out.println("Bilangan Genap:");
        for (int i = 2; i <= maxNumber; i += 2) {
            System.out.print(i + " ");
        }
        System.out.println();

        System.out.println("Bilangan Ganjil:");
        for (int i = 1; i <= maxNumber; i += 2) {
            System.out.print(i + " ");
        }
        System.out.println();

        System.out.println("Bilangan Prima:");
        for (int num = 2; num <= maxNumber; num++) {
            if (isPrime(num)) {
                System.out.print(num + " ");
            }
        }
    }

    // Fungsi untuk memeriksa apakah sebuah bilangan prima
    public static boolean isPrime(int num) {
        if (num < 2) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}
