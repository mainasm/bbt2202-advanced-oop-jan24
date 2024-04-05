package Factory_Pattern.NotificationService;

//Concrete Notification Class
public class SMSNotification implements Notification {
    @Override
    public void send(String message) {
        System.out.println("Sending SMS: " + message);
    }
}
