class Node<D, K> {
    D data;
    K key;
    Node next;

    void displayNodeData() {
        System.out.println("{ " + data + " } ");
    }

    void insert(K key, D data, Node head) {
        this.key = key;
        this.data = data;
        this.next = head;
    }

    void displayNodeKey() {
        System.out.println("{" + key + "}");
    }

    boolean isEqual(K key) {
        return this.key.equals(key);
    }

    void replaceData(D data) {
        this.data = data;
    }

    <D> boolean DataIsEqual(D data) {
        return this.data.equals(data);
    }
}

