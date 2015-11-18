/**
 * Created by zhanggen on 15-9-18.
 * This is the fourth java(3.29)
 */

import java.util.*;

public class Circle {
    public static void main(String args[]){

        Scanner input = new Scanner(System.in);
        System.out.print("Enter circle1's x-, y-coordinates, and radius : ");
        double x1 = input.nextDouble();
        double y1 = input.nextDouble();
        double r1 = input.nextDouble();
        System.out.print("Enter circle2's x-, y-coordinates, and radius : ");
        double x2 = input.nextDouble();
        double y2 = input.nextDouble();
        double r2 = input.nextDouble();
        double l = Math.sqrt(Math.pow(x1 - x2, 2) + Math.pow(y1 - y2, 2));
        if (l <= Math.abs(r1 - r2)){
            System.out.println("circle2 is inside circle1");
        }
        else if (l <= Math.abs(r1 + r2)){
            System.out.println("circle2 overlaps circle1");
        }
        else{
            System.out.println("circle2 does not overlaps circle1");
        }

    }
}
