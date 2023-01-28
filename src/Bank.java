public class Bank {
    protected int totalMoney;
    public static int totalPerson;

    public Bank(int totalMoney) {
        this.totalMoney = totalMoney;
        totalPerson++;
    }


    public void deposit(int Money){
        totalMoney += Money;
    }
    public void withdraw(int Money){
        totalMoney -= Money;
    }

}
