import static java.lang.System.out;
import java.lang.Thread.*;


class CTest extends Thread{
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
public class Class04 {
    public static void main(String[] args) {
        CTest hi = new CTest("Hello");
        CTest byc = new CTest("Good bye");
        CTest morning = new CTest("Good morning");
        morning.start();
        hi.start();
        byc.start();
        
        
    }
}