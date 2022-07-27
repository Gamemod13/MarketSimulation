package product.user;

import java.util.ArrayList;
/**
 * The class was created to contain an array of names
 * and the id of the object to which these names belong with members:
 * <b>Integer ID</b> and <b>ArrayList<String> nameList</b>
 * @author Gamemod13
 * @version 1.0
 */
public class List {
    /**Class Member - ID of list owner */
    private Integer iD;
    /**Class Member - ArrayList -
     container for string type names  */
    private ArrayList<String> nameList= new ArrayList<>();

    /**Constructor - accept Integer ID of list owner
     * @param iD Integer of owner
     * @see List#List(Integer)
     * */
    public List(Integer iD){
        this.iD = iD;
    }

    /**Method - add String to ArrayList
     * @param name new name to list
     * */
    public void addToList(String name){
        this.nameList.add(name);
    }

    /**Method - prints all members of the ArrayList to the console
     * @param iD - owner's identifier
     * */
    public void getAllList(Integer iD){
        if(this.iD.equals(iD) && !this.nameList.isEmpty()) {
            outID();
            for (String element : this.nameList) {
                System.out.println(element);
            }
        }
    }

    /**Method - return Integer ID of list owner
     * @return identifier of list owner
     * */
    public Integer getiD() {
        return iD;
    }

    /**Method - prints ID of list owner (protected method, used only in getAllList method */
    protected void outID(){
        System.out.println("This owner with ID"+ iD +" have: ");
    }
}
