/**
 * Created by zhanggen on 15-11-6.
 */
public class ParacticeTriangle {
    public static void main(String[] args){

        Triangle a = new Triangle();
        a.Triangle(1, 1.5, 1);
        a.setColor("yellow");
        a.setFilled(true);
        System.out.println("Area : " + a.getArea() + "\nPerimeter : " + a.getPerimeter() + "\n");
        System.out.println(a.toSting());
    }
}

class GeometricObject{

    private String color = "white";
    private boolean filled;
    private java.util.Date dateCreated;

    public GeometricObject(){
        dateCreated = new java.util.Date();
    }

    public GeometricObject(String color, boolean filled){
        dateCreated = new java.util.Date();
        this.color = color;
        this.filled = filled;
    }

    public String getColor(){
        return color;
    }

    public void setColor(String color){
        this.color = color;
    }

    public boolean isFilled(){
        return filled;
    }

    public void setFilled(boolean filled){
        this.filled = filled;
    }

    public java.util.Date getDateCreated(){
        return dateCreated;
    }

    public String toSting(){
        return "created on " + dateCreated + "\ncolor : " + color + " and filled: " + filled + "\n";
    }


}

class Triangle extends GeometricObject{

    private double side1,side2,side3;

    public void Triangle (double side1, double side2, double side3){
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    public void Triangle (){
        super.setColor("white");
        super.setFilled(false);
        this.side1 = 1;
        this.side2 = 1;
        this.side3 = 1;
    }

    public double getSide1(){
        return this.side1;
    }

    public double getSide2(){
        return this.side2;
    }

    public double getSide3(){
        return this.side3;
    }

    public double getArea(){

        double p = (this.side1 + this.side2 + this.side3) / 2.0;

        return Math.sqrt(p * (p - this.side1) * (p - this.side2) * (p - this.side3));
    }

    public double getPerimeter(){
        return this.side1 + this.side2 + this.side3;
    }

    public String toSting(){
        return "Triangle: side1 = " + this.side1 + "\nside2 = " + this.side2 + "\nside3 = " + this.side3
                + "\ncreated on " + super.toSting();
    }
}