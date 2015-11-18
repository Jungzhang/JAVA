/**
 * Created by zhanggen on 15-9-18.
 * This is the third java(3.1)
 */

import java.util.*;

public class Equation {
    public static void main(String args[]){

        Scanner input = new Scanner(System.in);
        System.out.print("Enter a,b,c : ");
        double a = input.nextDouble();
        double b = input.nextDouble();
        double c = input.nextDouble();
        if ((Math.pow(b, 2) - 4 * a * c) / (2 * a) > 0) {
            double r1 = ((-b + Math.sqrt((Math.pow(b, 2) - 4 * a * c))) / (2 * a));
            double r2 = ((-b - Math.sqrt((Math.pow(b, 2) - 4 * a * c))) / (2 * a));
            System.out.println("The roots are " + r1 + "and" + r2);
        }
        else if ((Math.pow(b, 2) - 4 * a * c) / (2 * a) == 0){
            double r1 = ((-b + Math.sqrt((Math.pow(b, 2) - 4 * a * c))) / (2 * a));
            System.out.println("The root is " + r1);
        }
        else{
            System.out.println("The equation has no real roots");
        }

    }
}
