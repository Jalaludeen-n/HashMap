public class LinkedList {
    private Node head;

    public boolean isEmpty() {
        return (head == null);
    }

    <T, D> void insertFirst(T key, D data) {
        Node newNode = new Node();
        newNode.insert(key, data, head);
        head = newNode;
    }

    public Node deleteFirst() {
        Node temp = head;
        head = head.next;
        return temp;
    }

    public void deleteAfter(Node after) {
        Node temp = head;
        while (temp.next != null && temp.data != after.data) {
            temp = temp.next;
        }
        if (temp.next != null)
            temp.next = temp.next.next;
    }

    void printLinkedList() {
        Node current = head;
        while (current != null) {
            current.displayNodeData();
            current = current.next;
        }
        System.out.println();
    }

    <K, T> T get(K key) {
        Node current = head;
        while (current != null) {
            if (current.isEqual(key))
                return (T) current.data;
            current = current.next;
        }
        return (T) current.data;
    }

    <K> boolean check(K key) {
        Node current = head;
        while (current != null) {
            if (current.isEqual(key))
                return true;
            current = current.next;
        }
        return false;
    }

    <K, D> void replace(K key, D data) {
        Node current = head;
        while (current != null) {
            if (current.isEqual(key))
                current.replaceData(data);
            current = current.next;
        }
    }

    int count() {
        Node current = head;
        int count = 0;
        while (current != null) {
            count++;
            current = current.next;
        }
        return count;
    }

    <D> boolean dataIsThere(D data) {
        Node current = head;
        while (current != null) {
            if (current.DataIsEqual(data))
                return true;
            current = current.next;
        }
        return false;
    }

    <K, D> void insertLast(K key, D data) {
        Node current = head;
        System.out.println(current.data);
        while (current.next != null) {
            current = current.next;
        }
        Node newNode = new Node();
        newNode.data = data;
        newNode.key = key;
        current.next = newNode;
    }
}
