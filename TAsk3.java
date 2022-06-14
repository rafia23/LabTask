
package labday3;

import java.util.Scanner;

public class TAsk3 {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        int num;
        System.out.println("Enter a day number:");
        num = input.nextInt();
        
        switch(num)
        {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
                System.out.println("Weekdays");
                break;
   
           
          case 6:
          case 7:
                System.out.println("Weekends");
                break;
         
         default:
                System.out.println("You have entered inavlid day number");
                     
        }
    }
}
