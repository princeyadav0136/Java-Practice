public class Database {
    private Database() {
        // Private constructor to prevent instantiation
        System.out.println("Database instance created");
    }

    public static Database getInstance() {
        return new Database();
    }
}
