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

    public static void main(String[] args)
    {
        implementation_of_single_linked_list list = new implementation_of_single_linked_list();

        list.head = new ListNode(15);
        ListNode second = new ListNode(8);
        ListNode third = new ListNode(20);
        ListNode fourth = new ListNode(19);

        list.head.next = second;
        second.next = third;
        third.next = fourth;
    }
}