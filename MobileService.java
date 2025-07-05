interface MobileService {
    void call();

    default void checkBalance() {
        System.out.println("Checking balance...");
    }

    static void sendSMS() {
        System.out.println("Sending SMS...");
    }
}
