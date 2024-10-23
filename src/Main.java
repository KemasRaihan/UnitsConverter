import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println();
        //CurrencyConverterManager.Menu();
        String option;
        do{
            Scanner input = new Scanner(System.in);
            System.out.println("-------------------");
            System.out.println("Units Converter");
            System.out.println("-------------------");
            System.out.println("1. Distance Converter");
            System.out.println("2. Temperature Converter");
            System.out.println("3. Weight Converter");
            System.out.println("0. To Quit");
            System.out.print("Select an option: ");

            option = input.next();
        }while(option!="0");


    }


}