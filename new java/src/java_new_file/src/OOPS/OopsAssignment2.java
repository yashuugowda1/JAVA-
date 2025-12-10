package OOPS;

class Employee{
    String  Emp_name = "Shiva ";
    int  Emp_id = 7892;
    int Emp_Salary= 84515;
}

public class OopsAssignment2 {
    static void main() {
        Employee obj = new Employee();
        Department_id obj2 = new Department_id();

        System.out.println("OOPS.Employee Name is : "+ obj.Emp_name+ "\nOOPS.Employee ID is : " + obj.Emp_id +"\nOOPS.Employee Salary is : "+obj.Emp_Salary);
        System.out.println("\nDepartment ID is : "+ obj2.Dept_id+ "\nDepartment Name is : " + obj2.Dept_name );

    }
}
