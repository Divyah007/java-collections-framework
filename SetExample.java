//Set Interface
//        --------------
//        • Set is an interface which is implemented by 3 different classes -
//        1. HashSet
//        2. Treeset
//        3. LinkedHashSet
//        • Set interface does not have index based process.
//        • Default capacity is 16.
//        • Duplicate objects are not allowed.
//        • Set is only uni directional, so it supports only Iterator
//interface(cursor).
//        • Methods of set interface -
//        javap java.util.set
//        239 G.Ravi Kiran_KCCM5
//        1.HashSet
//        ----------
//        • It is a class which implements set interface.
//        • Introduced in 1.2 Version
//        • Hetrogenous objects are allowed.
//        • Duplicates are not allowed. In case if we add, we won't get compile
//        time error, it will just add once.
//        • Only one NULL object is allowed.
//        • Data structure is hashtable.
//        • Insertion order is preserved(depends on hashcode number).
//        import java.util.*; //Ex
//public class Seventh {
//    public static void main(String[] args) {
//        HashSet s1=new HashSet();
//        s1.add("java");
//        s1.add(1223);
//        s1.add("selenium");
//        s1.add(88.9f);
//
//        Iterator i1=s1.iterator();
//        while(i1.hasNext())
//        {
//            System.out.println(i1.next());
//        }
//    }}
//Output:
//        java
//        selenium
//        1223
//        88.9
//
//===========
//2.LinkedHashSet
//        ----------------
//        It is a class which extends HashSet and implements set interface.
//        Features:
//        • Introduced in 1.2v
//        • Heterogenous objects are allowed
//        • Duplicates are not allowed. In case if we add we won't get compile
//        time error, it will just add once
//        • only one NULL object is allowed
//        • Data structure is Linkedlist.
//        • Insertion order is preserved.
//        • Set is only uni directional so it supports only Iterator
////Same program only difference is output is as per insertion order//
//        import java.util.*; //Ex
//public class Seventh
//{
//    public static void main(String[] args) {
//        LinkedHashSet<Object> s1=new LinkedHashSet<>();
//        s1.add("Rohan");
//        s1.add("Riya");
//        s1.add("Pooja");
//        s1.add(445);
//        s1.add('A');
//        System.out.println("Hash set objectss are: "+s1);
//        s1.add("Riya");
//        s1.add(445);
//        System.out.println("After add duplicates: "+s1);
//        s1.add(null);
//        s1.add(null);
//        System.out.println("After adding null objects: "+s1);
//        System.out.println("-------Forward direction-----");
//        Iterator<Object> i1=s1.iterator();
//        while(i1.hasNext())
//        {
//            System.out.println(i1.next());
//        }
//    }}
//Output:
//        Hash set objectss are: [Rohan, Riya, Pooja, 445, A]
//        245 G.Ravi Kiran_KCCM5
//        After add duplicates: [Rohan, Riya, Pooja, 445, A]
//        After adding null objects: [Rohan, Riya, Pooja, 445, A, null]
//        -------Forward direction-----
//        Rohan
//        Riya
//        Pooja
//        445
//        A
//        null
//        3.Treeset
//        ----------
//        It is a class which implements set interafce.
//        Features:
//        • Introduced in 1.2v
//        • Heterogenous objects are not allowed if we add we will get class cast
//exception
//• Duplicates are not allowed .In case if we add we won't get compile
//        time error, it will just add once
//        • No NULL object is allowed
//        • Data structure is tree.
//        • Output is in Sorted Order.
//        • Set is only uni directional so it supports only Iterator
//        import java.util.*; //Ex-1
//public class Seventh
//{
//    public static void main(String[] args) {
//        TreeSet<Object> s1=new TreeSet<>();
//        s1.add("Rohan");
//        s1.add("Riya");
//        s1.add("Pooja");
//        s1.add(445);
//        s1.add('A');
//        System.out.println("Hash set objectss are: "+s1);
//    }}
//Output:
//        Exception in thread "main" java.lang.ClassCastException:
//        java.base/java.lang.String cannot be cast to java.base/java.lang.Integer
//        246 G.Ravi Kiran_KCCM5
//        import java.util.*; //Ex-2
//public class Treedemo {
//    public static void main(String[] args) {
//        TreeSet<Object> s1=new TreeSet<>();
//        s1.add("Java");
//        s1.add("SQL");
//        s1.add("APtitude");
//        s1.add("J2EE");
//        System.out.println("Treeset Objects are: "+s1);
        //s1.add(122);
        //s1.add('A');
        //s1.add(new Student("John",566));
        //System.out.println("Tree set after adding heterogenous obj
//:"+s1);
        //s1.add(null);
        //System.out.println("After adding null :"+s1);
//        System.out.println( s1.first());
//        System.out.println(s1.last());
//        System.out.println(s1.pollFirst());
//        System.out.println(s1.pollLast());
//        System.out.println(s1.contains("APtitude"));
//        System.out.println(s1.contains("SQL"));
//    }}
//Output:
//        Treeset Objects are: [APtitude, J2EE, Java, SQL]
//        APtitude
//        SQL
//        APtitude
//        SQL
//        false
//        false
//        • In Treeset output will defaultly in sorted order
//        • It allows only homogenous objects i.e it allows only comparable type
//        of objects, if we add heterogeneous objects it gives ClassCastExc.
//        • If we add null objects it gives NullPointerException.
//        • first()-->provides first object
//        • last()--->provides last object
//        • pollFirst()-->provides first object and delete it from tree
//        • pollLast()--->provides last object and delete it from tree


import java.util.*;
import javax.ide.util.*;
public class SetExample {
    public static void main(String[] args) {
        Graph<Integer> graph = new UndirectedGraph<>(); // or new DirectedGraph<>();


    }


}
