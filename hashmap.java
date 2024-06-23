import java.util.*;
public class hashmap {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        HashMap<String,Integer> hash = new HashMap<String,Integer>();
        int i,n=2;
        for(i=1;i<=n;i++){
            String name = s.next();
            int age = s.nextInt();
            hash.put(name,age);
        } // put is used to add the element in hashmap
        System.out.println(hash);
        System.out.println(hash.get("bhar")); //get is used to retrieve the value of the given key;
        for( String j : hash.keySet()){
            System.out.println(j); //to print key "keyset()" && for value values(); 
        }
        for(String k : hash.keySet()){
            System.out.println(k +":"+ hash.get(k)); // to print both key and value;
        }
        System.out.println(hash.size()); // to print the size of the hashmap.
        hash.clear(); // to clear all the data in the hashmap
        System.out.println(hash);

    }
}
