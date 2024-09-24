import java.util.Scanner;

public class CustomerArray {
    public static void main(String[] args) {
      Customer cust = new Customer(1,"Reshmi");
      cust.Display();
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the No: of customers to be displayed:");
        int size= sc.nextInt();

        //int[] ar = new int[2]
        Customer[] custarr = new Customer[size]; //creating an array of type Customer
        //Reading & Initializing into Customer class
        for(int i=0;i<custarr.length;i++)
        {
            System.out.println("Enter Customer id:");
            int id= sc.nextInt();
            System.out.println("Enter Customer name:");
            String name= sc.next();
            custarr[i] = new Customer(id,name);
        }
        //Displaying
        for(int i=0;i<custarr.length;i++) {
            custarr[i].Display();
        }

    }
}
