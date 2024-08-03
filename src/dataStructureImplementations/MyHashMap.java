package dataStructureImplementations;

public class MyHashMap<K, V> {


    private final int capacity;
    private final Entry<K, V>[] array;

    public MyHashMap() {
        this.capacity = 10;
        this.array = new Entry[this.capacity];
    }

    @Override
    public String toString() {

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < this.array.length; i++) {
            sb.append(i).append(" ").append(array[i]).append("\n");
        }
        return sb.toString();
    }

    public void put(K key, V value) {
        int hash = (key.hashCode() & 0x7FFFFFFF) % capacity;
        Entry<K, V> current = array[hash];

        if (current == null) {
            array[hash] = new Entry<K, V>(key, value);
        } else {
            while (current.next != null) {
                if (current.getKey().equals(key)) {
                    current.setValue(value);
                    return;
                }
                current = current.next;
            }
            if (current.getKey().equals(key)) {
                current.setValue(value);
                return;
            }
            current.next = new Entry<>(key, value);

        }

    }

    public V get(K key) {
        int hash = (key.hashCode() & 0x7FFFFFFF) % capacity;
        Entry<K, V> current = array[hash];
        if (current != null) {
            while (current != null) {
                if (current.getKey().equals(key)) {
                    return current.getValue();
                }
                current = current.next;
            }

        }
        return null;

    }

    public V remove(K key) {
        int hash = (key.hashCode() & 0x7FFFFFFF) % capacity;
        Entry<K, V> current = array[hash];
        if (current == null) {
            return null;
        }
        if (current.getKey().equals(key)) {
            array[hash] = current.next;
            current.next = null;
            return current.value;
        }
        Entry<K, V> prev = current;
        while (current != null) {
            if (current.getKey().equals(key)) {
                prev.next = current.next;
                current.next = null;
                return current.value;
            }
            prev = current;
            current = current.next;
        }
        return null;
    }


    private static class Entry<K, V> {

        K key;
        V value;
        Entry<K, V> next;

        private Entry(K key, V value) {
            this.key = key;
            this.value = value;
        }

        @Override
        public String toString() {
            Entry<K, V> temp = this;
            StringBuilder sb = new StringBuilder();
            while (temp != null) {
                sb.append(temp.key).append(" -> ").append(temp.value).append(",");
                temp = temp.next;
            }
            return sb.toString();
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
