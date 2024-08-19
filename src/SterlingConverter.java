public class SterlingConverter implements CurrencyConverter {
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
