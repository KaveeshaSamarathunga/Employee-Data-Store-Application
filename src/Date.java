import java.util.Scanner;

public class Date {
    private int day;
    private int month;
    private int year;

    public Date(){
        this.day = 0;
        this.month = 0;
        this.year = 0;
    }

    public Date(int day, int month, int year){
        this.day = day;
        this.month = month;
        this.year = year;
    }

    public Date(Date d){
        this.day = d.day;
        this.month = d.month;
        this.year = d.year;
    }

    public void input(){
        Scanner scn = new Scanner(System.in);

        System.out.println("Enter date: ");
        System.out.println("Enter day: ");
        day = scn.nextInt();
        System.out.println("Enter month: ");
        month = scn.nextInt();
        System.out.println("Enter year: ");
        year = scn.nextInt();
    }

    public void print(){
        System.out.println("Date: " + day + "/" + month + "/" + year);
    }
}
