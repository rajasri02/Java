package LinkedLists;

public class Main {
    public static void main(String[] args)
    {
//      var list = new LinkedList();
//      System.out.println(list.size());
//      list.addlast(10);
//
//      list.addlast(20);
//
//      //list.addlast(30);
//      list.reverse();
//      var array = list.toArray();
//      System.out.println((Arrays.toString(array)));

//        DLL doublelist = new DLL();
//        doublelist.insertFirst(10);
//        doublelist.insertFirst(20);
//        doublelist.insertFirst(30);
//        doublelist.insertFirst(30);
//        doublelist.insertlast(50);
//        doublelist.display();
//        doublelist.displayInReverse();
        Circularll cll = new Circularll();
        cll.insert(10);
        cll.insert(20);
        cll.insert(30);
        cll.insert(40);
        cll.display();
        cll.delete(30);
        cll.display();

      


    }
}
