package ClassAndObject;

public class Account {
    private int id;
    private String name;
    private int balance;

    public Account(){}

    public Account(int id, String name, int balance) {
        this.id = id;
        this.name = name;
        this.balance = balance;
    }

    public int getId() {
        return id;
    }

    public int getBalance() {
        return balance;
    }

    public String getName() {
        return name;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void credit(int amount) {
        if(amount <= 0) {
            System.out.println("Amount must be greater than 0");
        } else {
            this.balance += amount;
        }
    }

    public void debit(int mount) {
        if(mount > balance) {
            System.out.println("Unsuccess! ");
        } else {
            this.balance -= mount;
        }
    }
}


