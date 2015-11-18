/**
 * Created by zhanggen on 15-9-18.
 * This is the second java(2.21)
 */

import java.util.*;

public class Area {
    public static void main(String args[]){

        Scanner input = new Scanner(System.in);
        System.out.print("Enter three points for a triangle : ");
        double x1 = input.nextDouble();
        double y1 = input.nextDouble();
        double x2 = input.nextDouble();
        double y2 = input.nextDouble();
        double x3 = input.nextDouble();
        double y3 = input.nextDouble();
        double l1 = Math.sqrt(Math.pow(y2 - y1, 2) + Math.pow(x2 - x1, 2));
        double l2 = Math.sqrt(Math.pow(y3 - y1, 2) + Math.pow(x3 - x1, 2));
        double l3 = Math.sqrt(Math.pow(y3 - y2, 2) + Math.pow(x3 - x2, 2));
        if ((l1 + l2 > l3) && (l1 + l3 > l2) && (l2 + l3 > l1)){
            double s = (l1 + l2 + l3) / 2;
            double area = Math.sqrt((s * (s - l1) * (s - l2) * (s - l3)));
            System.out.print("The area is：" + area);
        }
        else{
            System.out.println("Can not make triangle");
        }

    }
}
