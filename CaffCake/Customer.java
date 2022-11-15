package CaffCake;

public class Customer {
    protected String name;

    protected String phoneNumber;

    public String getName() {
        return name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public String setName(String newName) {
        name = newName;

        return name;
    }

    public String setPhoneNumber(String newPhoneNumber) {
        phoneNumber = newPhoneNumber;

        return phoneNumber;
    }
}
