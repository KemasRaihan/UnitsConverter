public class FahrenheitConverter implements TemperatureConverter{
    public FahrenheitConverter(){}
    public float convertToCelsius(float amount){return (amount-32f) * (5f/9f) ;}
    public float convertToFahrenheit(float amount){return amount; }
    public float convertToKelvin(float amount){return (convertToCelsius(amount) + 273.15f);}
}
