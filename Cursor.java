//
//Cursors
//        --------
//        • This is the special characteristics given for collection concepts
//        • Using cursors we can retrieve the objects in collection one by one
//        • they are of 2 types -
//        1.Iterator
//        2.ListIterator
//        1.Iterator
//        ----------
//        • Iterator is an interface which is used to traverse the list in forward
//        direction.
//        • Basically it provides the privilige to access the objects without
//        using index.
//interface Iterator
//{
//    public boolean hasNext();
//    public object next();
//    public void remove();
//}
//    hasNext():
//        • It returns true, if there is Object available in collection.
//        next():
//        • It returns current Object and move the cursor to next Object.
//        2.ListIterator
//        --------------
//        • ListIterator is an interface which provides the facility to traverse
//        the list in forward as well as backward direction.
//interface ListIterator
//{
//    public boolean hasNext();
//    public object next();
//    public void remove();
//    public boolean hasPrevious();
//    public object previous();
//    public void add();

//}
//    hasPrevious():
//        • Returns true, if object is available to iterate from previous
//        direction.
//        previous():
//        • prints the current object and move the cursor to next object in
//        previous direction.
//        hasNext():
//        • It returns true, if there is Object available.
//        next():
//        • It returns current Object and move cursor to next Object.

//
//ArrayList<String> a1=new ArrayList<>();
//        a1.add("Java");
//        a1.add("SQL");
//        a1.add("Selenium");
//        a1.add("Aptitude");
//        System.out.println("Objects from forward direction");
//        //toString(),foreachloop,forloop
//        //(listIteraot()=new ListIterator())
//        //using Listiterator interface
//        ListIterator i1=a1.listIterator();
//        while(i1.hasNext())
//        {
//        System.out.println(i1.next());
//        }
//        System.out.println("Object from backward direction");
//        while(i1.hasPrevious())
//        {
//        System.out.println(i1.previous());
//        }
//        }}

////
//Collections.sort(a1)
//        Collections.reverse(a1);

//
//Differences between Iterator and ListIterator
//        Iterator ListIterator
//        It is an interface used to retrieve
//        objects in forward direction.
//        It is an interface used to retrieve
//        objects in forward as well as
//        backward direction.
//        It is used for all collection
//        classes.
//        It is only used for classes which
//        implements ListInterface -
//        Arraylist, LinkedList, Vector
//        Iterator object, we will get by using
//        iterator()
//        Listiterato object, we will get by
//        using listIterator()
//        Using iterator interface methods, we
//        can traverse only in forward
//        direction i.e hasNext(), next()
//        Using ListIterator methods, we can
//        traverse in both forward and
//        backward direction hasNext(),
//        next(), hasPrevious(), previous()

public class Cursor {
}
