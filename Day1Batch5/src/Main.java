import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
         //Output statement - printf,cout
        System.out.println("Welcome to Fidelity");

        int a = 25; //directly initialized the values
        System.out.println("The value of a is " + a);

        //Explicit conversion -
        float fl = 2.5f;

        int b= (int)fl;

        System.out.println("The value of b is " + b);

        //Get the input from the user - scanf,cin
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the name");
        String empname = sc.nextLine();
        System.out.println("Enter the name of the Organization:");
        String name = sc.next();

        System.out.println("Enter the age:");
        int age = sc.nextInt();
       if(age >18)
       {
           System.out.println("Eligible to Vote");
       }
       else {
           System.out.println("Not Eligible to Vote");
       }
        System.out.println("EmployeeName:"+empname+"Age:"+age+"Organization:"+name);


    }
}