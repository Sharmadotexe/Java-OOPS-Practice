import org.testng.annotations.BeforeMethod;

public class PS1 {

    public void doThis(){
        System.out.println("Method from parent class");
    }

    @BeforeMethod
    public void beforeRun(){
        System.out.println("Before method from parent class");


    }
}
