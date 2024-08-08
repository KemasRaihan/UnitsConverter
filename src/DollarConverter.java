public class DollarConverter implements Converter{

    public DollarConverter(){

    }

    @Override
    public double convertToDollars(double amount){
        return amount;

    }

    @Override
    public double convertToSterling(double amount){
        return amount * 0.78;
    }

    @Override
    public double convertToEuros(double amount){
        return amount * 0.92;
    }



}
