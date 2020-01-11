package creational.prototype;

import java.util.ArrayList;
import java.util.List;

public class Employees implements Cloneable {

    private List<String> employeesList;

    public Employees() {
        employeesList = new ArrayList<String>();
    }

    public Employees(List<String> list) {
        this.employeesList = list;
    }

    public void loadData() {
        employeesList.add("Vlad");
        employeesList.add("Roma");
        employeesList.add("Bohdan");
        employeesList.add("Oksana");
    }

    public List<String> getEmployeesList() {
        return employeesList;
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        List<String> temp = new ArrayList<String>(this.getEmployeesList());
        return new Employees(temp);
    }
}
