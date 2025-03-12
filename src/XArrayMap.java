import java.util.Set;

public class XArrayMap<K, V> implements XMap<K, V> {
    private static final int DEFAULT_CAPACITY = 10;
    private Entry<K, V>[] entries;
    private int size;

    private static class Entry<K, V> {
        K key;
        V value;

        Entry(K key, V value) {
            this.key = key;
            this.value = value;
        }
    }

    @SuppressWarnings("unchecked")
    public XArrayMap() {
        this.entries = (Entry<K, V>[]) new Entry[DEFAULT_CAPACITY];
        this.size = 0;
    }

    @Override
    public V put(K key, V value) {
        for (int i = 0; i < size; i++) {
            if (entries[i].key.equals(key)) {
                V oldValue = entries[i].value;
                entries[i].value = value;
                return oldValue;
            }
        }
        ensureCapacity();
        entries[size++] = new Entry<>(key, value);
        return null;
    }

    @Override
    public V get(K key) {
        for (int i = 0; i < size; i++) {
            if (entries[i].key.equals(key)) {
                return entries[i].value;
            }
        }
        return null;
    }

    @Override
    public boolean containsKey(K key) {
        return get(key) != null;
    }

    @Override
    public boolean containsValue(V value) {
        for (int i = 0; i < size; i++) {
            if (entries[i].value.equals(value)) {
                return true;
            }
        }
        return false;
    }

    @Override
    public V remove(K key) {
        for (int i = 0; i < size; i++) {
            if (entries[i].key.equals(key)) {
                V removedValue = entries[i].value;
                // 요소 앞으로 이동하여 순서 유지
                for (int j = i; j < size - 1; j++) {
                    entries[j] = entries[j + 1];
                }
                entries[--size] = null;
                return removedValue;
            }
        }
        return null;
    }

    @Override
    public void clear() {
        for (int i = 0; i < size; i++) {
            entries[i] = null;
        }
        size = 0;
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    @Override
    public Set<K> keySet() {
        @SuppressWarnings("unchecked")
        K[] keys = (K[]) new Entry[size];
        for (int i = 0; i < size; i++) {
            keys[i] = entries[i].key;
        }
        return keys;
    }

    @Override
    public Set<V> values() {
        @SuppressWarnings("unchecked")
        V values = (V) new Entry[size];
        for (int i = 0; i < size; i++) {
            values[i] = entries[i].lue;
        }
        return values;
    }

    private void ensureCapacity() {
        if (size == entries.length) {
            int newCapacity = entries.length == 0 ? DEFAULT_CAPACITY : entries.length * 2;
            @SuppressWarnings("unchecked")
            Entry<K, V>[] newEntries = (Entry<K, V>[]) new Entry[newCapacity];
            for (int i = 0; i < size; i++) {
                newEntries[i] = entries[i];
            }
            entries = newEntries;
        }
    }

    public static void main(String[] args) {
        XMap<String, Integer> map = new XArrayMap<>();

        map.put("Alice", 25);
        map.put("Bob", 30);
        map.put("Charlie", 35);
        System.out.println(map.get("Alice")); // 25

        System.out.println(map.containsKey("Bob")); // true
        System.out.println(map.containsValue(40)); // false

        map.remove("Charlie");
        System.out.println(map.containsKey("Charlie")); // false

        System.out.print("Keys: ");
        for (String key : map.keySet()) {
            System.out.print(key + " ");
        }
        System.out.println();

        System.out.print("Values: ");
        for (Integer value : map.values()) {
            System.out.print(value + " ");
        }
        System.out.println();

        map.clear();
        System.out.println(map.isEmpty()); // true
    }
}
