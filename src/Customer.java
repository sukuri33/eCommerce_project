import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

/**
 * Customer class is created to store customer information when a customer registered/signed up/created in the app
 */

public class Customer {
    //Why we need this ID?
    //Create multiple customers in an Excel spreadsheet and ask students imagine it as the app DB
    //Ask student to uniquely pull a customer from the DB
    //By email? By userName? By Addresses? or assign a unique number like SSN for later to identify is better?
    private final UUID customerId;
    private final String userName;
    private final String email;
    private List<Address> addresses;
    //Below isn't preferred for storing the address object because in case in the future the desired collection class
    //becomes other than ArrayList then it won't be able to accept other than ArrayList<T>(); hence the List<T> - Polymorphism
    //private ArrayList addresses = new ArrayList<>();

   public Customer(UUID customerId, String userName, String email, List<Address> addresses) {
        this.customerId = customerId;
        this.userName = userName;
        this.email = email;
        try{
            setAddresses(addresses);
        }catch (Exception e){
            e.getMessage();
            e.printStackTrace();
        }

    }

    public Customer(UUID customerId, String userName, String email) {
        this.customerId = customerId;
        this.userName = userName;
        this.email = email;
    }

    public UUID getCustomerId() {
        return customerId;
    }

    public String getUserName() {
        return userName;
    }

    public String getEmail() {
        return email;
    }
    //Assuming there is a limitation to add more than 3 addresses for one customer
    private void setAddresses(List<Address> addresses) throws Exception {
        if (addresses.size() > 2){
            throw new Exception("Customer cannot have more than 2 address MAX");
        }
        this.addresses = addresses;
    }

    public List<Address> getAddresses() {
        return addresses;
    }
}
