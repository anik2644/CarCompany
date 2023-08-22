import 'Notification.dart';
import 'Subscription.dart';

class NotificationSystem {
  List<Subscription> subscriptions = [];

  void subscribe(Subscription subscription) {
    subscriptions.add(subscription);
  }

  void notifySubscribers(Notification notification) {
    for (var subscription in subscriptions) {
      if (subscription.notificationTypes.contains(notification.type)) {
        print("Sending ${notification.type} notification to ${subscription.clientName}: ${notification.content}");
      }
    }
  }
}