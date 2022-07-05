
package labday7;

import java.util.Scanner;
 
public class String1 {
 
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String str = input.nextLine();
        int x = countVowels(str);
        System.out.println("Number of vowels: "+x);
        
    }
    
    public static int countVowels(String s)
    {
        int count = 0;
        for(int i=0 ;i<s.length(); i++)
        {
            if(s.charAt(i)=='a' || s.charAt(i)=='e' || s.charAt(i)=='i' || s.charAt(i)=='o' || s.charAt(i)=='u')
                count++;
        }
     return count;
    }
}
