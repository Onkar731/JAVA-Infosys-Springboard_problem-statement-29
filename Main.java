import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // accepting input from the user
        int number = sc.nextInt();

        // calculating sum using sumDigits() method of SumDigits class
        System.out.println(SumDigits.sumDigits(number));

        // closing resource
        sc.close();
    }
}