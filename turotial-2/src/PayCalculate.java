public class PayCalculate {
    double numberOfHours;
    double payRate;

    final double TAX_RATE = 0.35;

    double taxCut;

    public double getPayRate(double numberOfHours, double payRate){

        return (numberOfHours * payRate) - (numberOfHours * payRate * TAX_RATE);
    }


}
