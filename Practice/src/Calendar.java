import java.util.Scanner;

/**
 * Created by zhanggen on 15-9-25.
 * Practice 4.29
 */
public class Calendar {

    public static void main(String args[]){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter year : ");
        int year = input.nextInt();
        int flag = 0;
        System.out.print("Enter first day of the year(1-7) : ");
        if ((year % 400 == 0) || (year % 4 == 0 && year % 100 != 0)){
            flag = 1;
        }
        int day = input.nextInt();
        if (day > 7 || day < 1){
            System.out.println("Input Error");
            System.exit(-1);
        }
        int week = day;
        for (int i = 1; i <= 12; i++){
            int DayNum = 0;
            System.out.print("\n");
            switch(i) {
                case 1:
                    DayNum = 31;
                    System.out.println("\tJanuary " + year);
                    break;
                case 2:
                    if (flag == 1)
                        DayNum = 29;
                    else
                        DayNum = 28;
                    System.out.println("\tFebruary " + year);
                    break;
                case 3:
                    DayNum = 31;
                    System.out.println("\t" + "March " + year);
                    break;
                case 4:
                    DayNum = 30;
                    System.out.println("\t" + "April " + year);
                    break;
                case 5:
                    DayNum = 31;
                    System.out.println("\t" + "May " + year);
                    break;
                case 6:
                    DayNum = 30;
                    System.out.println("\t" + "June " + year);
                    break;
                case 7:
                    DayNum = 31;
                    System.out.println("\t" + "July " + year);
                    break;
                case 8:
                    DayNum = 31;
                    System.out.println("\t" + "August " + year);
                    break;
                case 9:
                    DayNum = 30;
                    System.out.println("\t" + "September " + year);
                    break;
                case 10:
                    DayNum =31;
                    System.out.println("\t" + "October " + year);
                    break;
                case 11:
                    DayNum =30;
                    System.out.println("\t" + "November " + year);
                    break;
                case 12:
                    DayNum =31;
                    System.out.println("\t" + "December " + year);
                    break;
            }
            System.out.println("---------------------------------");

            System.out.print("Mon" + "\t" + "Tue" + "\t" + "Wed"
                    + "\t" + "Thu" + "\t" + "Fri" + "\t" + "Sat" + "\t" + "Sun" + "\n");
            int count = 1;
            for (int j = 1; j <= DayNum; j++){

                if (week != 1 && j == 1){
                    for (int k = 1; k <= week - 1; k++) {
                        System.out.print("\t");
                        count++;
                    }
                }
                if (count < 7) {
                    count++;
                    System.out.print(j + "\t");
                }
                else {
                    System.out.print(j + "\t");
                    count = 1;
                    System.out.print("\n");
                }
                if (++week == 8)
                    week = 1;
            }
        }
    }

}
