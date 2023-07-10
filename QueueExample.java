import java.util.*;

//
//Queue Interface
//        • Queue is an Interface which is implemented by 2 different classes -
//        1. PriorityQueue
//        2. LinkedList
//        3.array deque
//        • Queue is a data structure which usually follows FIFO principle(First
//        in First out)
//
//
public class QueueExample {
    public static void main(String[] args) {
       // 1. ARRAYDEQUEUE
//        1. doesnot allow null vale
//            2.allows duplicate
//      3.  a deque can be used as a stack or a queue.
//                4. We know that the stack supports the Last In First Out (LIFO) operation,
//            and the operation First In First Out is supported by a queue
       // 5. order of insertion is preserved
        Deque<Integer> ad = new ArrayDeque<>();
        //1.stack
//        ad.add(66);
//        ad.add(12);
//        ad.add(2);
//        ad.add(97);
//        ad.add(1);
//        ad.add(12);
       // ad.pop();//removes the top element
        //System.out.println("ad.peek()==>"+ad.peek());//prints top ele
       // System.out.println("ad.peekLast()==>"+ad.peekLast());// prints last element

        //ad.forEach(System.out::println);
//==========
        //2.queue

//        The only difference is the return type
//
//        System.out.println(stack.push("1"));
//
//        Output : 1
//
//        System.out.println(stack.add("2"));
//
//        Output : true

        //push-pop should only be used for stack

//        Deque<Integer> adq = new ArrayDeque<>();
//        adq.push(1);
//        adq.push(89);
//        adq.push(77);
//        adq.push(89);
       // adq.push(null);//npe

       // System.out.println(adq);
//        adq.addFirst(25);
//        adq.addLast(1998);
//        adq.removeFirst();
//        adq.removeLast();


//==========================================
       // 2. priority queue
//        • It allows only homogenous objects.
//        • Bascially data structure of Queue is FIFO but in PriorityQueue
//        internal sorting will happen.
//        • Duplicate objects are allowed.
//        • Null objects are not allowed.
//       . priority queue elements are retrieved in sorted order(asc).
//       . It is important to note that the elements of a priority queue may not be sorted.
//        However, elements are always retrieved in sorted order.
//        PriorityQueue<Integer> pq=new PriorityQueue<>();
//        pq.add(18);
//        pq.add(22);
//        pq.add(32);
//        pq.add(22);
//        pq.add(4);
//        pq.add(22);
        //pq.remove(22);//removes only first occurence
       // System.out.println("pq.peek() ==>"+pq.peek());//gives the first (left) element after sorting
      //  System.out.println("pq.poll()==>"+pq.poll());//gives the first (left) element after sorting, and then it removes it

       // pq.forEach(System.out::println);


         Queue<Integer> q=new LinkedList<>();
         q.add(null);
         q.add(89);
        System.out.println(q);






    }
}
;