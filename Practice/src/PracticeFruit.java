import java.util.Date;

/**
 * Created by zhanggen on 15-11-6.
 *
 */
public class PracticeFruit {

}

class Fruit{
    private String color;
    private double size;

    public double getSize() {
        return size;
    }

    public void setSize(double size) {
        this.size = size;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }
}

class Apple extends Fruit{

    private Date creatDate;

    public Date getDate() {
        return creatDate;
    }

    public void setDate(Date date) {
        this.creatDate = date;
    }
}

class Orange{
    private String addrss;

    public String getAddrss() {
        return addrss;
    }

    public void setAddrss(String addrss) {
        this.addrss = addrss;
    }
}

class GoldenDelicious extends Apple{
    private String addrss;

    public String getAddrss() {
        return addrss;
    }

    public void setAddrss(String addrss) {
        this.addrss = addrss;
    }
}

class Macinttosh{
    private String com;

    public String getCom() {
        return com;
    }

    public void setCom(String com) {
        this.com = com;
    }
}