import java.util.Scanner;

public class Manager extends Employee{
    private String companyCar;
    private int phone;

    public Manager(){
        super();
        this.companyCar = "";
        this.phone = 0;
    }

    public Manager(Name name, Date date, String nic, String companyCar, int phone){
        super(name, date, nic);
        this.companyCar = companyCar;
        this.phone = phone;
    }

    @Override
    public void input() {
        Scanner scn = new Scanner(System.in);
        super.input();
        System.out.println("Enter car number: ");
        companyCar = scn.nextLine();
        System.out.println("Enter phone number: ");
        phone = scn.nextInt();
    }

    @Override
    public void print() {
        super.print();
        System.out.println("Car number: " + companyCar);
        System.out.println("Phone number: " + phone);
    }
}
