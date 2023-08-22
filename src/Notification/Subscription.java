package Notification;

import java.util.ArrayList;
import java.util.List;


public class Subscription {
    private String clientName;
    private List<String> notificationTypes = new ArrayList<>();

    public Subscription(String clientName) {
        this.clientName = clientName;
    }

    public void addNotificationType(String type) {
        notificationTypes.add(type);
    }

    public void showSubscribedTypes() {
        System.out.println(getClientName() + " is subscribed to: " + String.join(", ", getNotificationTypes()));
    }

    public String getClientName() {
        return clientName;
    }

    public List<String> getNotificationTypes() {
        return notificationTypes;
    }
}
