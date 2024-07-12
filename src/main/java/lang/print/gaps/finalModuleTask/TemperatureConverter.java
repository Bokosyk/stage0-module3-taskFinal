package lang.print.gaps.finalModuleTask;

public class TemperatureConverter {
    public double toFahrenheit(int temperatureCelsius){
        int fahrenheit = (temperatureCelsius * 9/5) + 32;
        return fahrenheit;
    }

    public static void main(String[] args) {
        TemperatureConverter convertedTemp = new TemperatureConverter();
        System.out.println(convertedTemp.toFahrenheit(5));
    }
}
