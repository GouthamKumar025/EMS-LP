import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        Employee_manage manage = new Employee_manage();
        AddEmployee addEmployee = new AddEmployee();
        UpdateEmployee updateEmployee = new UpdateEmployee();
        Delete_employee deleteEmployee = new Delete_employee();
        ViewEmployee viewEmployee = new ViewEmployee();


        Scanner in = new Scanner(System.in);
        while (true) {
            System.out.println("********** Welcome to Employee Management Systems **********");
            System.out.println("1. Add Employees");
            System.out.println("2. Update Employees");
            System.out.println("3. Remove Employees");
            System.out.println("4. View all the Employee");
            System.out.println("5. Exit");

            int n = in.nextInt();
            switch (n) {
                case 1:
                    addEmployee.addEmployee(manage);
                    break;
                case 2:
                    updateEmployee.updateDetails(manage);
                    break;
                case 3:
                    deleteEmployee.delete_employee(manage);
                    break;
                case 4:
                    viewEmployee.view_employee(manage);
                    break;
                case 5:
                    System.out.println("Thank you");
                    in.close();
                    return;
                default:
                    System.out.println("Enter a valid value");
            }
        }
    }
}
