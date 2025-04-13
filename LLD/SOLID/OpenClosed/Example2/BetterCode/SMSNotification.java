package LLD.SOLID.OpenClosed.Example2.BetterCode;

public class SMSNotification implements Notification{
    @Override
    public void send() {
        System.out.println("Sending SMS...");
    }
}