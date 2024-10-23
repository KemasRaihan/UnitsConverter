public class PoundsConverter implements WeightConverter{
    @Override
    public float convertToGrams(float amount){return amount * 453.592f;}
    @Override
    public float convertToKilograms(float amount){return amount * 0.453592f;}
    @Override
    public float convertToMilligrams(float amount){return amount * 453592f;}
    @Override
    public float convertToPounds(float amount){return amount;}
}
