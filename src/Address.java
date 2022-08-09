/**
 * Address class is created because Customer class requires address info when a customer is being created
 *
 */

public class Address {
    private String streetName;
    private String streetNumber;
    private String additionalAddressLine;
    private String zipCode;
    private String state;

    public Address(String streetName, String streetNumber, String additionalAddressLine, String zipCode, String state) {
        this.streetName = streetName;
        this.streetNumber = streetNumber;
        this.additionalAddressLine = additionalAddressLine;
        this.zipCode = zipCode;
        this.state = state;
    }

    public String getStreetName() {
        return streetName;
    }

    public String getStreetNumber() {
        return streetNumber;
    }

    public String getAdditionalAddressLine() {
        return additionalAddressLine;
    }

    public String getZipCode() {
        return zipCode;
    }

    public String getState() {
        return state;
    }
}
