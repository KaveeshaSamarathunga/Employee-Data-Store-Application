import java.util.Scanner;

public class Name {
    private String first;
    private String middle;
    private String last;

    public Name(){
        this.first = "";
        this.middle = "";
        this.last = "";
    }

    public Name(String first, String middle, String last){
        this.first = first;
        this.middle = middle;
        this.last = last;
    }

    public Name(Name n){
        this.first = n.first;
        this.middle = n.middle;
        this.last = n.last;
    }

    public void input(){
        Scanner scn = new Scanner(System.in);

        System.out.println("Enter name: ");
        System.out.println("Enter first name: ");
        first = scn.nextLine();
        System.out.println("Enter middle name: ");
        middle = scn.nextLine();
        System.out.println("Enter last name: ");
        last = scn.nextLine();
    }

    public void print(){
        System.out.println("Full Name: " + first + " " + middle + " " + last);
    }
}
