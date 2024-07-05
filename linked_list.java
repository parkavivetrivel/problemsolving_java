//import java.util.*;
public class linked_list{
    static Node head;
    static class Node{
        int data;
        Node next;
        Node(int a){
            data = a;
            next = null;
        }
    }
    public void insert(int a){
        Node nodeObj = new Node(a);
        if(head == null){
            head = nodeObj;
        }
        else{
            Node nexoffhead = head;
            while(nexoffhead.next!=null){
                nexoffhead = nexoffhead.next;
            }
            nexoffhead.next = nodeObj; //whyyyyyyyyyyyyyyyyyyy

        }
    }
    public void show(){
        Node toshow = head;
        while(toshow != null){
            System.out.println(toshow.data);
            toshow = toshow.next;
            
        }
    }
    public static void main(String[] args) {
        linked_list obj1 = new linked_list();
        obj1.insert(9);
        obj1.insert(13);
        obj1.insert(12);
        obj1.insert(11);
        obj1.show();
    }
}