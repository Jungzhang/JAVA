import java.util.Date;

/**
 * Created by zhanggen on 15-10-23.
 * Practice : 8.7
 */
public class Chapter8 {
    public static void main(String args[]){
        Account jung = new Account();
        jung.Account(1122, 20000);
        jung.updataRate(4.5);
        if (jung.withDraw(2500)){
            System.out.println("Withdrawal success!");
        }
        else {
            System.out.println("The balance of this account is not enough!");
        }
        if (jung.deposit(3000)){
            System.out.println("Save money success!");
        }
        else {
            System.out.println("Input Error!");
        }
        System.out.println("balance is " + jung.selectBalance());
        System.out.println("The monthly rate is " + jung.getMonthlyInterestRate() + "%");
        System.out.println("The create date is " + jung.selectCreatDate());
    }
}

class Account{

    private int id;     //账户ID
    private double balance;     //账户余额
    private double annualInterestRate;  //利率
    private Date dateCreated = new Date();   //开户日期

    //初始账户
    void Account(){
        this.id = 0;
        this.balance = 0;
        this.annualInterestRate = 0;
    }

    //创建一个带有指定ID和指定余额的账户
    void Account(int newId, double newBalance){
        this.id = newId;
        this.balance = newBalance;
    }

    //获取账户ID
    int selectId(){
        return this.id;
    }

    //修改账号ID
    void updataId(int newId){
        this.id = newId;
    }

    //获取账户余额
    double selectBalance(){
        return this.balance;
    }

    //修改账户余额
    void updataBalance(double newBlance){
        this.balance = newBlance;
    }

    //获取账户的利率
    double selectReat(){
        return this.annualInterestRate;
    }

    //修改账户利率
    void updataRate(double newRate){
        this.annualInterestRate = newRate;
    }

    //获取账户创建时间
    Date selectCreatDate(){
        return this.dateCreated;
    }

    //获取月利率
    double getMonthlyInterestRate(){
        return annualInterestRate / 1200;
    }

    //从账户提取特定数额
    boolean withDraw(double money){
        if (money <= this.balance){
            this.balance -= money;
            return true;
        }
        else {
            return false;
        }
    }

    //向账户中存入特定数额的钱数
    boolean deposit(double money){
        if (money < 0){
            return false;
        }
        else {
            this.balance += money;
            return true;
        }
    }
}