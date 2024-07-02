import java.util.*;
public class stack {
    public static void main(String[]arg){
        Stack<Integer> Stack = new Stack<Integer>();
        System.out.println(Stack);
        Stack.push(10);
        Stack.push(20);
        System.out.println(Stack);
        Stack.pop();
        System.out.println(Stack);
        int a = Stack.peek();
        System.out.println(a);
        System.out.println(Stack.size());
    }
    
}
