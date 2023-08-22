
import 'AI/AsiaAIStrategy.dart';
import 'AI/AutomatedAI.dart';
import 'Base/deceroionElement/Bumper.dart';
import 'Base/CarComponent/CarGroup.dart';
import 'Base/CarComponent/CarVariant.dart';
import 'Base/Decoration.dart';
import 'OnlineServices/MobileApplication.dart';
import 'Notification/Notification.dart';
import 'Notification/NotificationSystem.dart';
import 'OnlineServices/OnlineSystem.dart';
import 'Base/deceroionElement/RainSheild.dart';
import 'Notification/Subscription.dart';
import 'AI/USAAIStrategy.dart';


//Decorator Pattern
class Car {
  double basePrice;
  List<Decoration> decorations = [];

  Car(this.basePrice);

  void addDecoration(Decoration decoration) {
    decorations.add(decoration);
  }

  double calculateTotalPrice() {
    double totalPrice = basePrice;
    for (Decoration decoration in decorations) {
      totalPrice += decoration.cost;
    }
    return totalPrice;
  }
}

void main() {
  // Decorator Pattern
  var car = Car(20000);
  car.addDecoration(RainShield("Thick Rain Shield", 500));
  car.addDecoration(Bumper("Tight Small Bumper", 300));
  var totalCarPrice = car.calculateTotalPrice();
  print("Total Car Price: \$$totalCarPrice");

  // Strategy Pattern
  var asiaStrategy = AsiaAIStrategy();
  var usaStrategy = USAAIStrategy();

  var automatedAI = AutomatedAI(asiaStrategy);
  print(automatedAI.navigate());

  automatedAI.setStrategy(usaStrategy);
  print(automatedAI.navigate());

  // Composite Pattern
  var group = CarGroup("SUVs");
  var variant1 = CarVariant("Private Car", 5);
  var variant2 = CarVariant("Racing Car", 1);
  group.addComponent(variant1);
  group.addComponent(variant2);

  print("Car Group: ${group.name}");
  // for (var component in group.components) {
  //   component.showDetails();
  // }
  group.showDetails();

  // Observer Pattern
  var subscription1 = Subscription("Client A");
  subscription1.addNotificationType("Price Change");
  subscription1.addNotificationType("Feature Change");
  var subscription2 = Subscription("Client B");
  subscription2.addNotificationType("Feature Change");

  var notificationSystem = NotificationSystem();
  notificationSystem.subscribe(subscription1);
  notificationSystem.subscribe(subscription2);

  var notification = Notification("Price Change", "Car prices have been updated.");
  notificationSystem.notifySubscribers(notification);

  // Facade Pattern
  var onlineSystem = OnlineSystem();
  var mobileApp = MobileApplication(onlineSystem);

  mobileApp.requestCarServicing();
  mobileApp.requestCarWashing();
  mobileApp.requestOnlineDelivery();
}