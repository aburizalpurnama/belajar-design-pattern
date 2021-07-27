package builder.pattern;

public class Customer {
    private String id;
    private String firstName;
    private String lastName;
    private int age;
    private String address;
    private String gender;

    public Customer(String id, String firstName, String lastName, int age, String address, String gender) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.address = address;
        this.gender = gender;
    }
}
