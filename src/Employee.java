public class Employee {
    //Properties - Data Members
   private int Empid;
   private String EmpName;
   private String Dept;
    static String OrgName = "Fidelity";//memory will be allocated for only once

    //Methods - Instance Method
   // public void Initialize(int Empid, String name, String dept)
    //Constructor - Default Constructor
    Employee()
    {
        System.out.println("Parameterless Constructor: Default");
    }
    //Constructor - Paramterized Constructor
    Employee(int Empid, String name, String dept)
    {
      this.Empid = Empid;
        EmpName = name;
        Dept = dept;
    }
    public void Display()
    {
        System.out.println("Employee ID: " + Empid+"\nEmployee Name: " + EmpName+"\nEmployee Dept: " + Dept);
    }
    //Static Method - No need of instance creation - Using Class Name,Static Method will be called
    public static void Show()
    {
        System.out.println("Organization Name: " + OrgName);
    }
}
