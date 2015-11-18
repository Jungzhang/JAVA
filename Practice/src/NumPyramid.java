import java.util.Scanner;

/**
 * Created by zhanggen on 15-9-25.
 * Practice 4.19
 */
public class NumPyramid {

    public static void main(String args[]){

        Scanner input = new Scanner(System.in);
        System.out.print("Enter the n : ");
        int n = input.nextInt();
        for (int i = 1; i <= n; i++){
            for (int j = 1; j <= n-i; j++){
                System.out.print("\t");
            }
            int k = 1;
            System.out.print(k + "\t");
            for (int j = 1; j < i; j++){
                k = k * 2;
                System.out.print(k + "\t");
            }
            for (int j = 1; j < i; j++){
                k /= 2;
                System.out.print(k + "\t");
            }
            System.out.print("\n");
        }
    }
}
