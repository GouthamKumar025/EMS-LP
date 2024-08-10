import java.util.HashMap;
import java.util.Scanner;

public class UpdateEmployee {

    public void updateDetails(Employee_manage em){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the employee id: ");
        int id = in.nextInt();

        if(em.employeeMap.containsKey(id)){
            in.nextLine();

            System.out.println("Enter the name (if not press enter): ");
            String name = in.nextLine();

            System.out.println("Enter the department (if not press enter): ");
            String dept = in.nextLine();

            System.out.println("Enter the position (if not press enter): ");
            String pos = in.nextLine();

            System.out.println("Enter the salary (if not press enter): ");
            double salary = in.nextDouble();


            EmployeeDetails ed = em.employeeMap.get(id);
            if(!name.isEmpty()) ed.setEmployee_name(name);
            if(!dept.isEmpty()) ed.setDepartment(dept);
            if(!pos.isEmpty()) ed.setPosition(pos);
            if(salary > 0) ed.setSalary(salary);

            System.out.println("Employee details updated successfully!");
            for(EmployeeDetails e: em.employee_details){
                System.out.println("Employee_id: " + e.getEmployee_id());
                System.out.println("Employee_name: " + e.getEmployee_name());
                System.out.println("Department: " + e.getDepartment());
                System.out.println("Position: " + e.getPosition());
                System.out.println("Salary: " + e.getSalary());
            }
        }
        else{
            System.out.println("Employee Id not found");
        }


    }
}
