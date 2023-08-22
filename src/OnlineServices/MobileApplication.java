package OnlineServices;
public class MobileApplication {
    private OnlineSystem onlineSystem;

    public MobileApplication(OnlineSystem onlineSystem) {
        this.onlineSystem = onlineSystem;
    }

    public void requestCarServicing() {
        onlineSystem.requestCarServicing();
    }

    public void requestCarWashing() {
        onlineSystem.requestCarWashing();
    }

    public void requestOnlineDelivery() {
        onlineSystem.requestOnlineDelivery();
    }
}
