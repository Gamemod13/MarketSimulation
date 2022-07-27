package product.user;

import org.jetbrains.annotations.NotNull;
/**
 * The class creates a user with unique static identifier <b>S_ID</b> and
 * parameters:
 * <b>ID</b>, <b>firstName</b>, <b>lastName</b>, <b>amountOfMoney</b>
 * @author Gamemod13
 * @version 1.0
 */
public class User{
    /**
     * Member - static Integer ID with start count 0,
     * incremented by 1 with each new object creation
     */
    private static Integer S_ID = 0;
    /**
     * Member - Integer ID, takes value from static ID;
     */
    private final Integer ID;
    /**
     * Member - String FirstName of User
     */
    private String firstName;
    /**
     * Member - String LastName of User
     */
    private String lastName;
    /**
     * Member - Double Amount of user Money
     */
    private Double amountOfMoney;
    /**
     * Constructor - Create new User with all user parameters
     * @param firstName FirstName of User
     * @param lastName LastName of User
     * @param amountOfMoney how much money does he have
     */
    public User(String firstName, String lastName, Double amountOfMoney){
        this.ID=S_ID++;
        this.firstName = firstName;
        this.lastName = lastName;
        this.amountOfMoney = amountOfMoney;
    }
    /**
     * Method - set new FirstName of user
     * @param firstName FirstName of User
     */
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    /**
     * Method - set new LastName of User
     * @param lastName LastName of User
     */
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    /**
     * Method - set new amount of money
     * @param amountOfMoney how much he has now
     */
    public void setAmountOfMoney(Double amountOfMoney) {
        this.amountOfMoney = amountOfMoney;
    }
    /**
     * Method - get ID of User
     * @return unique user identifier
     */
    public Integer getID() {
        return ID;
    }
    /**
     * Method - get FirstName of User
     * @return user firstname
     */
    public String getFirstName() {
        return firstName;
    }
    /**
     * Method - get LastName of User
     * @return user lastname
     */
    public String getLastName() {
        return lastName;
    }
    /**
     * Method - get Amount of User money
     * @return user money
     */
    public Double getAmountOfMoney() {
        return amountOfMoney;
    }
    /**
     * Method - check price and user money, if it's more than 0 - return true, if not - false
     * @param money the amount of money by which the user's money
     * should be increased or decreased
     * @return is the operation successful
     * @deprecated have new method to buying products (buyingProduct)
     */
    public boolean operationWithMoney(Double money){
        if(this.amountOfMoney+money>=0) {
            this.amountOfMoney += money;
            return true;
        }
        else{return false;}
    }
    /**
     * Method - print User first and last name's
     */
    public void printName(){
        System.out.println("First Name of User: " + this.firstName);
        System.out.println("Last Name of User: " + this.lastName);
    }
    /**
     * Method - print user's ID
     */
    public void printID(){
        System.out.println("User ID: " + this.ID);
    }
    /**
     * Method - extended version of method "operationWithMoney" for work with
     * class Product, if user have enough money to buying product - decries amount
     * of user money and return true, if not - return false
     * @param product takes a product object and determines its cost to purchase
     * @return is the operation successful
     */
    public boolean buyingProduct (@NotNull Product product) {
        if((this.amountOfMoney - product.getPrice())>=0){
            this.amountOfMoney-= product.getPrice();
            return true;
        }
        else {
            return false;
        }
    }
}
