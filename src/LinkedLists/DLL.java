package LinkedLists;

public class DLL {
    Node head;

    private class Node {
        int val;
        Node next;
        Node prev;
        public Node(int val)
        {
            this.val = val;
        }
        public Node(int val,Node next,Node prev)
        {
            this.val = val;
            this.next = next;
            this.prev = prev;
        }
    }
    public void insertFirst(int val)
    {
        Node node = new Node(val);
        if(head == null)
        {

            head = node;
            node.next = node.prev = null;
        }
        else {
            head.prev = node;
            node.next = head;
            node.prev = null;
            head = node;
        }
    }
    public void insertlast(int val)
    {
        Node temp = head;
        Node node = new Node(val);
        node.next = null;
        if(head == null)
        {

            node.prev = null;
            head = node;
        }
        while(temp.next!= null)
        {
            temp = temp.next;
        }
        temp.next = node;
        node.prev = temp;

    }
    //public void insertAfter()

    public void display()
    {
        Node node = head;
        while(node!=null)
        {
            System.out.println(node.val + "->");
            node = node.next;
        }
    }
    public void displayInReverse()
    {
        Node temp = head;
        while(temp.next!= null)
        {
            temp = temp.next;
        }
        while(temp != null)
        {
            System.out.print(temp.val + "->");
            temp = temp.prev ;
        }
    }

}
