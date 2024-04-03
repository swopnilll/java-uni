public class Circle {

    public double getArea(double radius){

        if(radius < 0 ){
            System.out.println("Please enter positive value of radius");

            return -1;
        }

        return (double) 22 /7 * radius * radius;

    }
}
