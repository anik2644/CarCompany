import '../CarComponent/CarGroup.dart';
import '../CarComponent/CarVariant.dart';

class CarShop {
  String shopName;
  CarGroup carGroup;
  List<CarVariant> carVariants = [];

  CarShop(this.shopName, this.carGroup);

  void addCarVariant(CarVariant variant) {
    carVariants.add(variant);
  }
}