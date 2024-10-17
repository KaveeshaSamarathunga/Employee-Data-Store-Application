import java.util.Scanner;

public class Main {
    static Employee e[] = new Employee[10];
    static int employeeCount = 0;

    public static void main(String[] args) {
        int opt=0;
        do {
            mainMenu();
            opt = getOption();

            switch (opt) {
                case 1:
                    addnewEmp();
                    break;
                case 2:
                    printAll();
                    break;
                case 3:
                    printGiven();
                    break;
                default:
                    System.out.println("Invalid input");
                    break;
            }
        }while(opt !=4);
    }

    public static void mainMenu(){
        System.out.println("Employee Application");
        System.out.println("++++++++++++++++++++");
        System.out.println("1. Add new employee");
        System.out.println("2. Print all employee data");
        System.out.println("3. print given employee data");
        System.out.println("4. Exit");
    }

    public static int getOption(){
        int option;
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter a option: ");
        option = scn.nextInt();
        return option;
    }

    public static void addnewEmp(){
        int op;

        System.out.println("Add new employee");
        System.out.println("1. Full time, 2. Manager, 3. Contractor");
        op = getOption();

        switch (op){
            case 1:
                e[employeeCount] = new FulltimeEmployee();
                e[employeeCount].input();
                employeeCount++;
                break;
            case 2:
                e[employeeCount] = new Manager();
                e[employeeCount].input();
                employeeCount++;
                break;
            case 3:
                e[employeeCount] = new Contractor();
                e[employeeCount].input();
                employeeCount++;
                break;
        }

    }

    public static void printAll(){
        for(int i=0; i<employeeCount; i++){
            e[i].print();
        }
    }

    public static void printGiven(){
        String nicNo;
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter nic number: ");
        nicNo = scn.nextLine();
        for(int j=0; j<employeeCount; j++){
            if(nicNo.equals(e[j].getNic())){
                e[j].print();
            }
        }
    }
}