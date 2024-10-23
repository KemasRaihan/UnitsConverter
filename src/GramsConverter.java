public class GramsConverter implements WeightConverter{
    public float convertToGrams(float amount){return amount;}
    public float convertToKilograms(float amount){ return amount * 0.0001f;}
    public float convertToMilligrams(float amount){return amount * 1000f;}
    public float convertToPounds(float amount){return amount * 0.0022f;}
}
