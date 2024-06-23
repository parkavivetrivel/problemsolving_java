
import java.util.Arrays;

public class bubblesort {

    public static void main(String[] args) {
        int[] arr = {236,208,155,145,232};
        //int[] arr2 = new int[5];
        int i, j;
        for (i = 0; i < arr.length - 1; i++) {
            for (j = 0; j < arr.length - 1; j++) {
                if (arr[j] > arr[j + 1]) { //O=>O=>O=>
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        System.out.print(Arrays.toString(arr));
    }
}
