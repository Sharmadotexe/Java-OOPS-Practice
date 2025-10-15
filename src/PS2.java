import org.testng.annotations.Test;

public class PS2 extends PS1{

    @Test
    public void newRun(){
        Main obj = new Main(5);

//        System.out.println(obj.increment());

        System.out.println(obj.multiplyTwo());
    }
}
