public class insertAtMid {
    public static class Node {
        int data;
        Node next;
        
        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    
    public static void print(Node head) {
        if (head == null) return;
        System.out.println(head.data);
        print(head.next);
    }

    public static Node insertAtIndex(Node head, int data, int index){
        Node ptr = new Node(data);
        Node p = head;
        int i = 0;
        while (i != index-1) {
            p = p.next;
            i++;
        }
        ptr.data = data;
        ptr.next = p.next;
        p.next = ptr;
        return head;
    }

    public static void main(String[] args) {
        Node head = new Node(20);
        Node second = new Node(30);
        Node third = new Node(40);
        Node tail = new Node(50);
        head.next = second;
        second.next = third;
        third.next = tail;
        tail.next = null;
        head = insertAtIndex(head, 35, 2);
        print(head);
    }
}
