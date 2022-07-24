import java.util.ArrayList;
import java.util.Scanner;
/**
 * The class SystemMenu from the start has 3 products that can be sold.
 * <li>Each product contains:</li>
 * <p>1. Id</p>
 * <p>2. Name</p>
 * <p>3. Price</p>
 * <li>SystemMenu from the start has 3 users that can buy products. Each user has:</li>
 * <p>1. Id</p>
 * <p>2. First name</p>
 * <p>3. Last name</p>
 * <p>4. Amount of money</p>
 * <li>SystemMenu has menu that supports next operations:</li>
 * <p>1. Display list of all users</p>
 * <p>2. Display list of all products</p>
 * <p>3. User should be able to buy product, to do this operation we should enter:
 * Id of user who want to buy productId of
 * product which user want to buy</p>
 * <li> If user doesn't have enough money to buy product, throw exception</li>
 * <li> If user successfully bought the product display message about successful purchase</li>
 * <li> When user is buying product, his amount of money decreases by product price</li>
 * <li> After successful purchase, information about user and his products has to be stored in collection best
 * suited for that purpose</li>
 *
 * <p>4. Display list of user products by user id
 * (If user didn't buy anything yet, don't show anything)</p>
 * <p>5. Display list of users that bought product by product id (If
 * nobody bought this product yet, don't show anything)</p>
 * @author Gamemod13
 * @version 1.1
 */
public class SystemMenu {
    /**
     * Member - systemUser add to list all users in system
     */
    private ArrayList<User> systemUsers = new ArrayList<>();
    /**
     * Member - systemProductLists add all Product lists in system
     */
    private ArrayList<ProductList> systemProductLists = new ArrayList<>();
    /**
     * Member - systemProduct add to list all product in system
     */
    private ArrayList<Product> systemProducts = new ArrayList<>();
    /**
     * Member - systemUserLists add all User lists in system
     */
    private ArrayList<UserList> systemUserLists = new ArrayList<>();

    /**
     * Constructor - create 3 users, 3 products, all ArrayLists and members SystemMenu class
     */
    public SystemMenu(){

        Product apple = new Product("Apple", 10.D);
        this.systemProducts.add(apple);
        this.systemUserLists.add(new UserList(apple));
        Product peanut = new Product("Peanut", 20.D);
        this.systemProducts.add(peanut);
        this.systemUserLists.add(new UserList(peanut));
        Product banana = new Product("Apple", 12.D);
        this.systemProducts.add(banana);
        this.systemUserLists.add(new UserList(banana));

        User user1 = new User("Taras", "Hrytsenko", 50.D);
        this.systemUsers.add(user1);
        this.systemProductLists.add(new ProductList(user1));
        User user2 = new User("Mary", "Boychenko", 15.D);
        this.systemUsers.add(user2);
        this.systemProductLists.add(new ProductList(user2));
        User user3 = new User("Max", "Zinewetsky", 25.D);
        this.systemUsers.add(user3);
        this.systemProductLists.add(new ProductList(user3));
    }
    /**
     * Method - create inf cycle where can be selected operations in the menu
     */
    public void menu(){
        boolean menuIsOpen = true;
        while (menuIsOpen){
            System.out.println("Press 'U' to display list of all users.");
            System.out.println("Press 'P' to display list of all products.");
            System.out.println("Press 'S' to display list of user products by user ID.");
            System.out.println("Press 'B' to display list of users that bought product" +
                    " by product ID." +
                    "that bought product by product id." );
            System.out.println("Press 'C' to close menu.");
            Scanner in = new Scanner(System.in);
            String inputString = in.nextLine();
            switch (inputString){
                case "U", "u", "Г","г" -> displayAllUsers();
                case "P", "p", "З","з" -> displayAllProducts();
                case "S", "s", "І","і" -> displayListOfProducts();
                case "B", "b", "И","и" -> displayListOfUsers();
                case "C", "c", "С","с" -> menuIsOpen = false;
                default -> System.out.println("You are press the wrong button," +
                        " let's try again.");

            }
        }
    }
    /**
     * Method - print names of all system users
     */
    public void displayAllUsers(){
        System.out.println("All users: ");
        for(User user: this.systemUsers){
            System.out.println(user.getFirstName() + ' ' + user.getLastName());
        }
    }
    /**
     * Method - print names of all system products
     */
    public void displayAllProducts(){
        System.out.println("All products: ");
        for(Product product: this.systemProducts){
            System.out.println(product.getName());
        }
    }
    /**
     * Method - print names of products, that were purchased
     * by a user with a given ID
     */
    public void displayListOfProducts(){
        System.out.println("Enter the User ID:");
        Scanner in = new Scanner(System.in);
        Integer iD = in.nextInt();
        boolean findList = false;
        for(ProductList list: this.systemProductLists){
            if(list.getiD().equals(iD)){
                list.getAllList(iD);
                findList = true;
            }
            if(findList){
                break;
            }
        }
    }
    /**
     * Method - print names of users, who bought a product
     * with a given ID
     */
    public void displayListOfUsers(){
        System.out.println("Enter the Product ID:");
        Scanner in = new Scanner(System.in);
        Integer iD = in.nextInt();
        boolean findList = false;
        for(UserList list: this.systemUserLists){
            if(list.getiD().equals(iD)){
                list.getAllList(iD);
                findList = true;
            }
            if(findList){
                break;
            }
        }
    }
    /**
     * Method - purchasing product with some product ID by user with some user ID
     */
    public void userBuyProduct(){
        System.out.println("Enter User ID:");
        Scanner in = new Scanner(System.in);
        Integer userID = in.nextInt();
        System.out.println("Enter Product ID:");
        Integer productID = in.nextInt();
        if(findUser(userID)&&findProduct(productID)){
            userBuyProduct(userID,productID);
        }

    }
    /**
     * Method - check user ID in this system, if it finds - return true, if not - false.
     * Its private method - part of logic userBuyProduct
     * @param userID param with method "userBuyProduct"
     * @return boolean searching result
     */
    private boolean findUser(Integer userID){
        for(User user: this.systemUsers) {
            if (user.getID().equals(userID)) {
                return true;
            }
        }
        return false;
    }
    /**
     * Method - check product ID in this system, if it finds - return true, if not - false.
     * Its private method - part of logic userBuyProduct
     * @param productID param with method "userBuyProduct"
     * @return boolean searching result
     */
    private boolean findProduct(Integer productID){
        for(Product product: this.systemProducts) {
            if (product.getID().equals(productID)) {
                return true;
            }
        }
        return false;
    }
    /**
     * Method - call User method to buy product and add Product and User to
     * relevant userList and productList, if purchase can't be complete - call method
     * throwMyException
     * Its private method - part of logic userBuyProduct
     * @param userID param with method "userBuyProduct"
     * @param productID param with method "userBuyProduct"
     */
    private void userBuyProduct(Integer userID, Integer productID) {
        if (this.systemUsers.get(userID).buyingProduct(this.systemProducts.get(productID))) {
            System.out.println("Successful purchase!");
            for (ProductList productList : this.systemProductLists) {
                if (productList.getiD().equals(userID)) {
                    productList.addProduct(this.systemProducts.get(productID));
                }
            }
            for (UserList userList : this.systemUserLists) {
                if (userList.getiD().equals(productID)) {
                    userList.addUser(this.systemUsers.get(userID));
                }
            }
        } else {
            throwMyException();
        }
    }

    /**
     * Method catch's exception
     * Its private method - part of logic userBuyProduct
     */
    private void throwMyException() {
        try {
            throw new MyException();
        }
        catch (MyException e) {
            e.MyException();
        }
    }
}
