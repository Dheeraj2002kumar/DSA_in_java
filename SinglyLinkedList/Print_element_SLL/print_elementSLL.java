public class print_elementSLL{

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
 

  public static void main(String[] args) {

   print_elementSLL sList = new print_elementSLL();
   
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
  }
}