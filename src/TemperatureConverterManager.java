import java.util.Scanner;

public class TemperatureConverterManager {
    public static void Menu(){
        String option;
        do {
            Scanner input = new Scanner(System.in);
            System.out.println("-------------------");
            System.out.println("Temperature Converter");
            System.out.println("-------------------");
            System.out.println("1. Celsius (°C) To Fahrenheit (°F)");
            System.out.println("2. Celsius (°C) To Kelvin (K)");
            System.out.println("3. Fahrenheit (°F) To Celsius (°C)");
            System.out.println("4. Fahrenheit (°F) To Kelvin (K)");
            System.out.println("5. Kelvin (K) To Celsius (°C)");
            System.out.println("6. Kelvin (K) To Fahrenheit (°F)");
            System.out.println("0. To Quit");
            System.out.print("Select an option: ");

            TemperatureConverter converter = null;

            option = input.next();

            switch (option) {
                case "1":
                    convertCelsiusToFahrenheit(input, converter = new CelsiusConverter());
                    break;
                case "2":
                    convertCelsiusToKelvin(input, converter = new CelsiusConverter());
                    break;
                case "3":
                    //convertSterlingToDollars(input, converter = new SterlingConverter());
                    break;
                case "4":
                    //convertSterlingToEuros(input, converter = new SterlingConverter());
                    break;
                case "5":
                    //convertEurosToDollars(input, converter = new EurosConverter());
                    break;
                case "6":
                    //convertEurosToSterling(input, converter = new EurosConverter());
                    break;
                case "0":
                    break;
                default:
                    System.out.println("Invalid input. Try again.");
                    break;
            }
            System.out.println();
        }while(!option.equals("0"));

    }

    public static void convertCelsiusToFahrenheit(Scanner input, TemperatureConverter converter){
        // Prompt user to enter the amount
        System.out.print("Enter the amount (in Celsius °C): ");
        float amount = input.nextFloat();

        float newAmount = converter.convertToFahrenheit(amount);
        System.out.println(amount + "°C" + " is " + newAmount + "°F");

    }

    public static void convertCelsiusToKelvin(Scanner input, TemperatureConverter converter){
        // Prompt user to enter the amount
        System.out.print("Enter the amount (in Celsius °C): ");
        float amount = input.nextFloat();

        float newAmount = converter.convertToKelvin(amount);
        System.out.println(amount + "°C" + " is " + newAmount + "°F");

    }
    public static void convertSterlingToDollars(Scanner input, CurrencyConverter converter){
        // Prompt user to enter the amount
        System.out.print("Enter the amount (in sterling): ");
        float amount = input.nextFloat();

        float newAmount = converter.convertToDollars(amount);
        System.out.println("£" + amount + " is $" + newAmount);

    }

    public static void convertSterlingToEuros(Scanner input, CurrencyConverter converter){
        // Prompt user to enter the amount
        System.out.print("Enter the amount (in dollars): ");
        float amount = input.nextFloat();

        float newAmount = converter.convertToEuros(amount);
        System.out.println("$" + amount + " is €" + newAmount);

    }

    public static void convertEurosToDollars(Scanner input, CurrencyConverter converter){
        // Prompt user to enter the amount
        System.out.print("Enter the amount (in euros): ");
        float amount = input.nextFloat();

        float newAmount = converter.convertToDollars(amount);
        System.out.println("€" + amount + " is $" + newAmount);

    }

    public static void convertEurosToSterling(Scanner input, CurrencyConverter converter){
        // Prompt user to enter the amount
        System.out.print("Enter the amount (in euros): ");
        float amount = input.nextFloat();

        float newAmount = converter.convertToSterling(amount);
        System.out.println("€" + amount + " is £" + newAmount);

    }
}
