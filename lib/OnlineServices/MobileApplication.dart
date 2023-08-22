import '../Car.dart';
import 'OnlineSystem.dart';


class MobileApplication {
  OnlineSystem onlineSystem;

  MobileApplication(this.onlineSystem);

  void requestCarServicing() {
    onlineSystem.requestCarServicing();
  }

  void requestCarWashing() {
    onlineSystem.requestCarWashing();
  }

  void requestOnlineDelivery() {
    onlineSystem.requestOnlineDelivery();
  }
}