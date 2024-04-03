import java.util.Arrays;
import java.util.Scanner;

public class OneDimensionalArray {
    public static  double getSumOfArray(double[] array){
        double sum = 0;

        for(double element : array){
            sum = sum + element;
        }

        return sum;
    }

    public static double getAverageOfArray(double[] array){
        double sum = getSumOfArray(array);

       return sum / array.length;
    }

    public static double getMinimumValueFromArray(double[] array){
        double minimum = array[0];

        for(int i = 1; i < array.length; i++){
            if(array[i] < minimum){
                minimum = array[i];
            }
        }

        return minimum;
    }

    public static double getMaximumValueFromArray(double[] array){
    double max = array[0];

    for(double element: array){
        if(element > max){
            max = element;
        }
    }

    return max;

    }

    public static void main (String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.println("Please enter the size of an array");
        int size = sc.nextInt();

        double[] array = new double[size];

        for(int i = 0; i < size; i++){
            System.out.println("Please enter the number for " +i+ "th index");
            array[i] = sc.nextDouble();
        }

        System.out.println(Arrays.toString(array));

         double sum = getSumOfArray(array);
         System.out.println("Sum of the Array " +sum);

        double average = getAverageOfArray(array);
        System.out.println("Average of the Array " +average);

        double minimum = getMinimumValueFromArray(array);
        System.out.println("Minimum value of the Array is " + minimum);

        double maximum = getMaximumValueFromArray(array);
        System.out.println("Maximum value of the Array is " + maximum);
    }
}
