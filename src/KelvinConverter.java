public class KelvinConverter implements TemperatureConverter{
    public KelvinConverter(){}
    public float convertToCelsius(float amount){return amount - 273.15f;}
    public float convertToFahrenheit(float amount){return convertToCelsius(amount) * (9f/5f) + 32f; }
    public float convertToKelvin(float amount){return amount;}
}
