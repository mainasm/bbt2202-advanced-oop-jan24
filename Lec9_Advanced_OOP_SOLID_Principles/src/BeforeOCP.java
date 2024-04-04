class CarBeforeOCP {
    private String type;

    public CarBeforeOCP(String type) {
        this.type = type;
    }

    public void describe() {
        if ("electric".equals(type)) {
            System.out.println("This car is electric.");
        } else if ("gasoline".equals(type)) {
            System.out.println("This car runs on gasoline.");
        }
    }
}
