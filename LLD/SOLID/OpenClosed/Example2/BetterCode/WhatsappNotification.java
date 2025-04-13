package LLD.SOLID.OpenClosed.Example2.BetterCode;

public class WhatsappNotification implements Notification{

    @Override
    public void send() {
        System.out.println("Sending Whatsapp...");
    }
}
