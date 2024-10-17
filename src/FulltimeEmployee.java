import java.util.Scanner;

public class FulltimeEmployee extends Employee {
    private float salary;

    public FulltimeEmployee(){
        super();
        this.salary = 0.00F;
    }

    public FulltimeEmployee(Name name, Date date, String nic, float salary){
        super(name, date, nic);
        this.salary = salary;
    }

    @Override
    public void input() {
        Scanner scn = new Scanner(System.in);
        super.input();
        System.out.println("Enter salary amount: ");
        salary = scn.nextFloat();
    }

    @Override
    public void print() {
        super.print();
        System.out.println("Salary amount: " + salary);
    }
}
