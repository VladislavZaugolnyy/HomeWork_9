package behavioral.mediator;

public class MediatorRunner {
    public static void main(String[] args) {
        User vlad = new User("Vlad");
        User anton = new User("Anton");

        vlad.sendMessage("Hi! Anton!");
        anton.sendMessage("Hello! Vlad!");
    }
}
