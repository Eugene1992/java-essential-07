package cw01;

/**
 * Created by evgeniy on 05/09/16.
 */
public class Test {
    public static void main(String[] args) {
        Employee employeeOne = new Employee();
        employeeOne.name = "Roma";
        employeeOne.age = 19;
        employeeOne.salary = 12000;

        Employee employeeTwo = new Employee();
        employeeOne.name = "Evgeniy";
        employeeOne.age = 23;
        employeeOne.salary = 15000;

        Employee employeeOneThree = new Employee();
        employeeOne.name = "Pasha";
        employeeOne.age = 19;
        employeeOne.salary = 17000;

        Employee[] employees = {
            employeeOne,
            employeeTwo,
            employeeOneThree
        };

        Employee richestEmployee = getRichestEmployee(employees);
        System.out.println(richestEmployee.name + " - " + richestEmployee.salary);
    }

    static Employee getRichestEmployee(Employee[] employees) {
        Employee result = employees[0];
        for (Employee employee : employees) {
            if (employee.salary > result.salary) {
                result = employee;
            }
        }
        return result;
    }
}
