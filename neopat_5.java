import java.util.*;
public class neopat_5 {
   public static void main(String[] args) {
    int d=0,e =0;
      Scanner s = new Scanner(System.in);
      ArrayList<Integer> finaList = new ArrayList<Integer>();
      int a = s.nextInt();
      s.nextLine();
      String[] b = s.nextLine().split(" ");
      System.out.println(Arrays.toString(b)); 
      for(String i:b){
        int c = Integer.parseInt(i);
        finaList.add(c);
      }
      //System.out.println(finaList);
      for(int i :finaList){
        if(i%2==0){
            d+=1;
        }
        else{
            e+=1;
        }
      }
    System.out.println(d); 
    System.out.println(e);
   } 
}
