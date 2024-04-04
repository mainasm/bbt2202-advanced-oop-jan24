class Person {
    private String name;
    private String email;

    public Person(String name, String email) {
        this.name = name;
        this.email = email;
    }

    // This method violates SRP by adding database logic to the Person class.
    public void savePersonToDatabase() {
        System.out.println("Saving " + name + " to the database.");
        // Database saving logic goes here
    }
}
