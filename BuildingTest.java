
package labday8;

import java.util.Scanner;
 
public class BuildingTest {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        System.out.println("Enter no. of floors: ");
        int f1 = input.nextInt();
        System.out.println("Enter no. of flats: ");
        int f2 = input.nextInt();
        System.out.println("Enter no. of doors: ");
        int d = input.nextInt();
  
        Building b = new Building();
        b.set_number_of_floors(f1);
        b.set_number_of_flat(f2);
        b.set_number_of_doors_per_flat(d);
        
        System.out.println("No. of floors: "+b.get_floors());
        System.out.println("No. of floors: "+b.get_flats());
        System.out.println("No. of floors: "+b.get_number_of_doors_per_flat());
        b.calculate_total_number_of_door_in_building();
        
    }
    
}
