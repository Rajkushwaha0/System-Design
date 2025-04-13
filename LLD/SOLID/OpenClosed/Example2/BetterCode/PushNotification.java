package LLD.SOLID.OpenClosed.Example2.BetterCode;

public class PushNotification implements Notification{
    @Override
    public void send() {
        System.out.println("Sending Push notification...");
    }
}
