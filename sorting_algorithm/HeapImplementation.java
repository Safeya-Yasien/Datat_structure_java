package org.example;

import java.util.Collections;
import java.util.PriorityQueue;

public class HeapImplementation {

    public static void main(String [] args)
    {
        //Min heap
        PriorityQueue <Integer> pq = new PriorityQueue<>();

        //Max heap
        //PriorityQueue <Integer> pq = new PriorityQueue<>(Collections.reverseOrder());

        //time complexity of heap sort is O(log n)

        //put element
        pq.add(10);
        pq.add(50);
        pq.add(25);
        pq.add(20);
        pq.add(40);
        pq.add(10);

        //remove element
        //will remove the smallest element in heap 10
        System.out.println(pq.remove());
        //will remove the second-smallest element 10
        System.out.println(pq.remove());
        //will remove the third-smallest element 20
        System.out.println(pq.remove());
        // and so on

        //print heap now after removing the first three smallest numbers
        System.out.println(pq);

        //get the smallest element without remove it
        System.out.println(pq.peek());

        //print heap to ensure that nothing was remover
        System.out.println(pq);

        //get size of heap
        System.out.println(pq.size());
    }
}
