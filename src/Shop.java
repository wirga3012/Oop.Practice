public class Shop {
    public double BreadPrice = 2.5;

    public String BuyBread(Account account){
        String test = " asad";

        account.WithdrawBalance(BreadPrice);

        return "Here you go. You Bought Bread";
    }
}
