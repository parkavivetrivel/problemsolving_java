import java.util.*;
public class neopat_4 {
    public static int factorial(int j){
        if(j<=0){
            return 1;
        }
        else{
             return factorial(j-1)*j;
        }
    }
    public static void main(String[] arg){
        Scanner s = new Scanner(System.in);
        //145 = 1! + 4! + 5! Character.getNumericValue
        String a = s.nextLine();
        int f = Integer.parseInt(a);
        //System.out.println(f);
        int[] list = new int[a.length()];
        //int[] final_list = new int[a.length()];
        ArrayList<Integer> finaList = new ArrayList<Integer>();

        int i = 0, e =0;
        while(i<a.length()){
            char b = a.charAt(i);
            int c = Character.getNumericValue(b);
            //System.out.println(c);
            list[i] = c;
            i++;
        }
        //System.out.println(Arrays.toString(list));
        for(int j :list){
            int d = factorial(j);
            finaList.add(d);
            //System.out.println(d);
        }
        for(int k :finaList){
            e+=k;
        }
        //System.out.println(e);
        if(f == e){
            System.out.println(a+" Strong Number");
        }
        else{
            System.out.println(a+" Not Strong Number");
        }

    }
}
