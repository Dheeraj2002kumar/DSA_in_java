public class SinglyLinkedList {

  private ListNode head;
  
  private static class ListNode {
    private int data; // Generic Type
    private ListNode next;

    public ListNode(int data) {
      this.data = data;
      this.next = null;
    }
  }

  // Method to display the singly linked list
  public void display(){
    ListNode current = head;
    while(current != null) {
      System.out.print(current.data + " --> ");
      current = current.next;
    }
    System.out.print("null");
  }
  
  // Method to get the length of the singly linked list
  public int length(){
    if(head == null) {
      return 0;
    }
    int count = 0;
    ListNode current = head;
    while(current != null){
      count++;
      current = current.next;
    }
    return count;
  }

  public static void main(String[] args){
    SinglyLinkedList sll = new SinglyLinkedList();
    sll.head = new ListNode(10);
    ListNode second = new ListNode(1);
    ListNode third = new ListNode(8);
    ListNode fourth = new ListNode(11);

    // Now we will connect them together to form a chain
    sll.head.next = second; // 10 --> 1
    second.next = third;  // 10 --> 1 --> 8
    third.next = fourth;  // 10 --> --> 8 --> 11 --> null

    sll.display();
    System.out.println();
    System.out.println("Length is - " + sll.length());
  }
  
}
