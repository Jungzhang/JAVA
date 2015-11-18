/**
 * Created by zhanggen on 15-9-18.
 * This is the fourth java(3.29)
 */

import java.util.*;

public class Date {
    public static void main(String args[]){

        Scanner input = new Scanner(System.in);
        System.out.print("Enter year : ");
        int year = input.nextInt();
        System.out.print("Enter month(1 - 12) : ");
        int month = input.nextInt();
        System.out.print("Enter the day of the month(1 - 31) : ");
        int day = input.nextInt();
        int m = 0,q = 0;

        if (day > 31){
            System.out.println("The day is input Error");
        }
        else{
            switch (month){
                case 1:
                    m = 13;
                    year -= 1;
                    break;
                case 2:
                    m = 14;
                    year -= 1;
                    break;
                default:
                    m = month;
            }
            q = day;
            int k = year % 100;
            int j = year / 100;
            int h = (q + ((26 * (m + 1)) / 10) + k + (k / 4) + (j / 4) + 5 * j) % 7;
            String week = " ";
            switch (h){
                case 0:
                    week = "Saturday";
                    break;
                case 1:
                    week = "Sunday";
                    break;
                case 2:
                    week = "Monday";
                    break;
                case 3:
                    week = "Tuesday";
                    break;
                case 4:
                    week ="Wednesday";
                    break;
                case 5:
                    week = "Thursday";
                    break;
                case 6:
                    week = "Friday";
                    break;
            }
            System.out.println("Day of the week is monday : " + week);
        }
    }
}
