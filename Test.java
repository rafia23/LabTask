
package inherit;

public class Test {
    public static void main(String[] args) {
        
        Square sq = new Square("Square",5,5);
        
        System.out.println("Name of shape: " +sq.getName());
        
        double x = sq.area();
        System.out.println("Area of square: "+x);
        
        double y = sq.perimeter();
        System.out.println("Perimeter of square: "+y);
        
        
        
    }
}
