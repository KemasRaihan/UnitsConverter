public class EurosConverter implements CurrencyConverter {
    public EurosConverter(){
    }

    @Override
    public double convertToDollars(double amount){
        return amount * 1.09;
    }

    @Override
    public double convertToSterling(double amount){
        return amount * 0.86;
    }

    @Override
    public double convertToEuros(double amount){
        return amount;
    }

}
