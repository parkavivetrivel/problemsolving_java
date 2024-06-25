
import java.util.*;

public class neopat_2 {

    public static void main(String[] arg) {
        Scanner s = new Scanner(System.in);
        int a = s.nextInt();
        s.nextLine();
        if (a < 0) {
            System.out.println("Inavlid");
        } 
        else {
            String b = s.nextLine();
            if ("r".equals(b)) {
                System.out.println(a + 5);
            } 
            else {
                System.out.println(a);
            }
        }

    }
}
