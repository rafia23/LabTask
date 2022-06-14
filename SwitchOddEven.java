
package labday3;

import java.util.Scanner;
 
public class SwitchOddEven {
    public static void main(String[] args) {
       
    Scanner input = new Scanner(System.in);
    
    System.out.println("Enter a number: ");
    int num;
    num = input.nextInt();
    
    switch(num%2){
        
        case 0:
            System.out.println("Even");
            break;
            
        case 1:
            System.out.println("Odd");
            break;
            
        default:
            System.out.println("Error!");
    }
    
    }
}
