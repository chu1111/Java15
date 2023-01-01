import static java.lang.System.out;
import java.lang.Thread.*;


class CTest extends Thread implements Runnable{
    String id;

    CTest(String str) {
        id = str;
    }

    public void run() {
        for (int i = 1; i <= 5; i++) {
            for (int j = 0; j < 100000000; j++)
            ;
            out.println(id + " " + i);
        }
        
    }
}
public class Class07 {
    public static void main(String[] args) {
        Thread hi = new Thread(new CTest("Hello"));
        Thread byc = new Thread(new CTest("Good bye"));
        Thread morning = new Thread(new CTest("Good morning"));
        morning.start();
        hi.start();
        byc.start();
        
        
    }
}