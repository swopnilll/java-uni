public class Triangle {

    public void solution(int n){
        if(n < 0 || n > 9){
            System.out.println("Provide number between 1 to 9");
            return;
        }

        for(int i = 1; i <= n; i++){
            for(int j = 1; j <= i; j++ ){
                System.out.print("*");
            }
            System.out.println();
        }

    }

    public static void main(String[] args){

        Triangle triangle = new Triangle();

        // Check if command line arguments are provided
        if (args.length > 0) {
            int number = Integer.parseInt(args[0]);
            triangle.solution(number);
        } else {
            System.out.println("Please provide a command line argument.");
        }
    }
}
