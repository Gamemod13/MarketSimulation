package product.user;

/**
 * The class stores the names of all users, who purchase product with given ID,
 * extends from Class List
 * @author Gamemod13
 * @version 1.0
 */
public class UserList extends List{
    /**
     * Constructor - of User List, extends from Class List,
     * Create <b>Product ID</b> as ID of owner
     * @param product Product, which was purchased
     */
    public UserList(Product product){
        super(product.getID());
    }
    /**
     * Method - add user's name to list, after buying product
     * @param user user, who bought this product
     */
    public void addUser(User user){
        super.addToList(user.getFirstName()+ " " + user.getLastName());
    }
    /**
     * Method - print all users name, who bought the product
     * @param iD ID of product owner
     */
    @Override
    public void getAllList(Integer iD){
        super.getAllList(iD);
    }
    /**
     * Method - override List method, used in Method getAllList and print
     * who own of this list
     */
    @Override
    protected void outID(){
        System.out.println("Product with this ID: " + getiD() +" bought:");
    }
}
