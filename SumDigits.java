public class SumDigits {
    public static int sumDigits(int number) {
        int sum = 0;

        // calculating sum of digits
        while(number != 0) {
            sum += number%10;
            number /= 10;
        }

        // returning the sum
        return sum;
    }
}