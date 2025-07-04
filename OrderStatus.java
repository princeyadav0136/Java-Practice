enum OrderStatus {
    NEW("New Order"),
    PROCESSING("Processing Order"),
    SHIPPED("Order Shipped"),
    DELIVERED("Order Delivered");

    private final String description;

    // Constructor to initialize the description
    OrderStatus(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }
}
