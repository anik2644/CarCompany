import 'AINavigationStrategy.dart';
import '../Strategy.dart';

class USAAIStrategy implements AINavigationStrategy {
  @override
  String navigate() {
    return "Using USA-based AI navigation";
  }
}