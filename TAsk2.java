
package labday3;

import java.util.Scanner;

public class TAsk2 {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        char grade;
        System.out.println("Enter a grade(A,B,C,D,F): ");
        grade = input.next().charAt(0);
        
        switch(grade){
            case 'A':
                System.out.println("90-100");
                break;
            
           case 'B':
                System.out.println("80-89");
                break;
                
          case 'C':
                System.out.println("70-79");
                break;
                
         case 'D':
                System.out.println("60-69");
                break;   
                
        case 'F':
                System.out.println("0-59");
                break;  
                
        default:
            System.out.println("Inavlid input");
                
        }
    }
}
