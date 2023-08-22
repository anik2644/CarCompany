package Notification;
import java.util.ArrayList;
import java.util.List;

public class NotificationSystem {
    private List<Subscription> subscriptions = new ArrayList<>();

    public void subscribe(Subscription subscription) {
        subscriptions.add(subscription);
    }

    public void notifySubscribers(Notification notification) {
        for (Subscription subscription : subscriptions) {
            if (subscription.getNotificationTypes().contains(notification.getType())) {
                System.out.println("Sending " + notification.getType() + " notification to " + subscription.getClientName() + ": " + notification.getContent());
            }
        }
    }
}