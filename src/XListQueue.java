
import java.util.Iterator;

public class XListQueue<T> implements XQueue<T>{
    private XLinkedList<T> list;

    // 생성자에서 XLinkedList를 받아 초기화
    public XListQueue(XLinkedList<T> list) {
        this.list = list;
    }

    public static class XLinkedList<T> {
        private static class Node<T> {
            T value;
            Node<T> next;

            Node(T value) {
                this.value = value;
                this.next = null;
            }
        }

        private Node<T> front;
        private Node<T> rear;
        private int size;

        public XLinkedList() {
            this.front = null;
            this.rear = null;
            this.size = 0;
        }
    }


    @Override
    public boolean enqueue(T element) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public T dequeue() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public T peek() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int size() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public boolean isEmpty() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void clear() {
        throw new UnsupportedOperationException("Not supported yet.");
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
        XQueue<Integer> queue = new XListQueue<>(new XLinkedList<>());  // 내부적으로 연결 리스트 사용

queue.enqueue(10);
queue.enqueue(20);
queue.enqueue(30);

System.out.println(queue.dequeue());  // 출력: 10
queue.enqueue(40);

System.out.println(queue.peek());  // 출력: 20
System.out.println(queue.size());  // 출력: 3

        
    }
}
