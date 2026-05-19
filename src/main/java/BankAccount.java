public class BankAccount {
    private String accountNumber;
    private double balance;
    private String ownerName;

    BankAccount(double balance, String ownerName) {
        this.balance = balance;
        this.ownerName = ownerName;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        if (balance >= 0) {
            this.balance = balance;
        }
    }

    public String getOwnerName() {
        return ownerName;
    }

    public void setOwnerName(String ownerName) {
        if (ownerName != "") {
            this.ownerName = ownerName;
        }
    }
}
