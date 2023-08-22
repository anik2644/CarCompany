// Observer Pattern
class Subscription {
  String clientName;
  List<String> notificationTypes = [];

  Subscription(this.clientName);

  void addNotificationType(String type) {
    notificationTypes.add(type);
  }

  void showSubscribedTypes() {
    print("$clientName is subscribed to: ${notificationTypes.join(', ')}");
  }
}