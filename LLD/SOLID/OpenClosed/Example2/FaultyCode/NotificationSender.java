package LLD.SOLID.OpenClosed.Example2.FaultyCode;

import java.util.List;

public class NotificationSender {

    public void sendNotifications(List<NotificationType> notificationTypes) {
        for(NotificationType type : notificationTypes) {
            if(type == NotificationType.SMS) {
                type.sendSMSNotification();;
            } else if(type == NotificationType.WHATSAPP) {
                type.sendWhatsappNotification();
            } else if(type == NotificationType.EMAIL) {
                type.sendEmailNotification();
            }
        }
    }
}