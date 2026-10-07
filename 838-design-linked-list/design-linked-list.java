class MyLinkedList {

    class Node {
        int data;
        Node next;
        Node prev;

        Node(int data) {
            this.data = data;
            this.next = null;
            this.prev = null;
        }
    }

    Node head;
    Node tail;
    int size;

    public MyLinkedList() {
        head = null;
        tail = null;
        size = 0;
    }

    public int get(int index) {
        if (index < 0 || index >= size) {
            return -1;
        }

        Node curr = head;
        int i = 0;

        while (curr != null) {
            if (i == index) {
                return curr.data;   // Fixed
            }
            curr = curr.next;
            i++;
        }

        return -1;
    }

    public void addAtHead(int val) {
        Node newNode = new Node(val);

        if (head == null) {
            head = newNode;
            tail = newNode;   // Fixed
        } else {
            newNode.next = head;
            head.prev = newNode;
            head = newNode;
        }

        size++;
    }

    public void addAtTail(int val) {
        Node newNode = new Node(val);

        if (tail == null) {
            head = newNode;   // Fixed
            tail = newNode;
        } else {
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
        }

        size++;
    }

    public void addAtIndex(int index, int val) {

        if (index < 0 || index > size) {
            return;
        }

        if (index == 0) {
            addAtHead(val);
            return;
        }

        if (index == size) {
            addAtTail(val);
            return;
        }

        Node curr = head;
        int i = 0;

        while (curr != null) {

            if (i == index) {

                Node newNode = new Node(val);

                Node pre = curr.prev;

                pre.next = newNode;
                newNode.prev = pre;

                newNode.next = curr;
                curr.prev = newNode;

                size++;
                return;
            }

            curr = curr.next;
            i++;
        }
    }

    public void deleteAtIndex(int index) {

        if (index < 0 || index >= size) {
            return;
        }

        if (size == 1) {
            head = null;
            tail = null;
            size--;
            return;
        }

        if (index == 0) {
            head = head.next;
            head.prev = null;
            size--;
            return;
        }

        Node curr = head;
        int i = 0;

        while (curr != null) {

            if (i == index) {

                Node pre = curr.prev;
                Node next = curr.next;

                pre.next = next;

                if (next != null) {
                    next.prev = pre;
                } else {
                    tail = pre;
                }

                size--;
                return;
            }

            curr = curr.next;
            i++;
        }
    }
}

/**
 * Your MyLinkedList object will be instantiated and called as such:
 * MyLinkedList obj = new MyLinkedList();
 * int param_1 = obj.get(index);
 * obj.addAtHead(val);
 * obj.addAtTail(val);
 * obj.addAtIndex(index,val);
 * obj.deleteAtIndex(index);
 */