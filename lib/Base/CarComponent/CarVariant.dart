import 'CarComponent.dart';
import '../Decoration.dart';

class CarVariant extends CarComponent {
  int seatCount;

  CarVariant(String name, this.seatCount) : super(name);

  void showDetails() {
    print("$name - $seatCount seats");
  }
}