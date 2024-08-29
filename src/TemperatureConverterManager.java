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
                    convertFahrenheitToCelsius(input, converter = new FahrenheitConverter());
                    break;
                case "4":
                    convertFahrenheitToKelvin(input, converter = new FahrenheitConverter());
                    break;
                case "5":
                    convertKelvinToCelsius(input, converter = new KelvinConverter());
                    break;
                case "6":
                    convertKelvinToFahrenheit(input, converter = new KelvinConverter());
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
    public static void convertFahrenheitToCelsius(Scanner input, TemperatureConverter converter){
        // Prompt user to enter the amount
        System.out.print("Enter the amount (in Fahrenheit °F): ");
        float amount = input.nextFloat();

        float newAmount = converter.convertToCelsius(amount);
        System.out.println(amount + "°F" + " is " + newAmount + "°C");

    }

    public static void convertFahrenheitToKelvin(Scanner input, TemperatureConverter converter){
        // Prompt user to enter the amount
        System.out.print("Enter the amount (in Fahrenheit °F): ");
        float amount = input.nextFloat();

        float newAmount = converter.convertToKelvin(amount);
        System.out.println(amount + "°F" + " is " + newAmount + "°C");

    }

    public static void convertKelvinToCelsius(Scanner input, TemperatureConverter converter){
        // Prompt user to enter the amount
        System.out.print("Enter the amount (in Kelvin): ");
        float amount = input.nextFloat();

        float newAmount = converter.convertToCelsius(amount);
        System.out.println(amount + "K" + " is " + newAmount + "°C");

    }

    public static void convertKelvinToFahrenheit(Scanner input, TemperatureConverter converter){
        // Prompt user to enter the amount
        System.out.print("Enter the amount (in Kelvin): ");
        float amount = input.nextFloat();

        float newAmount = converter.convertToFahrenheit(amount);
        System.out.println(amount + "K" + " is " + newAmount + "°F");

    }
}
