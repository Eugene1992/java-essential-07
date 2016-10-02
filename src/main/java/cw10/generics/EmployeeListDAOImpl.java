package cw10.generics;

import java.util.ArrayList;
import java.util.List;

public class EmployeeListDAOImpl implements EmployeeDAO {

    private List<Employee> employees = new ArrayList<>();

    @Override
    public Employee get(int id) {
        return employees.get(id);
    }

    @Override
    public List<Employee> getAll() {
        return employees;
    }

    @Override
    public void create(Employee employee) {
        employees.add(employee);
    }

    @Override
    public void delete(int id) {

    }

    @Override
    public void update(Employee employee) {

    }
}
