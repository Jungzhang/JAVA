import java.util.Scanner;

/**
 * Created by zhanggen on 15-9-24.
 * Practice 4.22
 */
public class Practice {
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);
        System.out.print("Loan Amount ： ");
        int loan = input.nextInt();
        System.out.print("Number of Years : ");
        int year = input.nextInt();
        System.out.print("Annual Interest Rate : ");
        double rate = input.nextDouble();
        double monthInterestRate = rate / 1200;
        double MonthPayment = (loan * monthInterestRate) / (1 - (1 / Math.pow(1 + monthInterestRate, year * 12)));
        double total = MonthPayment * year * 12;
        double balance = loan;
        double interest,principal;
        System.out.println("Monthly Payment : " + String.format("%.2f", MonthPayment));
        System.out.println("Total Payment : " + String.format("%.2f",total));
        System.out.println("Payment#" + "\t" + "Interest" + "\t" + "Principal" + "\t" + "Balance");
        for (int i = 1; i <= year * 12; i++){
            interest = monthInterestRate * balance;
            principal = MonthPayment - interest;
            balance = balance - principal;
            System.out.println(i + "\t\t\t" + String.format("%.2f",interest) + "\t\t" + String.format("%.2f",principal) + "\t\t" + String.format("%.2f",balance));
        }
    }
}
