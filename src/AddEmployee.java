import java.util.Scanner;

abstract class AddEmployees {
    abstract void addEmployee(Employee_manage em);
}

class AddEmployee extends AddEmployees{
    @Override
    void addEmployee(Employee_manage em) {
        Scanner in = new Scanner(System.in);
        int id = in.nextInt();
        in.nextLine();
        String name = in.nextLine();
        String dept = in.nextLine();
        String position = in.nextLine();
        double salary = in.nextDouble();

        // setting the input values to the constructor
        EmployeeDetails ed = new EmployeeDetails(id,name,dept,position,salary);

        //calling the employee_details arraylist which is present in the employee_manage class
        em.employee_details.add(ed);
        em.employeeMap.put(id,ed);

        System.out.println("Employee details added successfully...");

        for(EmployeeDetails e: em.employee_details){
            System.out.println("Employee_id: " + e.getEmployee_id());
            System.out.println("Employee_name: " + e.getEmployee_name());
            System.out.println("Department: " + e.getDepartment());
            System.out.println("Position: " + e.getPosition());
            System.out.println("Salary: " + e.getSalary());
        }
    }
}
