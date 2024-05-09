public class remove_duplicates_from_sorted_LL {
  private ListNode head;

  private class ListNode {
    private int data;
    private ListNode next;

    public ListNode(int data) {
      this.data = data;
      this.next = null;
    }
  }

  public void insertAtBeginning(int data) {
    ListNode newNode = new ListNode(data);
    newNode.next = head;
    head = newNode;
  }

  public void printLindedList() {
    if (head == null) {
      System.out.println("null");
    }
    ListNode current = head;
    while (current != null) {
      System.out.print(current.data + " ---> ");
      current = current.next;
    }
    System.out.println("null");
  }

  public ListNode getMiddleNode() {
    if (head == null) {
      return null;
    }

    ListNode slowPtr = head;
    ListNode fastPtr = head;

    while (fastPtr != null & fastPtr.next != null) {
      slowPtr = slowPtr.next;
      fastPtr = fastPtr.next.next;
    }
    return slowPtr;
  }

  // Get nth node from end
  public ListNode getNthNodeFromEnd(int n) {
    if (head == null) {
      return null;
    }
    if (n <= 0) {
      throw new IllegalArgumentException("Invalid value: n = " + n);
    }
    ListNode mainPtr = head;
    ListNode refPtr = head;

    int count = 0;

    while (count < n) {
      if (refPtr == null) {
        throw new IllegalArgumentException(n + " is greater than the number of nodes in list");
      }
      refPtr = refPtr.next;
      count++;
    }
    while (refPtr != null) {
      refPtr = refPtr.next;
      mainPtr = mainPtr.next;
    }
    return mainPtr;
  }

  public void removeDuplicates(){
    if(head == null){
      return;
    }
    ListNode current = head;
    while(current != null && current.next != null){
      if(current.data == current.next.data){
        current.next = current.next.next;
      } else {
        current = current.next;
      }
    }
  }

  public static void main(String[] args){
    remove_duplicates_from_sorted_LL sll = new remove_duplicates_from_sorted_LL();

    // insert element
    sll.insertAtBeginning(3);
    sll.insertAtBeginning(3);
    sll.insertAtBeginning(2);
    sll.insertAtBeginning(1);
    sll.insertAtBeginning(1);

    sll.printLindedList();

    // remove the duplicates
    sll.removeDuplicates();
    
    // print the list
    sll.printLindedList();
  }

}
