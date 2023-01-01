import java.lang.Thread;
import static java.lang.System.out;
class Add implements Runnable{
    private int n;
    private int sum = 0;

    public Add(int a) {
        n = a;
    }

    public void run() {
        for (int i = 1; i <= n; i++) {
            sum += i;
        }
        out.println(sum);
    }
}

public class Class06 {
    public static void main(String[] args) {
        Thread c = new Thread(new Add(5));
        Thread d = new Thread(new Add(10));
        c.start();
        d.start();
    }
    
}
