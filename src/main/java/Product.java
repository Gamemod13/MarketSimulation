/**
 * The class creates a product with unique static identifier <b>S_ID</b> and
 * parameters:
 * <b>ID</b>, <b>name</b>, <b>price</b>
 * @author Gamemod13
 * @version 1.0
 */
public class Product{
    /**
     * Member - static Integer ID with start count 0,
     * incremented by 1 with each new object creation
     */
    private static Integer S_ID = 0;
    /**
     * Member - Integer ID, takes value from static ID;
     */
    private final  Integer ID;
    /**
     * Member - String Name of product
     */
    private String name;
    /**
     * Member - Double Price of product
     */
    private Double price;
    /**
     * Constructor - Create new Product
     * @param name Name of Product
     * @param price Price of Product
     */
    public Product(String name, Double price){
        this.name = name;
        this.price = price;
        this.ID = S_ID++;
    }
    /**
     * Method - set new Name of product
     * @param name Name of Product
     */
    public void setName(String name) {
        this.name = name;
    }
    /**
     * Method - set new Price of product
     * @param price Price of Product
     */
    public void setPrice(Double price) {
        this.price = price;
    }
    /**
     * Method - return ID of product
     * @return ID of Product
     */
    public Integer getID() {
        return ID;
    }
    /**
     * Method - return Name of product
     * @return Name of Product
     */
    public String getName() {
        return name;
    }
    /**
     * Method - return Price of product
     * @return Price of Product
     */
    public Double getPrice() {
        return price;
    }
}
