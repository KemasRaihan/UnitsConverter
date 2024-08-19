public class FahrenheitConverter implements TemperatureConverter{
    public FahrenheitConverter(){}
    public double convertToCelsius(double amount){return (amount-32) * (5/9) ;}
    public double convertToFahrenheit(double amount){return amount; }
    public double convertToKelvin(double amount){return ((32 * amount - 32) * (5/9) + 273.15);}
}
