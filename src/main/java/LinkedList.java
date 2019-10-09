public class LinkedList<K, D> {
    private Node head;

    void insertFirst(K key, D data) {
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

    D get(K key) {
        Node current = head;
        while (current != null) {
            if (current.isEqual(key))
                return (D) current.data;
            current = current.next;
        }
        return (D) current.data;
    }

    boolean check(K key) {
        Node current = head;
        while (current != null) {
            if (current.isEqual(key))
                return true;
            current = current.next;
        }
        return false;
    }

    void replace(K key, D data) {
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

    boolean dataIsThere(D data) {
        Node current = head;
        while (current != null) {
            if (current.DataIsEqual(data))
                return true;
            current = current.next;
        }
        return false;
    }

    void insertLast(K key, D data) {
        Node current = head;
        Node newNode = new Node();
        if (current == null) {
            newNode.key = key;
            newNode.data = data;
            current = newNode;
        } else {
            while (current != null) {
                current = current.next;
            }
            newNode.data = data;
            newNode.key = key;
            current.next = newNode;
        }
        System.out.println(current.data);
    }
}
