class PersonSRP {
    private String name;
    private String email;

    public PersonSRP(String name, String email) {
        this.name = name;
        this.email = email;
    }

    // Getter methods
    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }
}

class PersonRepository {
    public void savePerson(PersonSRP person) {
        System.out.println("Saving " + person.getName() + " with email " + person.getEmail() + " to the database.");
        // Imagine database saving logic here
    }
}

class MainSRP {
    public static void main(String[] args) {
        PersonSRP person = new PersonSRP("John Doe", "john.doe@example.com");
        PersonRepository repository = new PersonRepository();
        repository.savePerson(person);
    }
}
