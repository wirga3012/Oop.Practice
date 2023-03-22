public class Account {

    // Create   a    class    Account    class     with     balance
    // as     data    member.    Create     twoconstructors
    // (no argument, and two arguments) and methods to withdraw and depositbalance

    public double Balance = 0;
    public String OwnerName = "";

    public void DepositBalance(double amount) {
        Balance += amount;
    }

    public void WithdrawBalance(double amount) {
        Balance -= amount;
    }
}
