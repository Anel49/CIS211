
public class Quadratic {
    public static void main(String[] args) {
        double a = 4;
        double b = 8;
        double c = 3;
        double sumprod;
        double x;
        double y;

        // sumprod is the sum/product when plugging in the above variables
        sumprod = Math.sqrt(Math.pow(b, 2.0) - (4.0 * a * c));
        
        // calculates the root(s), if any, of both pos and neg sumprod
        if (sumprod > 0){
            x = ((-b + sumprod) / (2.0 * a));
            y = ((-b - sumprod) / (2.0 * a));
            if (x > y){
                System.out.println("The two roots are: " + y + " and " + x );
            }
            else {
                System.out.println("The two roots are: " + x + " and " + y );
            }
        }        
        else if (sumprod == 0.0){
            x = -b / (2.0 * a);
            System.out.println("The root is: " + x);
        }        
        else {
            System.out.println("Zero roots: No real roots");
        }
    }
}