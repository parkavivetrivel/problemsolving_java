// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.*;
class neopat_dsa2 {
    public static void main(String[] args) {
        int c = 0;
        int[][] a ={{3, 7, 8},
            {9, 11, 13},
            {15, 16, 17}};
        int[] b = new int[a.length]; 
        ArrayList<Integer> last = new ArrayList<Integer>();
        for(int i = 0;i<a.length;i++){
            b[i] = Arrays.stream(a[i]).min().getAsInt();
            //System.out.println(b[i]);
        }
        for(int j = 0;j<a.length;j++){
            for(int k = 0;k<a.length;k++){
                if(b[j]==a[j][k]){
                    //System.out.println(k);
                    for(int l = 0;l<a.length;l++){
                        //c =0;
                        //System.out.println(a[l][k]);
                        if(b[j]>a[l][k]){
                            //System.out.println(b[j]);
                            c+=1;
                        }
                        //System.out.println(c);
                    }
                    //c2 = c;
                    //System.out.println(c);
                    if(c==a.length){
                        last.add(b[j]);
                    }
                    //System.out.println(a[j][k]);
                }
            }
        }
       System.out.println(last); 
    }
}