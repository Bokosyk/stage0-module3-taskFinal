package lang.print.gaps.finalModuleTask;

public class NumberReverter {
    public int revert(int number) {
        int lastDigit = 0;
        int revertedNumber = 0;
        while (number != 0) {
            lastDigit = number % 10;
            revertedNumber = revertedNumber * 10 + lastDigit;
            number = number / 10;
        }
        return revertedNumber;
    }

    public static void main(String[] args) {
        NumberReverter revertedNumber = new NumberReverter();
        System.out.println(revertedNumber.revert(489));
    }
}
