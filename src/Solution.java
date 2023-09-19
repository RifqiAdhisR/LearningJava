import java.util.Scanner;

public class Solution {
    public static void main(String args[])
    {
        Scanner reader = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = reader.nextInt();

        if(num % 2 == 0)
            System.out.println(num + " is Genap");
        else if (num % 2 == 1)
            System.out.println(num + " is Ganjil");
        else
            System.out.println(num + " is Prima");
    }

}