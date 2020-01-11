package structural.proxy;

public class ProxyRunner {
    public static void main(String[] args) {
        OfficeInternetAccess access = new ProxyInternetAccess("Zaug Vlad");
        access.grantInternetAccess();
    }
}
