package lang.print.gaps.finalModuleTask;

public class DigitsSumCalculator {
    public int calculateSum(int number) {
        int sum = 0;
        int lastDigit = 0;
        while (number != 0) {
            lastDigit = number % 10;
            sum += lastDigit;
            number = number / 10;
        }
        return sum;
    }

    public static void main(String[] args) {
        DigitsSumCalculator sum = new DigitsSumCalculator();
        System.out.println(sum.calculateSum(674));
    }
}
