import java.util.Scanner;

public class Employee {
    private Name name;
    private Date date;
    private String nic;

    public Employee(){
        this.name = new Name();
        this.date = new Date();
        this.nic = "";
    }

    public Employee(Name name, Date date, String nic){
        this.name = new Name(name);
        this.date = new Date(date);
        this.nic = nic;
    }

    public String getNic(){
        return nic;
    }

    public void input(){
        Scanner scn = new Scanner(System.in);
        name.input();
        date.input();
        System.out.println("Enter NIC number: ");
        nic = scn.nextLine();

    }

    public void print(){
        name.print();
        date.print();
        System.out.println("NIC No: " + nic);
    }

}
