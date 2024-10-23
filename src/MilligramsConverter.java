public class MilligramsConverter implements WeightConverter{
    @Override
    public float convertToGrams(float amount){return amount * 0.001f;}
    @Override
    public float convertToKilograms(float amount){return amount * 0.00001f;}
    @Override
    public float convertToMilligrams(float amount){return amount;}
    @Override
    public float convertToPounds(float amount){return convertToKilograms(amount) * 2.20462f;}
}
