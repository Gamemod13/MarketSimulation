package product.user;

/**
 * The class stores the names of all products purchased by the user with the given ID,
 * extends from Class List
 * @author Gamemod13
 * @version 1.0
 */
public class ProductList extends List {

    /**
     * Constructor - of Product List, extends from Class List,
     * Create <b>User ID</b> as ID of owner
     * @param user User, who own this list with Products
     */
    public ProductList(User user){
        super(user.getID());
    }
    /**
     * Method - add product name to list, after buying
     * @param product product, which was purchased by the user
     */
    public void addProduct(Product product){
        super.addToList(product.getName());
    }
    /**
     * Method - print all purchased products
     * @param iD ID of user owner
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
        System.out.println("User with this ID: " + getiD() +" buy:");
    }
}
