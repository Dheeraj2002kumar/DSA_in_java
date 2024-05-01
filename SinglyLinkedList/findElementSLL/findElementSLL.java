public class findElementSLL {

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

  // find element in singly linked list
  public boolean find(ListNode head, int searchKey){
    if(head == null){
      return false;
    }

    ListNode current = head;
    while(current != null){
      if(current.data == searchKey){
        return true;
      }
      current = current.next;
    }
    return false;
  }

  public static void main(String[] args) {
    // Lets create a linked list demonstrated n slide
    // 10 --> 8 --> 1 --> 11 --> null
    // 10 as head node of linked list

    ListNode head = new ListNode(10);
    ListNode second = new ListNode(8);
    ListNode third = new ListNode(1);
    ListNode fourth = new ListNode(11);

    // Attach them together to form a list
    head.next = second; // 10 --> 8
    second.next = third; // 10 --> 8 --> 1
    third.next = fourth; // 10 --> 8 --> 1 --> 11 --> null

    // Display the linked list
    // find element in singly linked list

    findElementSLL sList = new findElementSLL();
    sList.head = head;
    sList.display();

    if(sList.find(head, 12)) {
      System.out.println("Search Key found !!!");
    }
    else {
      System.out.println("Search Key not found !!!");
    }
    
  }
  
}
