import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        DataGeneretor.createCustomer();
//        System.out.println("End"); //uncomment when show casing exception handling
        DataGeneretor.createCategory();
        DataGeneretor.createProduct();
//        createBalance();
//        createDiscount();
        System.out.println("login to your account with your email address");
        String customerEmailAddress = input.nextLine();
        String customerName = null;
        for (Customer customer : ApplicationDB.CUSTOMER_TABLE) {
            if(customer.getEmail().equals(customerEmailAddress)){
                customerName = customer.getUserName();
            }else{

                System.err.println("Unable to locate a customer in the system with this email address: "+customerEmailAddress);
                System.exit(1);
            }
        }

        System.out.println("Welcome to eCommerce online shopping center "+customerName);






    }
}

/*

An e-Commerce application requirement:

1. Design DB
    createCustomer();
        - we need to store customer info in the app DB
    createCategory();
        - we need to have different categories to club products by its appropriate category
            so that we can apply category specific business rules
            such as:
                products fall under electronic should be delivered next business day(Refer to product requirement section for more details)
    createProduct();
        - we need to have products in app DB so that we can present them on the site for customers to choose and purchase



2.Create menu items

3.Business Logic for the menu items

    - business req for creating customers
        Each Customer must have a unique ID assigned at creation(Hint:use java UUID class)
        Application offers two ways of creating a customer profile
            1.With userName and email
            2.With userName, email and address --> I think this one was an intentional requirement which was
                                                 arbitrarily intended to manifest Constructor overloading concept in JAVA?
                2.1. Address should be consistent of below info:
                    a.streetName
                    b.streetNumber
                        b.1) additional field for additional street(optional field)
                    c.zipCode
                    d.state - we may apply syntax rule such as; State field should only accept 2 Chars in Caps(Hint: Setter)
                2.2. customer can have more than one address(MAX address?)



    - business req for creating Categories
        All categories should have a name and a unique ID
        All category should have delivery speed info. However, deliver speed is different for each
        Below are the list of categories along with subsequence biz rules:
        1.Electronic
            1.1. should have electronic specific category Id
            which should be easily distinguishable with other categories in the application
            1.2. delivery speed is 1 day
        2.SkinCare
            2.1. should have unique category id
            2.2. delivery speed is same day
        3.Furniture
            3.1. should have unique category id
            3.2. delivery speed is 4 days



    - business req for creating products
        Unique productId
        productName
        productPrice
        productStockNumber
            1.If customer tries to buy a quantity of a product which is more that available stock number
                application should not allow that to happen(Hint: create customer exception)
        productRemainingStock
            1.Application should be able to track the remaining stock availability of a product if certain quantity sold previously
        productCategory
            1.category should be mapped to category DB table


        - business req for creating balance:
            Balance should be increased when customer transfers money from a bank account
            Balance should be decreased when customer spends to purchase merchant
            Two types of balance for each customer
                1.Regular Balance
                    Given balance should be linked to a customer who owns the balance in the system(Hint: customerId)
                    balanceAmount - to hold the concurrent amount available for a given customer

                2.Gift Card Balance
                    Given gift balance should be linked to a customer who owns the balance in the system(Hint: customerId)
                    giftBalanceAmount - to hold the concurrent amount available for a given customer



 */
