import java.util.*;
public class neopat_1 {
    public static void main(String[] arg){
        Scanner s = new Scanner(System.in);
        String[] a = s.nextLine().split(" ");
        System.out.println(Arrays.toString(a));
        int num1 = Integer.parseInt(a[0]);
        int num2 = Integer.parseInt(a[1]);
        System.out.println(num1 + num2);
        String c = a[0];
        String d = a[1];
        System.out.println(c+d);
    }  
}
