public class DeleteFirstNodeInSLL {
  
  private ListNode head;

  private static class ListNode {
    private int data; // Can be a generic type
    private ListNode next;  // Reference to next ListNode in list

    public ListNode(int data) {
      this.data = data;
      this.next = null;
    }
  }

  public void display() {
    ListNode current = head;
    while(current != null) {
      System.out.print(current.data + " --> ");
      current = current.next;
    }
    System.out.println("null");
  }

  public void insert(int position, int value){
    // 1 -> 4 -> 5
    // 1 -> 6 -> 4 -> 5
    ListNode node = new ListNode(value);

    if(position == 1){
      node.next = head;
      head = node;
    } else {
      ListNode previous = head;
      int count = 1; // position - 1

      while(count < position - 1){
        previous = previous.next;
        count++;
      }
      ListNode current = previous.next;
      previous.next = node;
      node.next = current;
    }
  }

  public ListNode deleteFirst(){
    if(head == null){
      return null;
    }
    ListNode temp = head;
    head = head.next;
    temp.next = null;
    return temp;
  }

  public static void main(String[] args){
    DeleteFirstNodeInSLL sLinkList = new DeleteFirstNodeInSLL();

    sLinkList.insert(1, 3); // 3 -> null
    sLinkList.insert(2, 4);  // 3 -> 4 -> null
    sLinkList.insert(3, 5); // 3 -> 4 -> 5 -> null
    sLinkList.insert(1, 2);  // 2 -> 3 -> 4 -> 5 -> null
    sLinkList.insert(2, 6); // 2 -> 6 -> 3 -> 4 -> 5 -> null
    sLinkList.insert(1, 3);  // 3 -> 2 -> 6 -> 3 -> 4 -> 5 -> null
    sLinkList.insert(6, 8); // 3 -> 2 -> 6 -> 3 -> 4 -> 8 -> 5 -> null
    sLinkList.insert(8, 9); // 3 -> 2 -> 6 -> 3 -> 4 -> 8 -> 5 -> 9 -> null

    sLinkList.display();

    // delete first node
    System.out.println(sLinkList.deleteFirst().data);
    // display the data
    sLinkList.display();

    // delete one more first node
    System.out.println(sLinkList.deleteFirst().data);
    // display the data
    sLinkList.display();
  }
}
