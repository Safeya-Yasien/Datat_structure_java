package org.example;

public  class implementation_of_single_linked_list
{
    private ListNode head;

    private static class ListNode
    {
        private int data;
        private ListNode next;

        public ListNode(int data)
        {
            this.data = data;
            this.next = null;
        }
    }

    public void displayList()
    {
        ListNode ptr = head;

        while (ptr != null)
        {
            System.out.print(ptr.data + " --> ");
            ptr = ptr.next;
        }

        System.out.println("null");
    }

    public int length()
    {
        if (head == null)
            return 0;

        int count = 0;
        ListNode current = head;
        while (current != null)
        {
            count++;
            current = current.next;
        }

        return (count);
    }

    public void insertFirst(int data)
    {
        ListNode new_node = new ListNode(data);
        new_node.next = head;
        head = new_node;
    }

    public void insertLast(int data)
    {
        ListNode new_node = new ListNode(data);
        if (head == null)
            return;

        ListNode current = head;
        while (current.next != null)
            current = current.next;

        current.next = new_node;
    }

    public static void main(String[] args)
    {
        implementation_of_single_linked_list list = new implementation_of_single_linked_list();

//        list.head = new ListNode(15);
//        ListNode second = new ListNode(8);
//        ListNode third = new ListNode(20);
//        ListNode fourth = new ListNode(19);
//
//        list.head.next = second;
//        second.next = third;
//        third.next = fourth;

        list.insertFirst(11);
        list.insertFirst(15);
        list.insertFirst(1);

        list.insertLast(20);
        list.insertLast(100);
        
        list.displayList();

        System.out.println(list.length());


    }
}
