public class Account {
   private int acc_no;
   private String acc_name;
   private float amount;

    Account(int acc_no, String acc_name, float amount) {
        this.acc_no = acc_no;
        this.acc_name = acc_name;
        this.amount = amount;
    }
    void Deposit(float amt) {
        amount += amt; //amount=amount+amt
    }
    void Withdraw(float amt) {
        if(amt<amount) {
            amount -= amt; //amount=amount-amt
        }
        else {
            System.out.println("Insufficient Funds");
        }
    }
    void Display()
    {
        System.out.println("Account No: " + acc_no+"\nAccount Name:"+acc_name+"\nAccount Amount:"+amount);
    }

}
