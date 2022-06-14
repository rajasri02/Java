package LinkedLists;

public class Circularll {

     private Node head;
     private Node tail;
    private class Node{
         private int val;
         private Node next;
        public Node(int val)
        {
            this.val = val;
        }
    }
    public void insert(int val)
    {
        Node node = new Node(val);
        if(head == null)
        {
            node.next = null;
            head = tail = node;
        }
        node.next = head;
        tail.next =node;
        tail = node;
    }
    public void delete(int val)
    {
        Node node = head;
        if(node == null)
            return;
        if(node.val == val)
        {
            head = head.next;
            tail.next = head;
            return;
        }
        do{
            Node n = node.next;
            if(n.val== val)
            {
               node.next = n.next;
            }
            node = node.next;
        }while(node!=head);
    }
    public void display()
    {
        Node node = head;
        if(head!=null) {
            do {
                System.out.print(node.val);
                node = node.next;
            } while (node != head);
        }
    }


}
