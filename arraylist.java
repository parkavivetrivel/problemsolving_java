import java.util.*;  
// import static java.util.Collections.list;
public class arraylist {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        Scanner s = new Scanner(System.in);
        int a = 5,i;
        for(i = 0;i<=a;i++){
            int b = s.nextInt();
            list.add(b);            
        }
        System.out.println(list);
        list.add(0,15); //adding in the list specifying the index number.
        list.get(0); // to retrieve the element in arraylist.
        list.set(0,13); // updating the element in the array list.
        list.remove(0); // deleting the element in the arraylist.
        list.clear(); // deleting all the elemnet in the arraylist.
        list.size(); // size of the arraylist.
        Collections.sort(list); // sorting the arraylist
        System.out.println(list);
        Collections.sort(list,Collections.reverseOrder()); // sorting the list in reverse order.
        System.out.println(list);
    }
    
}




