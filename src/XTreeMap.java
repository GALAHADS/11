
import java.util.Set;

public class XTreeMap<K, V> implements XMap<K, V> {
    private Entry<K, V> root= null;
    private static final int DEFAULT_CAPACITY = 10;
    private int size;
    private static class Entry<K, V> {
        K key;
        V value;
        Entry ch1,ch2;

        Entry(K key, V value) {
            this.key = key;
            this.value = value;
            ch1 = null;
            ch2 = null;
        }
        Entry(K key, V value,Entry ch1) {
            this.key = key;
            this.value = value;
            this.ch1 = ch1;
            ch2= null;
        }
        Entry(K key, V value, Entry ch1, Entry ch2) {
            this.key = key;
            this.value = value;
            this.ch1 = ch1;
            this.ch2 = ch2;
        }
    }
    /*
     * class TreeMap:
  root = NULL

  put(key, value):
    if root is NULL:
      root = new TreeNode(key, value)
    else:
      insertRecursive(root, key, value)

  get(key):
    return searchRecursive(root, key)

  remove(key):
    root = deleteRecursive(root, key)

     */
    public K(String value) {
        this.value = value;
    }
    public int compareTo(K other) {
        return Integer.compare(root.key, other);  // 이름이 다르면 이름 기준으로 비교
    }

    @Override
    public V put(K key, V value) {
        if(root == null)
        root = new Entry(key, value);
        else{
            if(key.compareTo(root.key) <0)
            root.ch1 = new Entry(key, value);
            else if(root.key.hashCode() <key.hashCode())
            root.ch2 = new Entry(key, value);
            else root.value = value;

        }
         return  value;



       
    }
    private Entry<K, V> insert(Entry<K, V> node, K key, V value) {
        if (node == null) return new Entry<>(key, value); // 새로운 노드 삽입
    
        if (key.compareTo(node.key) < 0) 
            node.left = insert(node.left, key, value); // 왼쪽 서브트리로 이동
        else if (key.compareTo(node.key) > 0) 
            node.right = insert(node.right, key, value); // 오른쪽 서브트리로 이동
        else 
            node.value = value; // 기존 키면 값만 업데이트
    
        return node;
    }

    @Override
    public V get(K key) {
        while (root != null) {
            if(root.key.equals(key))
            return root.value;


            
        }

        return null;
    }

    @Override
    public boolean containsKey(K key) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public boolean containsValue(V value) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public V remove(K key) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void clear() {
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
    public Set<K> keySet() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Set<V> values() {
        throw new UnsupportedOperationException("Not supported yet.");
    }






    public static void main(String[] args) {
        XMap<String, Integer> map = new XTreeMap<>();

    // 요소 추가
map.put("Alice", 25);
map.put("Bob", 30);
map.put("Charlie", 35);
System.out.println(map.get("Alice")); // 출력: 25

// 키 존재 여부 확인
System.out.println(map.containsKey("Bob")); // 출력: true
System.out.println(map.containsValue(40)); // 출력: false

// 요소 삭제
map.remove("Charlie");
System.out.println(map.containsKey("Charlie")); // 출력: false

// 모든 키와 값 출력
System.out.println("Keys: " + map.keySet()); // 출력: [Alice, Bob]
System.out.println("Values: " + map.values()); // 출력: [25, 30]

// 전체 삭제 후 확인
map.clear();
System.out.println(map.isEmpty()); // 출력: true

    }
    
}
