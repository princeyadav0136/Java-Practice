interface BankService {
    default void withdraw() {
        System.out.println("Withdrawing money...");
        logTransaction();
    }
    static void deposit() {
        System.out.println("Depositing money...");
        logStaticTransaction();
    }

    private void logTransaction() {
        System.out.println("Logging transaction...");
    }

    static private void logStaticTransaction() {
        System.out.println("Logging static transaction...");
    }
}
