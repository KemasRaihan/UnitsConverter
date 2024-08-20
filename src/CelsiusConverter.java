public class CelsiusConverter implements TemperatureConverter{
    public CelsiusConverter(){}
    public float convertToCelsius(float amount){return amount;}
    public float convertToFahrenheit(float amount){return ((amount * (9f/5f)) + 32f); }
    public float convertToKelvin(float amount){return amount + 273.15f;}
}
