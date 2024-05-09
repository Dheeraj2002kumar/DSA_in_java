public class insert_a_node_in_a_sorted_SLL {

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

  // print Linked List element
  public void printLinkedList() {
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

  public void removeDuplicates() {
    if (head == null) {
      return;
    }
    ListNode current = head;
    while (current != null && current.next != null) {
      if (current.data == current.next.data) {
        current.next = current.next.next;
      } else {
        current = current.next;
      }
    }
  }

  public ListNode insertInSortedList(int value){
    ListNode newNode = new ListNode(value);
    if(head == null){
      return newNode;
    }
    ListNode current = head;
    ListNode temp = null;

    while(current != null && current.data < newNode.data){
      temp = current;
      current = current.next;
    }
    newNode.next = current;
    temp.next = newNode;
    return head;
  }

  public static void main(String[] args){
    insert_a_node_in_a_sorted_SLL sll = new insert_a_node_in_a_sorted_SLL();

    // insert elements
    sll.insertAtBeginning(16);
    sll.insertAtBeginning(10);
    sll.insertAtBeginning(8);
    sll.insertAtBeginning(1);

    // print list
    sll.printLinkedList();

    // insert element in sorted singly linked list
    sll.insertInSortedList(11);
    sll.printLinkedList();
  }

}