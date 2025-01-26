import java.util.Scanner;

public class BmiCalculator {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // Súly megadása határokkal
        System.out.println("Enter your weight in kg: ");
        int weight = scanner.nextInt();
        if (weight < 0 || weight > 280){
            System.out.println("Wrong weight quantity");
            scanner.close();
            return;
        }

        // Magasság megadása, cm-ben, nem fogad el double számot, így nem lehet méterben beadni a magasságot
        System.out.println("Enter your height in cm: ");
        int height = scanner.nextInt();

        // Magasságnál is a határok leszabályozása
        if (height < 0 || height > 400){
            System.out.println("Wrong height quantity");
            scanner.close();
            return;
        }

        // BMI értéke, 100.0-val lebegőpontossá tesszük az osztást, a Math.pow-val emeljük négyzetre
        double bmi = weight / Math.pow((height / 100.0), 2);
        System.out.printf("Your BMI is: %.1f \n ", bmi);

        System.out.println("\n");

        // Kategória meghatározása
        String result;

        System.out.println("Are you a man? (yes or no) ");
        String resultMan = scanner.next();

        // Rossz válaszok kizárása másik verzió, ha csak if és  else ág van
        /*if (!resultMan.equalsIgnoreCase("Yes") &&
                !resultMan.equalsIgnoreCase("No")){
            System.out.println("Wrong answer");
            return;
        }*/

        if (resultMan.equalsIgnoreCase("Yes")){
            if (bmi < 16.5) {
                result = "Severely Underweight";
            } else if (bmi >= 16.5 && bmi <= 19) {
                result = "Underweight";
            } else if (bmi > 19 && bmi <= 25.5) {
                result = "Normal";
            } else if (bmi > 25.5 && bmi <= 30.5) {
                result = "Overweight";
            } else if (bmi > 30.5 && bmi <= 35.5) {
                result = "Moderately Obese";
            } else if (bmi > 35.5 && bmi <= 36.4) {
                result = "Severely Obese";
            } else {
                result = "Morbidly Obese";
            }
        } else if (resultMan.equalsIgnoreCase("No")) {
            if (bmi < 16.0) {
                result = "Severely Underweight";
            } else if (bmi >= 16 && bmi <= 18.5) {
                result = "Underweight";
            } else if (bmi > 18.5 && bmi <= 25) {
                result = "Normal";
            } else if (bmi > 25 && bmi <= 30) {
                result = "Overweight";
            } else if (bmi >= 30 && bmi <= 35) {
                result = "Moderately Obese";
            } else if (bmi > 35 && bmi <= 40) {
                result = "Severely Obese";
            } else {
                result = "Morbidly Obese";
            }
        } else {
            System.out.println("wrong answer");
            return;
        }

        System.out.println("\n");

        //Kiértékelés kiíratása
        System.out.println("Your Category is: " + result);

        scanner.close();
    }
}
