package day4a.Bai1_6;

public class Account {
    private String id;
    private String name;
    private int balance = 0;

    public Account(String id, String name) {
        this.id = id;
        this.name = name;
    }

    public Account(String id, String name, int balance) {
        this.id = id;
        this.name = name;
        this.balance = balance;
    }

    public String getID() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getBalance() {
        return balance;
    }
    //nap tien
    public int credit(int amount){
        balance = balance + amount;
        return balance;
    }
    //tru tien
    public int debit(int amount){
        if (amount <= balance){
            balance = balance - amount;
        }
        else System.out.println("Amount exceeded balance");
        return balance;
    }
    //chuyen khoan
    public int transferTo(Account another, int amount){
        if ( this.balance < amount){
            System.out.println("Amount exceeded balance");
        }
        else {
            //tru tk hien tai
            this.balance = this.balance - amount;
            //cong tai khoan nguoi nhan
            another.balance = another.balance + amount;
        }
        return balance;
    }

    @Override
    public String toString() {
        return "Account[" +
                "id='" + id + '\'' +
                ",name='" + name + '\'' +
                ",balance=" + balance +
                ']';
    }
}
