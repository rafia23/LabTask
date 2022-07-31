
package labday8;


public class Building {

    private int number_of_floors;
    private int number_of_flats_per_floor;
    private int number_of_doors_per_flat;  
    
    public void set_number_of_floors(int floor)
    {
        number_of_floors = floor;
    }
    
    public void set_number_of_flat(int flat)
    {
        number_of_flats_per_floor = flat;
    }
    
    public void set_number_of_doors_per_flat(int door)
    {
        number_of_doors_per_flat = door;
    }
    
    public int get_floors()
    {
        return number_of_floors;
    }
    
    public int get_flats()
    {
        return number_of_flats_per_floor;
    }
    
    public int get_number_of_doors_per_flat()
    {
        return number_of_doors_per_flat;
    }
    
    public void calculate_total_number_of_door_in_building()
    {
        int total = number_of_floors*number_of_flats_per_floor*number_of_doors_per_flat;
        System.out.println("Total no. of doors in building: "+total);
    }
    
    }
    

