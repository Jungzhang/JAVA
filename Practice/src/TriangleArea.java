import java.util.Scanner;

/**
 * Created by zhanggen on 15-10-23.
 * Practice 8.10
 */
public class TriangleArea {

    public static void main(String[] args){

        QuadraticEquation s = new QuadraticEquation();
        Scanner input = new Scanner(System.in);
        System.out.print("Input a, b, c : ");
        double a = input.nextDouble();
        double b = input.nextDouble();
        double c = input.nextDouble();

        s.QuadraticEquation(a,b,c);
        if (s.getDiscriminant() >= 0){
            System.out.println("Have root(s)");
        }
        else {
            System.out.println("No root");
        }

        if (s.getDiscriminant() > 0){
            System.out.println("root1 = " + s.getRoot1());
            System.out.println("root2 = " + s.getRoot2());
        }
        else if(s.getDiscriminant() == 0){
            System.out.println("root = " + s.getRoot1());
        }
        else {
            System.out.println("no root");
        }

    }
}

class QuadraticEquation{

    private double a, b, c;

    void getA(double temp){
        this.a = temp;
    }

    void getB(double temp){
        this.b = temp;
    }

    void getC(double temp){
        this.c = temp;
    }

    void QuadraticEquation(double a1, double a2, double a3){
        getA(a1);
        getB(a2);
        getC(a3);
    }

    double getDiscriminant(){
        return this.b * this.b - (4 * this.a * this.c);
    }

    double getRoot1(){
        double temp = getDiscriminant();
        if (temp >= 0){

            double root1 = (-this.b + Math.sqrt(temp)) / (2*this.a);

            return root1;
        }
        else{
            return 0;
        }
    }

    double getRoot2(){
        double temp = getDiscriminant();

        if (temp >= 0){

            double root2 = (-this.b - Math.sqrt(temp)) / (2*this.a);

            return root2;
        }
        else {
            return 0;
        }
    }

}
