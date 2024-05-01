public class Create_SLList {

  
    private ListNode head;
 
    private static class ListNode {
       private int data; // Can be a generic type
       private ListNode next; // Reference to next ListNode in list
 
       public ListNode(int data) {
          this.data = data;
          this.next = null;
       }
    }
  

  // Main Class

  public static void main(String[] args) {

    Create_SLList sList = new Create_SLList();
    // Add nodes to the list 
     sList.head = new ListNode(10);
     ListNode second = new ListNode(8);
     ListNode third = new ListNode(1);
     ListNode fourth = new ListNode(11);
 
     // Attach them together to form a list
     sList.head.next = second; // 10 --> 8
     second.next = third; // 10 --> 8 --> 1
     third.next = fourth; // 10 --> 8 --> 1 --> 11 --> null
  }
}