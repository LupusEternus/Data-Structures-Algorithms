package dataStructureImplementations;

public class MyHashMap<K, V> {


    private final int capacity;
    private Entry<K, V>[] array;

    public MyHashMap() {
        this.capacity = 10;

    }

    public void put(K key, V value) {
        int hash = key.hashCode() % capacity;
        Entry<K, V> current = array[hash];

        if (current == null) {
            array[hash] = new Entry<K, V>(key, value);
        } else {
            while (current.next != null) {
                if (current.getKey() == key) {
                    current.setValue(value);
                    return;
                }
                current = current.next;
            }
            if (current.getKey() == key) {
                current.setValue(value);
                return;
            }
            current.next = new Entry<>(key, value);

        }

    }

    public Entry<K, V> get(K key) {


    }


    private static class Entry<K, V> {

        K key;
        V value;
        Entry<K, V> next;

        private Entry(K key, V value) {
            this.key = key;
            this.value = value;
        }

        private K getKey() {
            return key;
        }

        private V getValue() {
            return value;
        }

        private void setValue(V value) {
            this.value = value;
        }


    }


}
