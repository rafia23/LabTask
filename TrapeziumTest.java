
package exceptionhandling;

import java.util.Scanner;

public class TrapeziumTest {
    public static void main(String[] args){
        
        Scanner input = new Scanner(System.in);
        System.out.println("Enter 1st parallel side: ");
            int p1 = input.nextInt();
             System.out.println("Enter 2nd parallel side: ");
            int p2 = input.nextInt();
            System.out.println("Enter height: ");
            int h = input.nextInt();
            System.out.println("Enter the other side: ");
            int s = input.nextInt();
            
            Trapezium tr1 = new Trapezium(p1,p2,h,s);
        try{
            tr1.area(p1,p2);
            
        }
        catch(TrapeziumException e){
            System.out.println(e);
        
        }
    }
}
