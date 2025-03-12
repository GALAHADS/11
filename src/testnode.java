
import java.lang.classfile.components.ClassPrinter;

public class testnode {
    class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
        }

        Node(int data, Node next) {
            this.data = data;
            this.next = next;
        }
        void delete(int[] a, int n, int x){
            a[n] = 0;
        }

        int size(Node list){
            int a=0;
            for(Node p = this; next != null; p = p.next)
             a++;

             return  a;
        }
        int sum(Node list){
            int s =0;
            while (list.next != null) { 
                s += list.data;
                list = list.next;
                
            }
            return s;
        }
        void removeLast(Node list){
            while (true) { 
                if((list.next).next != null){
                    next = null;
                    break;
                }
                list = list.next;
            }
        }

        Node copy(Node list){
            Node a = new Node(list.data, null);
            return a;
        }
        Node sublist(Node list, int p, int q){
            Node a;
            for (int i = 0; i < q; i++) {
                if(i >= p)
                a.
            }

        }

        void append(Node list1, Node list2){
            while (list1.next != null) { 
                list1= list1.next;
            }
            list1.next = list2;
        }
// 전제조건: list1은 적어도 하나의 노드를 가지고 있어야 함;
// 후제조건: list2가 list1에 추가되었습니다;

// 반환값: 지정된 리스트에서 p부터 q까지의 노드들을 복사한 새로운 리스트;
// 노트: 두 리스트는 완전히 독립적이어야 합니다. 한 리스트를 변경해도 다른 리스트에는 영향을 미치지 않아야 합니다.

// 반환값: 지정된 리스트의 복제본인 새로운 리스트;

// 전제조건: 지정된 리스트에는 적어도 두 개의 노드가 있어야 함;
// 후제조건: 리스트의 마지막 노드가 삭제되었습니다;

// 반환값: 지정된 리스트의 정수들의 합;

// 반환값: 지정된 리스트의 노드 수;

        // 전제조건: 0 <= n < a.length;
        // 후제조건: a[0], ..., a[n-1] 중 첫 번째로 나타나는 x가 삭제되었습니다;
        
    }
    public static void main(String[] args) {
        
    }
}
