import java.util.Scanner;

public class Solution3 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = reader.nextInt();

        if (num < 0) {
            System.out.println("Bilangan negatif");
        } else if (num == 0) {
            System.out.println("Nol");
        } else {
            if (isPrime(num)) {
                System.out.println(num + " adalah bilangan prima.");
            }

            if (num % 2 == 0) {
                System.out.println(num + " adalah bilangan genap.");
            } else {
                System.out.println(num + " adalah bilangan ganjil.");
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
