package creational.prototype;

import java.util.List;

public class PrototypeRunner {
    public static void main(String[] args) throws CloneNotSupportedException {
        Employees employees = new Employees();
        employees.loadData();

        Employees newEmployee = (Employees) employees.clone();
        Employees newEmployee2 = (Employees) employees.clone();
        List<String> list = newEmployee.getEmployeesList();
        list.add("Victor");
        List<String> list2 = newEmployee2.getEmployeesList();
        list2.remove("Vlad");

        System.out.println("employees List: " + employees.getEmployeesList());
        System.out.println("newEmployee List: " + list);
        System.out.println("newEmployee2 List: " + list2);
    }
}
