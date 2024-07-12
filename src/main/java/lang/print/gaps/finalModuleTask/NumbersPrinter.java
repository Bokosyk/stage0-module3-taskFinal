package lang.print.gaps.finalModuleTask;

public class NumbersPrinter {
    public boolean printIsPositive(int number) {
        int sum = (number + number);
        boolean result = sum >= 0;
        return result;

    }

    public static void main(String[] args) {
        NumbersPrinter printNumber = new NumbersPrinter();
        System.out.println(printNumber.printIsPositive(-9));
    }
}
