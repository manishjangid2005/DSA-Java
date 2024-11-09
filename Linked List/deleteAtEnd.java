public class deleteAtEnd {
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

    public void removeLast() {
        if (head == null) {
            System.out.println("List is empty and no need to delete");
            return;
        }
        if (head.next == null) {
            head =null;
            return;
        }
        Node temp = head;
        while (temp.next.next != null)
            temp = temp.next;
        temp.next = null
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
        head = 
        print(head);
    }
}
