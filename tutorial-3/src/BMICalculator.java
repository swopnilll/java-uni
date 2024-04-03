import java.util.Scanner;

public class BMICalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your weight in kilograms: ");
        double weight = scanner.nextDouble();

        System.out.print("Enter your height in meters: ");
        double height = scanner.nextDouble();

        double bmi = calculateBMI(weight, height);

        System.out.println("Your BMI is: " + bmi);

        String healthAssessment = assessHealth(bmi);

        System.out.println("Your health assessment is: " + healthAssessment);

        scanner.close();
    }

    public static double calculateBMI(double weight, double height) {
        return weight / (height * height);
    }

    public static String assessHealth(double bmi) {
        String healthAssessment;
        if (bmi < 18.5) {
            healthAssessment = "Underweight";
        } else if (bmi >= 18.5 && bmi < 25) {
            healthAssessment = "Normal weight";
        } else if (bmi >= 25 && bmi < 30) {
            healthAssessment = "Overweight";
        } else {
            healthAssessment = "Obese";
        }
        return healthAssessment;
    }
}
