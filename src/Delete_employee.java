import java.util.Iterator;
import java.util.Scanner;

public class Delete_employee {
    void delete_employee(Employee_manage em){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the employee id: ");
        int id = in.nextInt();

        if(em.employeeMap.containsKey(id)){
            EmployeeDetails ed = em.employeeMap.remove(id);

            Iterator<EmployeeDetails> iterator = em.employee_details.iterator();
            while(iterator.hasNext()){
                EmployeeDetails employee = iterator.next();
                if(employee.getEmployee_id() == id){
                    iterator.remove();
                    break;
                }
            }
            System.out.println("Employee with ID " + id + " has been removed successfully.");
            for(EmployeeDetails e: em.employee_details){
                System.out.println("Employee_id: " + e.getEmployee_id());
                System.out.println("Employee_name: " + e.getEmployee_name());
                System.out.println("Department: " + e.getDepartment());
                System.out.println("Position: " + e.getPosition());
                System.out.println("Salary: " + e.getSalary());
            }
        }
        else{
            System.out.println("Employee with ID " + id + " is not found");
        }
    }
}
