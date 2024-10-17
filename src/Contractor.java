import java.util.Scanner;

public class Contractor extends Employee {
    private float hourRate;

    public Contractor(){
        super();
        this.hourRate = 0.00F;
    }

    public Contractor(Name name, Date date, String nic, float hourRate){
        super(name, date, nic);
        this.hourRate = hourRate;
    }

    @Override
    public void input() {
        Scanner scn = new Scanner(System.in);
        super.input();
        System.out.println("Enter hourly rate: ");
        hourRate = scn.nextFloat();
    }

    @Override
    public void print() {
        super.print();
        System.out.println("Hourly rate: " + hourRate);
    }
}
