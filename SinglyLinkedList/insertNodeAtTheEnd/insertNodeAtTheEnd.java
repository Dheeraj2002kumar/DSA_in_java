public class insertNodeAtTheEnd{

  private ListNode head;

  private static class ListNode {
    private int data;   // Can be a generic type
    private ListNode next;   // Reference to next ListNode in list

    public ListNode(int data){
      this.data = data;
      this.next = null;
    }  
  }

  // Method to insert a new node at the end of list
  public void display(){
    ListNode current = head;
    while(current != null){
      System.out.print(current.data + " --> ");
      current = current.next;
    }
    System.out.println("null");
  }

  // Inserts a new node at the end of list
  public void insertLast(int value){
    ListNode newNode = new ListNode(value);
    if(head == null) {
      head = newNode;
      return;
    }
    ListNode current = head;
    while(null != current.next){
      current = current.next;
    }
    current.next = newNode;
  }

  public static void main(String[] args) {
    insertNodeAtTheEnd sList = new insertNodeAtTheEnd();

    sList.insertLast(11);
    sList.insertLast(8);
    sList.insertLast(1);
    sList.insertLast(2);

    sList.display();
  }

}