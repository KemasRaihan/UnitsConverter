public class KilogramsConverter implements WeightConverter{
    public float convertToGrams(float amount){return amount * 1000f;}
    public float convertToKilograms(float amount){return amount;}
    public float convertToMilligrams(float amount){return amount * 1000000f;}
    public float convertToPounds(float amount){return amount * 2.20462f;}
}
