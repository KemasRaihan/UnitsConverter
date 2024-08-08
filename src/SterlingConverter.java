import java.util.Scanner;

public class SterlingConverter implements Converter{
    public SterlingConverter(){

    }

    @Override
    public double convertToDollars(double amount){
        return amount * 1.28;

    }

    @Override
    public double convertToSterling(double amount){
        return amount;
    }

    @Override
    public double convertToEuros(double amount){
        return amount * 1.16;
    }

}
