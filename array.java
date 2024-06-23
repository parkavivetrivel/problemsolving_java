import java.util.*;
public class array {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int[] array = new int[n];
        int i = 0;
        for(i=0; i<=n-1;i++){
            array[i] = s.nextInt();
            

        }
        System.out.println("finished");
        for(int a : array){
            System.out.println(a);
        } // to print the element in the array.       
        int len = array.length;
        System.out.println(len);
    }
}
