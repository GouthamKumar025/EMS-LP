public class EmployeeDetails {
    private int employee_id;
    private String employee_name;
    private String department;
    private String position;
    private double salary;

    public EmployeeDetails(int employee_id, String employee_name, String department, String position, double salary) {
        this.employee_id = employee_id;
        this.employee_name = employee_name;
        this.department = department;
        this.position = position;
        this.salary = salary;
    }

    public int getEmployee_id() {
        return employee_id;
    }

    public void setEmployee_id(int employee_id) {
        this.employee_id = employee_id;
    }

    public String getEmployee_name() {
        return employee_name;
    }

    public void setEmployee_name(String employee_name) {
        this.employee_name = employee_name;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
}
