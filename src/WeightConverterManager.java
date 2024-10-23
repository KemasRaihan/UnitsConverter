import java.util.Scanner;

public class WeightConverterManager {
    public static void Menu(){
        String option;
        do {
            Scanner input = new Scanner(System.in);
            System.out.println("-------------------");
            System.out.println("Weight Converter");
            System.out.println("-------------------");
            System.out.println("1. Grams (g) To Kilograms (kg)");
            System.out.println("2. Grams (g) To Milligrams (mg)");
            System.out.println("3. Grams (g) To Pounds (lb)");
            System.out.println("4. Milligrams (mg) To Grams (g)");
            System.out.println("5. Milligrams (mg) To Kilograms (kg)");
            System.out.println("6. Milligrams (mg) To Pounds (lb)");
            System.out.println("7. Kilograms (kg) To Grams (g)");
            System.out.println("8. Kilograms (kg) To Milligrams (mg)");
            System.out.println("9. Kilograms (kg) To Pounds (lb)");
            System.out.println("10. Pounds (lb) To Grams (g)");
            System.out.println("11. Pounds (lb) To Kilograms (kg)");
            System.out.println("12. Pounds (lb) To Milligrams (mg)");
            System.out.println("0. To Quit");
            System.out.print("Select an option: ");

            WeightConverter converter = null;

            option = input.next();

            switch (option) {
                case "1":
                    convertGramsToKilograms(input, converter = new GramsConverter());
                    break;
                case "2":
                    convertGramsToMilligrams(input, converter = new GramsConverter());
                    break;
                case "3":
                    convertGramsToPounds(input, converter = new GramsConverter());
                    break;
                case "4":
                    convertMilligramsToGrams(input, converter = new MilligramsConverter());
                    break;
                case "5":
                    convertMilligramsToKilograms(input, converter = new MilligramsConverter());
                    break;
                case "6":
                    convertMilligramsToPounds(input, converter = new MilligramsConverter());
                    break;
                case "7":
                    convertKilogramsToGrams(input, converter = new KilogramsConverter());
                    break;
                case "8":
                    convertKilogramsToMilligrams(input, converter = new KilogramsConverter());
                    break;
                case "9":
                    convertKilogramsToPounds(input, converter = new KilogramsConverter());
                    break;
                case "10":
                    convertPoundsToGrams(input, converter = new PoundsConverter());
                    break;
                case "11":
                    convertPoundsToKilograms(input, converter = new PoundsConverter());
                    break;
                case "12":
                    convertPoundsToMilligrams(input, converter = new PoundsConverter());
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

    public static void convertGramsToMilligrams(Scanner input, WeightConverter converter){
        // Prompt user to enter the amount
        System.out.print("Enter the amount (in grams (g)): ");
        float amount = input.nextFloat();

        float newAmount = converter.convertToMilligrams(amount);
        System.out.println(amount + "g" + " is " + newAmount + "mg");

    }

    public static void convertGramsToKilograms(Scanner input, WeightConverter converter){
        // Prompt user to enter the amount
        System.out.print("Enter the amount (in grams (g)): ");
        float amount = input.nextFloat();

        float newAmount = converter.convertToKilograms(amount);
        System.out.println(amount + "g" + " is " + newAmount + "kg");

    }
    public static void convertGramsToPounds(Scanner input, WeightConverter converter){
        // Prompt user to enter the amount
        System.out.print("Enter the amount (in grams (g)): ");
        float amount = input.nextFloat();

        float newAmount = converter.convertToPounds(amount);
        System.out.println(amount + "g" + " is " + newAmount + "lbs");

    }

    public static void convertMilligramsToGrams(Scanner input, WeightConverter converter){
        // Prompt user to enter the amount
        System.out.print("Enter the amount (in milligrams (mg)): ");
        float amount = input.nextFloat();

        float newAmount = converter.convertToGrams(amount);
        System.out.println(amount + "mg" + " is " + newAmount + "g");

    }

    public static void convertMilligramsToKilograms(Scanner input, WeightConverter converter){
        // Prompt user to enter the amount
        System.out.print("Enter the amount (in milligrams (mg)): ");
        float amount = input.nextFloat();

        float newAmount = converter.convertToKilograms(amount);
        System.out.println(amount + "mg" + " is " + newAmount + "kg");

    }

    public static void convertMilligramsToPounds(Scanner input, WeightConverter converter){
        // Prompt user to enter the amount
        System.out.print("Enter the amount (in milligrams (mg)): ");
        float amount = input.nextFloat();

        float newAmount = converter.convertToPounds(amount);
        System.out.println(amount + "mg" + " is " + newAmount + "lbs");

    }

    public static void convertKilogramsToGrams(Scanner input, WeightConverter converter){
        // Prompt user to enter the amount
        System.out.print("Enter the amount (in kilograms (kg)): ");
        float amount = input.nextFloat();

        float newAmount = converter.convertToGrams(amount);
        System.out.println(amount + "kg" + " is " + newAmount + "g");

    }

    public static void convertKilogramsToMilligrams(Scanner input, WeightConverter converter){
        // Prompt user to enter the amount
        System.out.print("Enter the amount (in kilograms (kg)): ");
        float amount = input.nextFloat();

        float newAmount = converter.convertToMilligrams(amount);
        System.out.println(amount + "kg" + " is " + newAmount + "mg");

    }

    public static void convertKilogramsToPounds(Scanner input, WeightConverter converter){
        // Prompt user to enter the amount
        System.out.print("Enter the amount (in kilograms (kg)): ");
        float amount = input.nextFloat();

        float newAmount = converter.convertToPounds(amount);
        System.out.println(amount + "kg" + " is " + newAmount + "lbs");

    }

    public static void convertPoundsToGrams(Scanner input, WeightConverter converter){
        // Prompt user to enter the amount
        System.out.print("Enter the amount (in pounds (lbs)): ");
        float amount = input.nextFloat();

        float newAmount = converter.convertToGrams(amount);
        System.out.println(amount + "lbs" + " is " + newAmount + "g");

    }

    public static void convertPoundsToMilligrams(Scanner input, WeightConverter converter) {
        // Prompt user to enter the amount
        System.out.print("Enter the amount (in pounds (lbs)): ");
        float amount = input.nextFloat();

        float newAmount = converter.convertToMilligrams(amount);
        System.out.println(amount + "kg" + " is " + newAmount + "mg");
    }

    public static void convertPoundsToKilograms(Scanner input, WeightConverter converter) {
        // Prompt user to enter the amount
        System.out.print("Enter the amount (in pounds (lbs)): ");
        float amount = input.nextFloat();

        float newAmount = converter.convertToKilograms(amount);
        System.out.println(amount + "lbs" + " is " + newAmount + "kg");
    }
}
