import java.util.*;
class HelloWorld {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        ArrayList<String> a = new ArrayList<String>();
        int i;
        String b;
        for(i=0;i<=4;i++){
             b = s.nextLine();
             a.add(b);
        }
        System.out.println(a);
    }
}