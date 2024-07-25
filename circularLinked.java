public class circularLinked {
    int size = 5;
    int[] arr = new int[size];
    int front= -1;
    int rear = -1;
    circularLinked(){
        front =0;
        rear = 0;
    }
    public void enqueue(int a){
        if(rear<size){
            arr[rear]=a;
            rear++;
        }
        else{
            if(front>1){
                front--;
                if(front == 0){
                arr[front]=a;
                }
                else{
                    front = 0;
                    arr[front]=a;
                    front++;

                }
                //front++;
            }
            else{
            System.out.println("Stack is full");
            }
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

    public static void main(String[] args) {
        circularLinked obj1 = new circularLinked();
        obj1.enqueue(10);
        obj1.enqueue(20);
        obj1.enqueue(30);
        obj1.enqueue(40);
        obj1.enqueue(50);
        obj1.show();
        obj1.dequeue();
        obj1.dequeue();
        obj1.dequeue();

        obj1.enqueue(100);
        obj1.enqueue(200);
        //obj1.enqueue(300);
        obj1.show();
    
    }
    
}
