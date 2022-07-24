/**
 * The class was created to call and display a
 * custom exception according to the terms of reference
 * @author Gamemod13
 * @version 1.0
 */
public class MyException extends Exception {

    /**
     * @exception MyException print to console "Not enough money."
     */
    public void MyException() {
        System.out.println("MyException: Not enough money.");
    }
}
