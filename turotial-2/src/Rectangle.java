public class Rectangle {

    public static void main(String[] args){
        double length = Double.parseDouble(args[0]);
        double width = Double.parseDouble(args[1]);

        System.out.println("Area of rectangle is " +length * width);

        System.out.println("Perimeter of rectangle is " +(length + width)*2);

        System.out.println("Length of Diagonal is " +Math.sqrt(Math.pow(length, 2) + Math.pow(width, 2)));

    }

}
