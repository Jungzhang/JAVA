/**
 * Created by zhanggen on 15-10-23.
 * Practice 8.8
 */
public class PracticeFan {
    public static void main(String[] args){

        Fan f1 = new Fan();
        Fan f2 = new Fan();

        f1.updateSpeed(f1.FAST);
        f1.updataRadius(10);
        f1.updataColor("yellow");
        f1.updateStatus(true);

        f2.updateSpeed(f2.MEDIUM);
        f2.updataRadius(5);
        f2.updataColor("blue");
        f2.updateStatus(false);

        System.out.println("f1 : " + f1.getString());
        System.out.println("f2 : " + f2.getString());

    }
}

class Fan{

    final int SLOW = 1;
    final int MEDIUM = 2;
    final int FAST = 3;

    private int speed;
    private boolean on;
    private double radius;
    String color;

    //速度访问器
    int getSpeed(){
        return this.speed;
    }

    //速度修改器
    boolean updateSpeed(int newSpeed){
        if (newSpeed == SLOW){
            this.speed = SLOW;
            return true;
        }
        else if (newSpeed == MEDIUM){
            this.speed = MEDIUM;
            return true;
        }
        else if (newSpeed == FAST){
            this.speed = FAST;
            return true;
        }
        else {
            return false;
        }
    }

    //获取状态
    boolean getStatus(){
        return this.on;
    }

    //修改状态
    void updateStatus(boolean status){
        this.on = status;
    }

    //获取半径
    double getRadius(){
        return this.radius;
    }

    //修改半径
    boolean updataRadius(double newRadius){
        if (newRadius <= 0){
            return false;
        }
        else {
            this.radius = newRadius;
            return true;
        }
    }

    //获取颜色
    String getColor(){
        return this.color;
    }

    //修改颜色
    void updataColor(String newColor){
        this.color = newColor;
    }

    //创建一个默认风扇
    void Fan(){
        this.speed = SLOW;
        this.on = false;
        this.radius = 5;
        this.color = "blue";
    }

    String getString(){

        if (this.on == true){
            String temp = "The speed is " + speed + "\n" + "The colour is " + color + "\n"
                    + "The radius is " + this.radius;
            return temp;
        }
        else {
            String temp = "Fan is off\n" + "The colour is " + color + "\n"
                    + "The radius is " + this.radius;
            return temp;
        }
    }
}
