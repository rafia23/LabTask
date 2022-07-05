
package labday7;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter 4 numbers: ");
       int a = input.nextInt();
       int b = input.nextInt();
       int c = input.nextInt();
       int d = input.nextInt();
       smallest(a,b,c,d);
    }
    
    public static void smallest(int n1,int n2, int n3, int n4)
    {
        if(n1<n2 && n1<n3 && n1<n4)
            System.out.println(n1+" is the smallest number"); 
        
        else if(n2<n1 && n2<n3 && n2<n4)
            System.out.println(n2+" is the smallest number");
        
         else if(n3<n1 && n3<n2 && n3<n4)
            System.out.println(n3+" is the smallest number");
        
        else if(n4<n1 && n4<n2 && n4<n3)
             System.out.println(n4+" is the smallest number");
        
        else
            System.out.println("All numbers are equal");
        
    }
    
    
}
