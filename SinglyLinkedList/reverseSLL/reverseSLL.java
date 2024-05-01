public class reverseSLL {
    private ListNode head;
 
    private static class ListNode {
       private int data; // Can be a generic type
       private ListNode next; // Reference to next ListNode in list
 
       public ListNode(int data) {
          this.data = data;
          this.next = null;
       }
    }
 
    public void display() {
       ListNode current = head;
       while (current != null) {
          System.out.print(current.data + " --> ");
          current = current.next;
       }
       System.out.print("null");
       System.out.println();
    }
 
   
 
    public ListNode reverse(ListNode head) {
       if (head == null) {
          return head;
       }
 
       ListNode current = head;
       ListNode previous = null;
       ListNode next = null;
 
       while (current != null) {
          next = current.next;
          current.next = previous;
          previous = current;
          current = next;
       }
       return previous;
    }

  public static void main(String[] args) {

   reverseSLL sList = new reverseSLL();
    // Lets create a linked list demonstrated n slide
    // 10 --> 8 --> 1 --> 11 --> null
    // 10 as head node of linked list

    sList.head = new ListNode(10);
    ListNode second = new ListNode(8);
    ListNode third = new ListNode(1);
    ListNode fourth = new ListNode(11);

    // Attach them together to form a list
    sList.head.next = second; // 10 --> 8
    second.next = third; // 10 --> 8 --> 1
    third.next = fourth; // 10 --> 8 --> 1 --> 11 --> null

    // Display the linked list
    // find element in singly linked list
    sList.display();
    System.out.println("");
    
    // reverse the linked list
    sList.head = sList.reverse(sList.head);
    sList.display();
  

    
  }

}
