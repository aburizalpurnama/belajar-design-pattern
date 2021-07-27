package builder.pattern;

public class CustomerBuilder {
    private String id;
    private String firstName;
    private String lastName;
    private int age;
    private String address;
    private String gender;

    public CustomerBuilder setId(String id) {
        this.id = id;
        return this;
    }

    public CustomerBuilder setFirstName(String firstName) {
        this.firstName = firstName;
        return this;
    }

    public CustomerBuilder setLastName(String lastName) {
        this.lastName = lastName;
        return this;
    }

    public CustomerBuilder setAge(int age) {
        this.age = age;
        return this;
    }

    public CustomerBuilder setAddress(String address) {
        this.address = address;
        return this;
    }

    public CustomerBuilder setGender(String gender) {
        this.gender = gender;
        return this;
    }

    public Customer build(){
        return new Customer(
                id, firstName, lastName, age, address, gender
        );
    }
}
