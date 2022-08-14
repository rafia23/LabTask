
package labday10;

//mport java.util.Scanner;

public class TestEmployee {
    public static void main(String[] args) {
        
       //
        PartTimeEmployee pt = new PartTimeEmployee("Rahim",23,"253 Wall Street","ECE","Engineer",5,1200);
        System.out.println("Salary of part time employee: "+pt.salary());
        FullTimeEmployee ft = new FullTimeEmployee("Karim",24,"183 Wolf Street","ECE","Engineer",15000,25);
        System.out.println("Salary of full time employee: "+ft.salary());
    }
}
