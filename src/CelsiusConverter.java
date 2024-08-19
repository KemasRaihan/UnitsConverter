public class CelsiusConverter implements TemperatureConverter{
    public CelsiusConverter(){}
    public double convertToCelsius(double amount){return amount;}
    public double convertToFahrenheit(double amount){return ((amount * (9/5)) + 32); }
    public double convertToKelvin(double amount){return amount + 273.15;}
}
