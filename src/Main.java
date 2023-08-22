import Automation.AutomationIndustry.AsiaAutomatedAIFactory;
import Automation.AutomationIndustry.AutomatedAIFactory;

import Automation.AutomationIndustry.USAAutomatedAIFactory;
import CarTypes.Brand.BMWGroup;
import CarTypes.Brand.Brand;
import CarTypes.CarFacade;
import CarTypes.CarGroup;
import CarTypes.CarGroupWithAIAdapter;
import CarTypes.CarTemplate;
import CarTypes.Usage.RacingCar;
import Notification.Notification;
import Notification.NotificationSystem;
import Notification.Subscription;
import OnlineServices.MobileApplication;
import OnlineServices.OnlineSystem;
//import CarTypes.Brand.Brand.FerrariGroup;
//import CarTypes.Brand.Brand.FordGroup;

public class Main {
    public static void main(String[] args) {


      //  Brand mycar = new CarFacade("BMW","Racing").getCar();


        CarTemplate car = new RacingCar();
        BMWGroup myRacingCar = new BMWGroup(car);
        myRacingCar.buildCars();



        


        // Observer Pattern
        Subscription subscription1 = new Subscription("Client A");
        subscription1.addNotificationType("Price Change");
        subscription1.addNotificationType("Feature Change");
        Subscription subscription2 =new Subscription("Client B");
        subscription2.addNotificationType("Feature Change");


        NotificationSystem notificationSystem = new NotificationSystem();
        notificationSystem.subscribe(subscription1);
        notificationSystem.subscribe(subscription2);

        Notification notification = new Notification("Price Change", "Car prices have been updated.");
        notificationSystem.notifySubscribers(notification);

        // Facade Pattern
        OnlineSystem onlineSystem = new OnlineSystem();
        MobileApplication mobileApp = new MobileApplication(onlineSystem);

        mobileApp.requestCarServicing();
        mobileApp.requestCarWashing();
        mobileApp.requestOnlineDelivery();


    }


}