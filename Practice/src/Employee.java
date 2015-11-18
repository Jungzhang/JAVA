/**
 * Created by zhanggen on 15-9-18.
 * The First java(2.11)
 */

import java.util.Scanner;

public class Employee {

    public static void main(String args[]){

        Scanner input = new Scanner(System.in);
        System.out.print("Enter employee's name : ");
        String name = input.nextLine();
        System.out.print("Enter number of hours worked in a week : ");
        int weekHours = input.nextInt();
        System.out.print("Enter hourly pay rate : ");
        double rete = input.nextDouble();
        System.out.print("Enter federal tax withholding rate : ");
        double federal = input.nextDouble();
        System.out.print("Enter state tax withholding rate : ");
        double state = input.nextDouble();
        System.out.println("=============================================");
        System.out.println("name : " + name);
        System.out.println("Hours Worked : " + weekHours);
        System.out.println("Pay Rate : $" + rete);
        System.out.println("Gross Pay : $" + (rete * weekHours));
        System.out.println("Deductions : ");
        System.out.println("\tFederal Withholding(" + federal * 100 + "%) : $" + federal * rete * weekHours);
        System.out.println("\tState Withholding(" + state * 100 + "%) : $" + state * rete * weekHours);
        System.out.println("\tTotal Deduction : " + (federal * rete * weekHours + state * rete * weekHours));
        System.out.println("Net Pay : $" + ((rete * weekHours) - (federal * rete * weekHours + state * rete * weekHours)));
        System.out.println("=============================================");
    }

}
