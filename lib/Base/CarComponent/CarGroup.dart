import 'CarComponent.dart';
import '../Shop/CarShop.dart';

class CarGroup extends CarComponent {
  List<CarComponent> components = [];

  CarGroup(String name) : super(name);

  void addComponent(CarComponent component) {
    components.add(component);
  }

  void showDetails() {
    print(name);
    for (var component in components) {
      print("  ${component.name}");
    }
  }
}