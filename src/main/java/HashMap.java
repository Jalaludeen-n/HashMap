class HashMap<K, D> {
    static final int arraySize = 100;
    static final int zero = 0;

    private LinkedList[] array = new LinkedList[arraySize];

    private int hashing(K key) {
        return key.hashCode() % arraySize;
    }

    private boolean isNull(int key) {
        return array[key] == null;
    }

    void put(K key, D data) {
        int index = hashing(key);
        if (isNull(index)) {
            array[index] = new LinkedList();
            array[index].insertFirst(key, data);
        } else {
            if (isKeyUnique(key))
                array[index].insertFirst(key, data);
            else {
                array[index].replace(key, data);
            }
        }
        // Node node = new Node();
        //node.data = 1;
    }
    // a=0;
    // array [100] = null; NODE
    // array[0] == null;
    // array[0]=new Node;
    //array[0]=data,key,next;
    //a = 1
    //a = 1
    //a = 1
    //array[0] -> node[1]->next=null;

  // a = b;
    //a =d;


    private boolean isKeyUnique(K key) {
        int index = hashing(key);
        return !array[index].check(key);
    }

    D get(K key) {
        return array[hashing(key)].get(key);
    }

    int size() {
        int count = zero;
        for (int i = zero; i < arraySize; i++) {
            if (array[i] != null) {
                count += array[i].count();
            }
        }
        return count++;
    }

    boolean containsKey(K key) {
        int index = hashing(key);
        return array[index].check(key);
    }

    boolean containsValue(D data) {
        for (int i = zero; i < 100; i++) {
            if (array[i] != null)
                if (array[i].dataIsThere(data))
                    return true;
        }
        return false;
    }
}