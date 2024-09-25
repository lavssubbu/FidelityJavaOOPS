import java.util.Scanner;

public class MethodSamp {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        System.out.println("Enter the radius");
        int radius = sc.nextInt();
        float areacir = Area(radius);//Method calling
        System.out.println("Area of circle:"+areacir);

        System.out.println("Enter the EmployeeName");
        String empn = sc.next();
        System.out.println("Enter the name of the Organization:");
        String name = sc.next();
        System.out.println("Enter the age:");
        int age = sc.nextInt();
        Display(empn,name,age);
    }
    //Method Definition
    public static float Area(int r)
    {
      float area = (float)Math.PI *(float) Math.pow(r,2);
        System.out.printf("Area of Circle for radius:%d is %.2f",r,area);
      return area;
    }
    public static void Display(String empname,String name,int age)
    {
        System.out.println("EmployeeName:"+empname+"\nName:"+name+"\nAge:"+age);
    }

}
