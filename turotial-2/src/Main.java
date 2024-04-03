import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Please enter the number of hours you have worked");
        double totalHours = sc.nextDouble();

        System.out.println("Please enter your pay rate");
        double payRate = sc.nextDouble();

        PayCalculate payCalculate = new PayCalculate();

        System.out.println("Your pay after tax cut is " +payCalculate.getPayRate(totalHours, payRate));
    }
}