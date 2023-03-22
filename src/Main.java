public class Main {
    public static void main(String[] args) {
        // Initialization
        Shop bradShop = new Shop();
        Account myAccount = new Account();

        // My account creation
        myAccount.OwnerName = "Virgaile";
        myAccount.Balance = 1000;

        // Interaction with functionality
        String bread = bradShop.BuyBread(myAccount);
        System.out.println(bread);
    }
}