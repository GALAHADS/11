
import java.util.Iterator;

public class XArrayQueue<T> implements XQueue<T>{
    private T[] wow;
    private int INITIAL_CAPACITY =10;
    private int size;
        int MAXMODE = 1000;
        int front;    //머리 쪽에 위치할 index값, pop할때 참조하는 index
        int rear;    //꼬리 쪽에 위치할 index값, push할때 참조하는 index
        public XArrayQueue(int size) {
            front = rear = 0;    //초기값 0
            wow = (T[]) new Object[MAXMODE]; //배열 생성
            this.size =size;
        }
    


    @Override
    public boolean enqueue(T element) {
        if(rear == MAXMODE){
            System.err.println("it's fool");
            return false;
        }
        wow[rear++] = element;
        size++;
        return true;
        
    }

    @Override
    public T dequeue() {
        if(rear == 0 && front == 0){
            System.err.println("empty");
            return null;
        }
        T x = wow[front];
        front++;
        size--;
        return x;
    }

    @Override
    public T peek() {
        return wow[front];
         
    }

    @Override
    public int size() {
        return rear - front;
    }

    @Override
    public boolean isEmpty() {
        return (front > rear);
    }

    @Override
    public void clear() {
        for (int i = front; i < rear+1; i++) {
            wow[i]=null;
        }
        front=size=rear=0;
        
    }

    @Override
    public XQueue<T> copy() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Iterator<T> iterator() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public static void main(String[] args) {
        XQueue<Integer> queue = new XArrayQueue<>(3);  // 초기 크기 3

queue.enqueue(10);
queue.enqueue(20);
queue.enqueue(30);

System.out.println(queue.dequeue());  // 출력: 10
queue.enqueue(40);

System.out.println(queue.peek());  // 출력: 20
System.out.println(queue.size());  // 출력: 3

queue.enqueue(50);  // 크기 자동 확장 발생 (크기: 6)
System.out.println(queue.size());  // 출력: 4

    }
    
}
