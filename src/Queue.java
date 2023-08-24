import java.awt.desktop.QuitHandler;

public class Queue {

    private static Queue queue;

    private int[] Queue;
    private int rear;
    private int size;
    private int front;


    public Queue(int size) {
        this.size = size;
        Queue = new int[size];
        rear = -1;
    }

    public boolean isempty() {

        return rear == -1;
    }

    public boolean isfull() {
        return rear == size - 1;

    }

    public boolean insert(int data) {
        if (isfull()) {
            return false;
        }else {
            Queue[++rear] = data;
        }
        return true;
    }

    public int delete() {
        if (isempty()) {
            return 0;
        }
        front = Queue[0];

        for (int i = 0; i <= rear -1; i++) {

            Queue[i] = Queue[i + 1];
        }
        rear--;
        return front;
    }

    public void display() {

        for (int i = 0; i <= rear; i++) {
            System.out.println(Queue[i] + " ");
        }
        System.out.println();
    }
    public static Queue getInstance() {

        if (queue == null){
             queue = new Queue(3);
        }
        return queue;
    }
}






















// front does not implementing
//delete
//data=arr[f]
//for loop