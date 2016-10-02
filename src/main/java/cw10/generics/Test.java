package cw10.generics;

public class Test {
    public static void main(String[] args) {
        EmployeeDAO dataSource = new EmployeeDataBaseDaoImpl();

        for (Employee employee : dataSource.getAll()) {
            System.out.println(employee);
        }

//      <E>              invariance
//      <E extends B>    covariance
//      <E super B>      contravariance

//        A
//        |
//        B
//        |
//        C
    }
}
