import java.util.Scanner;

public class ArrayDemo {
    public static void main(String[] args) {
       int[] arr = new int[4];//Array declaration
        arr[0]=101;//Array INitialized
        arr[2]=201;

        String[] cities = {"Chennai","Bengaluru","Mumbai"}; //declared & initialized in the same line

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of an array");
        int size = sc.nextInt();

        int[] arr2 = new int[size];
        //Reading the values
        for(int i=0;i<arr2.length;i++)
        {
            System.out.println("Enter the value for index:"+i);
            arr2[i] = sc.nextInt();
        }
        DisplayArray(arr2);

        //Multidimensional Array - Array of array
        int[][] ar = {
                {11,12,13},
                {14,15,20,25,28},
                {10,11}
        };

        System.out.println("Length of row1:"+ar[0].length);
        System.out.println("Length of row2:"+ar[1].length);
        System.out.println("Length of row3:"+ar[2].length);

        //displaying multidimensional array
        for(int i=0;i<ar.length;i++)
        {
            for(int j=0;j<ar[i].length;j++)
            {
              System.out.print(ar[i][j]+" ");
            }
            System.out.println();
        }

    }

    public static void DisplayArray(int[] arr)
    {
      int max = arr[0];
        //display
        for(int i=0;i<arr.length;i++)
        {
            if(max<arr[i])
            {
                max = arr[i];
                System.out.println("The maximum Element"+arr[i]);
            }

        }
    }
}
