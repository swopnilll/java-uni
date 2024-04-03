public class EvenOdd {
    public static void main(String[] args) {
         boolean isEven = Integer.parseInt(args[0]) % 2 == 0;

         if(isEven){
             System.out.println("Even Number");

         } else {
             System.out.println("odd Number");
         }
    }
}
