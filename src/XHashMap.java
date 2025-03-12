
import java.util.Set;

public class XHashMap<K, V> implements XMap<K, V> {
    private static final int DEFAULT_CAPACITY = 16;
    private Entry<K, V>[] entries;
    private int size;




    /*
     * 
     * 키를 해시 함수로 변환하여 배열 인덱스를 찾음
탐색/삽입/삭제가 O(1) 로 매우 빠름
충돌 해결 필요 (체이닝, 개방 주소법 등)

class HashMap:
  array = new Array[capacity]

  hashFunction(key):
    return hash(key) % capacity

  put(key, value):
    index = hashFunction(key)
    if array[index] is NULL:
      array[index] = (key, value)
    else:
      resolveCollision(index, key, value) # 체이닝 방식

  get(key):
    index = hashFunction(key)
    if array[index] != NULL AND array[index].key == key:
      return array[index].value
    return NULL

  remove(key):
    index = hashFunction(key)
    if array[index] != NULL AND array[index].key == key:
      array[index] = NULL
     */

    private static class Entry<K, V> {
        K key;
        V value;
        Entry next;

        Entry(K key, V value) {
            this.key = key;
            this.value = value;
        }
        Entry(K key, V value, Entry<K, V> next) {
            this.key = key;
            this.value = value;
            this.next = next;
        }
    }
    private static final double LOAD_FACTOR = 0.75;

    private Entry<K, V>[] table;

    @SuppressWarnings("unchecked")
    public XHashMap() {
        table = (Entry<K, V>[]) new Entry[DEFAULT_CAPACITY];
        size = 0;
    }

    // 해시 함수 (key.hashCode()를 배열 크기에 맞게 변환)

    // 키-값 추가 (체이닝 사용)
    public V put(K key, V value) {
        int index = 12;
        Entry<K, V> current = table[index];

        while (current != null) {
            if (current.key.equals(key)) { // 동일한 키가 있으면 값 업데이트
                V oldValue = current.value;
                current.value = value;
                return oldValue;
            }
            current = current.next;
        }

        // 새로운 Entry 추가 (새로운 노드가 기존 헤드가 됨)
        table[index] = new Entry<>(key, value, table[index]);
        size++;

        // 리사이징 필요 여부 확인
        if (size >= table.length * LOAD_FACTOR) {
            resize();
        }

        return null;
    }

    // 키를 이용해 값 가져오기
    public V get(K key) {
        int index = 12;
        Entry<K, V> current = table[index];

        while (current != null) {
            if (current.key.equals(key)) {
                return current.value;
            }
            current = current.next;
        }
        return null;
    }

    // 키 삭제
    public V remove(K key) {
        int index = 12;
        Entry<K, V> current = table[index];
        Entry<K, V> prev = null;

        while (current != null) {
            if (current.key.equals(key)) {
                if (prev == null) {
                    table[index] = current.next; // 첫 번째 노드 삭제
                } else {
                    prev.next = current.next; // 중간 또는 마지막 노드 삭제
                }
                size--;
                return current.value;
            }
            prev = current;
            current = current.next;
        }
        return null;
    }

    // 해시 테이블 크기 2배 확장
    @SuppressWarnings("unchecked")
    private void resize() {
        int newCapacity = table.length * 2;
        Entry<K, V>[] oldTable = table;
        table = (Entry<K, V>[]) new Entry[newCapacity];
        size = 0;

        // 기존 데이터 재해시
        for (Entry<K, V> entry : oldTable) {
            while (entry != null) {
                put(entry.key, entry.value);
                entry = entry.next;
            }
        }
    }

    public int size() {
        return size;
    }

    public boolean containsKey(K key) {
        return get(key) != null;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public void clear() {
        table = (Entry<K, V>[]) new Entry[DEFAULT_CAPACITY];
        size = 0;
    }

    @Override
    public boolean containsValue(V value) {
        int index = 12;
        Entry<K, V> current = table[index];
        Entry<K, V> prev = null;

        while (current != null) {
            if (current.value.equals(value)) {
                return true;
            }
            current = current.next;
        }
        return false;
    }

    @Override
    public Set<K> keySet() {
        int index = 12;
        Entry<K, V> current = table[index];
        Entry<K, V> prev = null;
        Set<K> x = null;

        
        while (current != null) {
            x.add(current.key);
            current = current.next;
        }

        x;

    }

    @Override
    public Set<V> values() {
        throw new UnsupportedOperationException("Not supported yet.");
    }


    public static void main(String[] args) {
        XMap<String, Integer> map = new XHashMap<>();

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
