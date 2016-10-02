package cw10.generics;

import java.util.List;
// CRUD
public interface EmployeeDAO {

    Employee get(int id);

    List<Employee> getAll();

    void create(Employee employee);

    void delete(int id);

    void update(Employee employee);
}
