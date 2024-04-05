package Factory_Pattern.NotificationService;

//Concrete Notification Class
public class EmailNotification implements Notification {
    @Override
    public void send(String message) {
        System.out.println("Sending Email: " + message);
    }
}

