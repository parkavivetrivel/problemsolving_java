public class stackClass{
    public static  int arr[];//private??  //LIFO
    stackClass(int a) {
        arr = new int[a];
    }
    static void show(){ //to print the stack
        for(int i =0;i < arr.length;i++){
            System.out.print(arr[i]+ " ");
        }
    }
    public static int top=0;
    static void push(int b){ //to push the element into the stack.
        if(top>=arr.length){
            System.out.println("string is full");
        }
        else{
        arr[top]=b;
        top++;
        }

    }
    static void pop(){ //to pop the element from the stack.
        arr[top-1]=0;
    }
    //constructor created because it will be intialized automatically when the class called;
    public static void main(String[] arg){
        stackClass obj1 = new stackClass(5);
        push(10);
        push(20);
        push(30);
        push(40);
        push(50);
        //obj1.push(100);
        
        obj1.show();
        System.out.println();
        System.out.println("After poping");
        obj1.pop();
        obj1.show();   
    }
    
}
