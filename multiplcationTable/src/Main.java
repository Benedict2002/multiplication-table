import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Input number: ");

        int num1 = in.nextInt();
        //use for loop to calculate and print the multiplication table for the in put number
        for (int i = 0; i < 10; i++) {
            System.out.println(num1 + " X " + (i + 1) + " = " + (num1 * (i + 1)));
        }
    }
}