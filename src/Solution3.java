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

    /*Logika Program:

        Program dimulai dengan mengimpor kelas Scanner dari pustaka standar Java (java.util.Scanner) untuk membaca input dari pengguna.

        Sebuah objek Scanner dibuat dengan nama reader untuk membaca input dari pengguna.

        Program mencetak pesan "Enter a number: " untuk meminta pengguna memasukkan angka.

        Angka yang dimasukkan oleh pengguna disimpan dalam variabel num menggunakan metode nextInt() dari objek reader.

        Program melakukan beberapa pengecekan kondisi berdasarkan nilai yang dimasukkan oleh pengguna:

        Jika num kurang dari 0, program mencetak "Bilangan negatif."
        Jika num sama dengan 0, program mencetak "Nol."
        Jika num lebih besar dari 0, program melakukan pengecekan lebih lanjut:
        Program memanggil fungsi isPrime(num) untuk memeriksa apakah num adalah bilangan prima atau bukan. Jika benar, program mencetak "num adalah bilangan prima."
        Program memeriksa apakah num adalah bilangan genap dengan melakukan operasi modulus (num % 2 == 0). Jika benar, program mencetak "num adalah bilangan genap." Jika tidak, program mencetak "num adalah bilangan ganjil."
        Fungsi isPrime(int num) digunakan untuk memeriksa apakah num adalah bilangan prima atau bukan. Fungsi ini berisi logika berikut:

        Jika num kurang dari 2, maka fungsi ini mengembalikan false, karena bilangan kurang dari 2 tidak dapat menjadi bilangan prima.
        Fungsi ini menggunakan perulangan for untuk mengulang dari 2 hingga akar kuadrat dari num.
        Pada setiap iterasi, fungsi memeriksa apakah num dapat dibagi oleh i tanpa sisa (num % i == 0). Jika ya, maka num bukan bilangan prima dan fungsi mengembalikan false.
        Jika setelah seluruh iterasi, tidak ada pembagian tanpa sisa yang ditemukan, maka num dianggap bilangan prima dan fungsi mengembalikan true.
        Library yang Digunakan:

        Hanya satu library yang digunakan dalam kode ini:

        java.util.Scanner: Digunakan untuk membaca input dari pengguna.
     */
