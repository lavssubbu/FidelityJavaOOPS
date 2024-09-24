import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //Create Instance/Object for Employee class
        Employee emp = new Employee();//INstance 1 - call Default constructor
//        emp.Empid =111;
//        emp.EmpName = "Anu";
//        emp.Dept = "Developer";
         Scanner sc=new Scanner(System.in);
         System.out.println("Enter EmployeeId:");
         int id = sc.nextInt();
         System.out.println("Enter EmployeeName:");
         String name = sc.next();
         System.out.println("Enter Department:");
         String dept=sc.next();
         Employee emp1 = new Employee(id,name,dept);//call Parameterized constructor
        // emp.Initialize(id, name, dept);
        emp1.Display();
        Employee.Show();

//        emp2.Empid =222;
//        emp2.EmpName = "Reshma";
//        emp2.Dept = "HR";
         System.out.println("Enter EmployeeId:");
         int eid = sc.nextInt();
         System.out.println("Enter EmployeeName:");
         String ename = sc.next();
         System.out.println("Enter Department:");
         String edept=sc.next();
         Employee emp2 = new Employee(eid,ename,edept);//instance 2
        // emp2.Initialize(eid, ename, edept);
        emp2.Display();
        Employee.Show();

    }
}