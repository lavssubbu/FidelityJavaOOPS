public class AccountMain {
    public static void main(String[] args) {
        Account acc=new Account(10,"Shree",50000);
        acc.Display();
        acc.Deposit(2000);
        acc.Display();
        acc.Withdraw(70000);
        acc.Display();
    }
}
