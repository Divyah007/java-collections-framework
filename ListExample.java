//list-->interface
//List follows Index Based process.
//        List allows hetrogeneous Objects.
//        List allows Null objects.
//===
//methods in list
//• add(object):Used to add objects
//        • addAll(Collection): Used to copy one collection objects into another
//        • remove(Object): Used to Removes object
//        • remove(Index): Used to Remove the Object at given index
//        • set(Index,Object): it replaces the old object with new object at given
//        index
//        • get(index): Retrieves the object at given index
//        229 G.Ravi Kiran_KCCM5
//        • isEmpty(): check whether Collections empty or not
//        • contains(Object): check whether Object is present or not
//        • containsAll(Collection): checks whether content of one collection is
//        present in another collection or not.
//        • removeAll(Collection): Removes whole objects of collection
//        • size(): Provides size of collection(always calculates from 1)
//        • Collections.sort(): Sort the collection in ascending order(In case
//        char's as per unicode order)
//        • Collections.reverse(): Sort in reverse way
//====
//1.ArrayList :
//        -------------
//        • ArrayList is a class which implements List interface
//• For checking methods
//        javap java.util.Arraylist
//
//        characteristics of ArrayList:
//        ---------------------------------
//        1.It is introduced in java 1.2-version.
//        2.ArrayList stores Heterogeneous data .
//        3.It is possible to add NULL objects in ArrayList.
//        4.It allows Duplicate objects.
//        5.In ArrayList Insertion Order is preserved i.e the way we
//        added objects the way it will be printed.
//        6.It follows Data Structure as growable size array.
//        7.Iterator and ListIterator cursors are used.
//=========
//Arrays are type safe but collections are not type safe
//        Ex: int a[]=new int[3];
//        a[0]=100;
//        a[1]="java";//CTE
//        Ex: ArrayList a=new ArrayList()
//        a.add("java");
//        a.add(100);
//        a.add('A');
//======
//Generics
//        ---------
//        Since Collections are not type safe i.e programmer can add any types of
//        objects there is no restriction for that so, to overcome this drawback JAVA
//        has given Generics concept where you can create an object of specific type,
//        if we add any other type of object than specified we will get CTE.
//        1. ArrayList<Integer> a1=new ArrayList<>();
//        a1.add("java");//CTE
//        a1.add(100);
//        a1.add('A');//CTE

///
//Vector
//        --------
//        • Introduced in 1.0 version, so Vector is also referred as Legacy class.
//        • Heterogenous objects are allowed.
//        • Null objects are allowed.
//        • Insertion order is preserved.
//        • Duplicate objects are allowed.
//        • Datastructure is growable array.
//        241 G.Ravi Kiran_KCCM5
//        • cursors - ListIterator and Iterator
//        • Same process to write program, only in place of arraylist object
//        create object of Vector.
public class ListExample {

}
