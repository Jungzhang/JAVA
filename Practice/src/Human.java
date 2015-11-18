import java.util.Date;

/**
 * Created by zhanggen on 15-11-6.
 */
public class Human {
    public static void main(String[] args){
        MyDate date = new MyDate();
        date.setDay(1);
        date.setMonth(2);
        date.setYear(3);
        Person a = new Person();
        a.setName("aaa");
        a.setAddress("qwer");
        a.seteMail("asdasd");
        a.setPhoneNum("123");
        Student b = new Student();
        b.setClassNum(1);
        Emploee c = new Emploee();
        Faculty d = new Faculty();
        c.setOffice("qwfg");
        c.setSalary(1234);
        d.setLevel("wqer");
        d.setWorkStart(date);
    }
}

class Person {
    private String name;
    private String address;
    private String phoneNum;
    private String eMail;

    public void setName(String name) {
        this.name = name;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setPhoneNum(String phoneNum) {
        this.phoneNum = phoneNum;
    }

    public void seteMail(String eMail) {
        this.eMail = eMail;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public String getPhoneNum() {
        return phoneNum;
    }

    public String geteMail() {
        return eMail;
    }
}

class Student extends Person {
    private final int one = 1;
    private final int two = 2;
    private final int three = 3;
    private final int four = 4;
    private int classNum;

    public void setClassNum(int classNum) {
        this.classNum = classNum;
    }

    public int getClassNum() {
        return classNum;
    }
    public String toSting(){
        return "Name: " + super.getName() + "ClassName : " + getClass().getName();
    }
}

class Emploee extends Person{
    private String office;
    private double salary;
    private Date date;

    public void setOffice(String office) {
        this.office = office;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getOffice() {
        return office;
    }

    public double getSalary() {
        return salary;
    }

    public Date getDate() {
        return date;
    }
    public String toSting(){
        return "Name: " + super.getName() + "ClassName : " + getClass().getName();
    }
}

class MyDate{
    private int year;
    private int month;
    private int day;

    public void setYear(int year) {
        this.year = year;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public int getYear() {
        return year;
    }

    public int getMonth() {
        return month;
    }

    public int getDay() {
        return day;
    }
}

class Faculty extends Emploee{
    private MyDate workStart;
    private MyDate workEnd;

    public void setWorkEnd(MyDate workEnd) {
        this.workEnd = workEnd;
    }

    public MyDate getWorkEnd() {

        return workEnd;
    }

    private String level;   //级别

    public MyDate getWorkStart() {
        return workStart;
    }

    public String getLevel() {
        return level;
    }

    public void setWorkStart(MyDate workStart) {
        this.workStart = workStart;
    }

    public void setLevel(String level) {
        this.level = level;
    }

    public String toSting(){
        return "Name: " + super.getName() + "ClassName : " + getClass().getName();
    }
}

class Staff extends Emploee {
    private String titles;

    public String getTitles() {
        return titles;
    }

    public void setTitles(String titles) {

        this.titles = titles;
    }

    public String toSting(){
        return "Name: " + super.getName() + "ClassName : " + getClass().getName();
    }
}