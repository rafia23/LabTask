
package exceptionhandling;

public class Trapezium {
    
    int parallel1;
    int parallel2;
    int height;
    int otherSide;

    public Trapezium(int parallel1, int parallel2, int height, int otherSide) {
        this.parallel1 = parallel1;
        this.parallel2 = parallel2;
        this.height = height;
        this.otherSide = otherSide;
    }
    
    public void area(int parallel1,int parallel2) throws TrapeziumException {
        if(parallel1==parallel2){
        throw new TrapeziumException("parallel sides can't be equal");
    }
        else
        { 
            double area = (height*(parallel1+parallel2))*0.5;
            System.out.println("Area: "+area);
        }
}
}
