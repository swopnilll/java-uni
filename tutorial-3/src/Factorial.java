public class Factorial {
    public int getFactorial(int n){
        if(n == 1){
            return 1;
        }

        if(n == 2){
            return 2;
        }

        return n * getFactorial(n - 1);
    }

    public static void main(String[] args) {
        Factorial factorial = new Factorial();

        // Check if command line arguments are provided
        if (args.length > 0) {
            int number = Integer.parseInt(args[0]);
            System.out.println("Factorial of " + number + " is: " + factorial.getFactorial(number));
        } else {
            System.out.println("Please provide a command line argument.");
        }
    }
}
