import java.util.*;
public class selectionsort {
    public static void main(String arg[]){
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int[] arr = new int[n];
        int i,j;
        for(i = 0;i<n;i++){
            arr[i] = s.nextInt();
        }
        // System.out.println(Arrays.toString(arr));
        for(i = 0;i<arr.length;i++){
            int a = i;
            for(j = a+1; j<arr.length; j++){
                if(arr[i]>arr[j]){
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;       
                }

            }


        }
        System.out.println(Arrays.toString(arr));

    }
}
