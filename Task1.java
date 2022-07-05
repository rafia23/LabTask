
package labday7;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter upper limit: ");
        int upper = input.nextInt();
        System.out.println("Enter lower limit: ");
        int lower = input.nextInt();
        
        int x = sum(upper,lower);
        System.out.println("Sum: "+x);
    }
    
    public static int sum(int m,int n)
    {
        int sum=0;
        for(int i=m; i<=n; i++)
        {
            sum = sum+i;
        }
        return sum;
    }
}
