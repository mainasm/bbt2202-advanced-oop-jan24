package Factory_Pattern.NotificationService;

public class NotificationService {
    public static void main(String[] args) {
        Notification notification = NotificationFactory.createNotification("email");
        if (notification != null) {
            notification.send("Hello! This is an email notification.");
        }

        notification = NotificationFactory.createNotification("sms");
        if (notification != null) {
            notification.send("Hello! This is an SMS notification.");
        }
    }
}
