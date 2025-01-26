import java.util.Scanner;

public class ManWomanDiff {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        // Súly megadása
        System.out.println("Enter your weight in kg: ");
        int weight = scan.nextInt();

        // Magasság megadása
        System.out.println("Enter your height in meters: ");
        double height = scan.nextDouble();

        // Magasság a négyzeten
        double heightSquare = Math.pow(height, 2);
        // System.out.printf("heightSquare: %.4f \n ", heightSquare);

        System.out.println("\n");

        // BMI értéke
        double bmi = weight / heightSquare;
        System.out.printf("Your BMI is: %.1f \n ", bmi);

        // Define of the categories
        String result;

        // Nemekre bontással
        System.out.println("Are you a man? (yes or no) ");
        String resultMan = scan.next();

        if (resultMan.equalsIgnoreCase("Yes")){
            if (bmi < 16.5) {
                result = "Severely Underweight";
            } else if (bmi >= 16.5 && bmi <= 18.9) {
                result = "Underweight";
            } else if (bmi >= 19 && bmi <= 25.4) {
                result = "Normal";
            } else if (bmi >= 25.5 && bmi <= 30.4) {
                result = "Overweight";
            } else if (bmi >= 30.5 && bmi <= 35.4) {
                result = "Moderately Obese";
            } else if (bmi >= 35.5 && bmi <= 36.4) {
                result = "Severely Obese";
            } else {
                result = "Morbidly Obese";
            }
        } else {
            if (bmi < 16.0) {
                result = "Severely Underweight";
            } else if (bmi >= 16 && bmi <= 18.4) {
                result = "Underweight";
            } else if (bmi >= 18.5 && bmi <= 24.9) {
                result = "Normal";
            } else if (bmi >= 25.0 && bmi <= 29.9) {
                result = "Overweight";
            } else if (bmi >= 30.0 && bmi <= 34.9) {
                result = "Moderately Obese";
            } else if (bmi >= 35.0 && bmi <= 39.9) {
                result = "Severely Obese";
            } else {
                result = "Morbidly Obese";
            }
        }

        //Kiértékelés kiíratása
        System.out.println("Your Category is: " + result);

        scan.close();
    }
}
