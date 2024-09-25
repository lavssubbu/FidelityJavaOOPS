import java.util.Scanner;

public class loopsamp {
    public static void main(String[] args) {

       for(int i=0;i<5;i++)
        {
            if(i==2)
               // break;//stops the entire iteration
               continue;//stops the cuurent interation
            System.out.println("The value of i:"+i);
        }
       //scope - lifetime
        int i=5;
        while(i<5) //Entry controlled loop
        {
            System.out.println("The value of i:"+i);
            i++;
        }
        //i=10;
        //do-while -Exit Controlled loop
        do {
            System.out.println("The value of i:"+i);
        }while(i<5);

        //switch case - multiple choices -select the choice based on the condition
        System.out.println("Enter the mark");
        Scanner sc=new Scanner(System.in);
        int mark=sc.nextInt();

        //else if ladder
        if(mark>90)
        {
            System.out.println("A1 Grade");
        }
        else if(mark>80 && mark<=90)
        {
            System.out.println("A Grade");
        }
        else if(mark>70 && mark<=80)
        {
            System.out.println("B Grade");
        }
        else if(mark<=70)
        {
            System.out.println("Not Cleared");
        }
        System.out.println("Enter the Grade");
        String grade=sc.next();
        switch(grade)
        {
            case "A1":
                System.out.println("Excellent");
                break;
            case "A":
                System.out.println("Very Good");
                break;
            case "B":
                System.out.println("Good");
                break;
            default:
                System.out.println("You have not secured valid grade!! Do well next time");
                break;

        }
    }
}
