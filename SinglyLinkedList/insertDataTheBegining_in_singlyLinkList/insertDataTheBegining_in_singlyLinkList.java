public class insertDataTheBegining_in_singlyLinkList {

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

  // Method to insert the data at the beginning of the singly linked list
  public void insertFirst(int value) {
    ListNode newNode = new ListNode(value);
    newNode.next = head;
    head = newNode;
  }
  

  public static void main(String[] args){
  
    insertDataTheBegining_in_singlyLinkList insertDBISll = new insertDataTheBegining_in_singlyLinkList();

    insertDBISll.insertFirst(11);
    insertDBISll.insertFirst(8);
    insertDBISll.insertFirst(1);

    insertDBISll.display();
  }
  
}
