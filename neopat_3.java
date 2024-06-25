
import java.util.*;

public class neopat_3 {

    public static void main(String[] arg) {
        Scanner s = new Scanner(System.in);
        int a = s.nextInt();
        int[] b = new int[a];
        //10 20 40
        int op = 10, i,d=0;
        int c = 0;
        b[0] = 10;
        for (i = 2; i <= a; i++) {
            c = op + op;
            //System.out.println(c);
            b[i-1] = c;
            op = c;
        }
        System.out.println(Arrays.toString(b));
        for(int j : b){
            d+=j;
        }
        System.out.println(d);



    }
}
