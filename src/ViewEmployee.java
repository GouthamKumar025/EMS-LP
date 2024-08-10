public class ViewEmployee {
    void view_employee(Employee_manage em){
        for(EmployeeDetails ed : em.employee_details){
            System.out.println("Employee_id : " + ed.getEmployee_id());
            System.out.println("Employee_name: " + ed.getEmployee_name());
            System.out.println("Department: " + ed.getDepartment());
            System.out.println("Position: " + ed.getPosition());
            System.out.println("Salary: " + ed.getSalary());
        }
    }
}
