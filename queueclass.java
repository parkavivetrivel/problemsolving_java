public class queueclass {
    int size = 5;
    int[] arr = new int[size];
    int front= -1;
    int rear = -1;

    queueclass() {
        front = 0;
        rear = 0;
    }
    public void enqueue(int a){
        if(rear<size){
            arr[rear]=a;
            rear++;
        }
        else{
            System.out.println("Stack is full");
        }
    }
    public void show(){
        for(int i = front;i<=rear-1;i++){
            System.out.print(arr[i]+" ");
        }
    } 
    public void dequeue(){
        int element = arr[front];
        System.out.println();
        System.out.println("removed element from the queue "+element);
        front++;

    }
    public static void main(String []arg){
        queueclass obj1 = new queueclass();
        obj1.enqueue(10);
        obj1.enqueue(20);
        obj1.enqueue(30);
        obj1.show();
        obj1.dequeue();
        obj1.show();


    }
    
}
