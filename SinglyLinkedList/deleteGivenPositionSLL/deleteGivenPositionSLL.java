public class deleteGivenPositionSLL {

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

  // delete given position in Singly linked list
  public void delete(int position){
    // position is valid and starting from 1
    // 11 --> 8 --> 1 --> 2 --> 7 --> null
    if(position == 1){
      head = head.next;
    }
    else {
      ListNode previous = head;
      int count = 1;
      while(count < position - 1){
        previous = previous.next;
        count++;
      }

      ListNode current = previous.next;
      previous.next = current.next;
    }
  }

  public static void main(String[] args) {
    deleteGivenPositionSLL sList = new deleteGivenPositionSLL();

    sList.insertLast(11);
    sList.insertLast(8);
    sList.insertLast(1);
    sList.insertLast(2); 
    sList.insertLast(7); 
    sList.display();

    sList.delete(1);
    sList.display();

    sList.delete(3);
    sList.display();

    sList.delete(3);
    sList.display();
  }
  
}
