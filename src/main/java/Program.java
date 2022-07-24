/**
 * The main class, the whole program runs here
 * @author Gamemod13
 * @version 1.0
 */
public class Program {
    /**
     * Main Method - create class systemMenu with all Users, UserList,
     * Product, ProductList and make all operations
     * @param args - default main parameter
     */
    public static void main(String[] args) {
    SystemMenu systemMenu = new SystemMenu();
    systemMenu.buyingProduct();
    systemMenu.menu();
    }
}
