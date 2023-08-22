import 'AINavigationStrategy.dart';
import '../Strategy.dart';

class AutomatedAI {
  AINavigationStrategy strategy;

  AutomatedAI(this.strategy);

  void setStrategy(AINavigationStrategy strategy) {
    this.strategy = strategy;
  }

  String navigate() {
    return strategy.navigate();
  }
}