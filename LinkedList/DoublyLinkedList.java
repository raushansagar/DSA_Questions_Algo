


// Insertion at doubly linked list

class Solution1 {
    class Node {
        int data;
        Node next;
        Node prev;

        Node(int data) {
            this.data = data;
            next = prev = null;
        }
    }

    Node insertAtPos(Node head, int p, int x) {
        if (head == null) {
            return head;
        }

        Node temp = head;
        while (p-- > 0 && temp != null) {
            temp = temp.next;
        }

        Node next = null;
        if (temp.next != null) {
            next = temp.next;
        }

        Node newNode = new Node(x);
        temp.next = newNode;
        newNode.prev = temp;
        temp = newNode;

        if (next != null) {
            temp.next = next;
            next.prev = temp;
        }

        return head;
    }
}
