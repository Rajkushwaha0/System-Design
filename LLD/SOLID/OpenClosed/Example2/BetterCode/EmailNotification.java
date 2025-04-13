package LLD.SOLID.OpenClosed.Example2.BetterCode;

public class EmailNotification implements Notification{

    @Override
    public void send() {
        System.out.println("Sending Email...");
    }
}