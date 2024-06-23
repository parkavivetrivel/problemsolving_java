import java.util.*;
public class array {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        Integer[] array = new Integer[n];
        int i = 0;
        for(i=0; i<=n-1;i++){
            array[i] = s.nextInt();
        }
        System.out.println("finished");
        for(int a : array){
            System.out.println(a);
        } // to print the element in the array. 

        System.out.println("difference");
        System.out.println(Arrays.toString(array));
        Arrays.sort(array);
        System.out.println(Arrays.toString(array)); 
        // to represent the array in the same line.
    
        Arrays.sort(array,Collections.reverseOrder());
        System.out.println(Arrays.toString(array));
        int len = array.length;
        System.out.println(len);
    }
}
