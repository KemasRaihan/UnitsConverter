public class KelvinConverter {
    public KelvinConverter(){}
    public double convertToCelsius(double amount){return amount - 273.15;}
    public double convertToFahrenheit(double amount){return convertToCelsius(amount) * (9/5) + 32; }
    public double convertToKelvin(double amount){return amount;}
}
