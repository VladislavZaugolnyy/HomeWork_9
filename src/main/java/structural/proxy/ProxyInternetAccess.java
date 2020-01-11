package structural.proxy;

public class ProxyInternetAccess implements OfficeInternetAccess {
    private String employeeName;
    private RealInternetAccess realAccess;

    public ProxyInternetAccess(String employeeName) {
        this.employeeName = employeeName;
    }

    public void grantInternetAccess() {
        if (getLevel(employeeName) > 4) {
            realAccess = new RealInternetAccess(employeeName);
            realAccess.grantInternetAccess();
        } else {
            System.out.println("No Internet access granted. Your job level is below 5");
        }
    }

    public int getLevel(String name) {
        // return employee level of access
        return 9;
    }
}
