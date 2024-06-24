import java.util.*;
public class split {
    public static void main(String[] arg){
        Scanner s = new Scanner(System.in);
        String a = s.nextLine();
        String[] b = a.split(" "); //split in java
        System.out.println(Arrays.toString(b));
        System.out.println(b[1]);
        
        //split("with multiple symbol")
        String[] c = a.split("\\.");
        System.out.println(Arrays.toString(c));

    }
}
