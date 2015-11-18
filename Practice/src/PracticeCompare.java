import java.util.Scanner;

public class PracticeCompare {

    public static void main(String[] args){

        Scanner input = new Scanner(System.in);
        Comparable[] num = new Comparable[5];
        Comparable[] character = new Comparable[5];

        for (int i = 0; i < character.length; i++) {
            character[i] = input.next();
        }

        for (int i = 0; i < num.length; i++) {
            num[i] = input.nextInt();
        }

        System.out.println("Max string is " + max(character));
        System.out.println("Max integer is " + max(num));

    }

    public static Object max(Comparable[] a){

        Comparable maxObject = a[0];

        for (int i = 0; i < a.length; i++) {
            if (maxObject.compareTo(a[i]) < 0) {
                maxObject = a[i];
            }
        }

        return maxObject;
    }
}