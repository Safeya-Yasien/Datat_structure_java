package org.example;

import java.util.LinkedList;

public  class implementation_of_single_linked_list
{
    private Node head;

    private static class Node
    {
        private int data;
        private Node next;

        public Node(int data)
        {
            this.data = data;
            this.next = null;
        }
    }

    //The head pointer will always point to the first node in the linked list,
    // which is the most recently added node.
    public void addToFront(int data)
    {
        Node new_node = new Node(data);
        new_node.next = head;
        head = new_node;
    }

    public void printList()
    {
        Node ptr = head;
        while (ptr != null)
        {
            System.out.print(ptr.data + " ");
            ptr = ptr.next;
        }

        //System.out.println("null");
    }

    public static void main(String[] args)
    {
        implementation_of_single_linked_list list = new implementation_of_single_linked_list();

        list.addToFront(5);
        list.addToFront(10);
        list.addToFront(15);

        list.printList();
    }
}