public class Customer {
    private int CustId;
    private String CustName;

    Customer(int id,String name)
    {
        CustId=id;
        CustName=name;
    }
    public void Display()
    {
        System.out.println(CustId+" "+CustName);
    }
}
