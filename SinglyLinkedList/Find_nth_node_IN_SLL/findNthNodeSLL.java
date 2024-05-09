public class findNthNodeSLL{
  private ListNode head;

  private class ListNode{
    private int data;
    private ListNode next;

    public ListNode(int data) {
      this.data = data;
      this.next = null;
    }
  }

  public void insertAtBeginning(int data){
    ListNode newNode = new ListNode(data);
    newNode.next = head;
    head = newNode;
  }

  public void printLindedList(){
    if(head == null){
      System.out.println("null");
    }
    ListNode current = head;
    while(current != null){
      System.out.print(current.data + " ---> ");
      current = current.next;
    }
    System.out.println("null");
  }

  public ListNode getMiddleNode(){
    if(head == null){
      return null;
    }

    ListNode slowPtr = head;
    ListNode fastPtr = head;

    while(fastPtr != null & fastPtr.next != null) {
      slowPtr = slowPtr.next;
      fastPtr = fastPtr.next.next;
    }
    return slowPtr;
  }

  public ListNode getNthNodeFromEnd(int n) {
    if(head == null){
      return null;
    }
    if(n <= 0){
      throw new IllegalArgumentException("Invalid value: n = " + n);
    }
    ListNode mainPtr = head;
    ListNode refPtr = head;

    int count = 0;

    while(count < n){
      if(refPtr ==  null){
        throw new IllegalArgumentException(n + " is greater than the number of nodes in list");
      }
      refPtr = refPtr.next;
      count++;
    }
    while(refPtr != null){
      refPtr = refPtr.next;
      mainPtr = mainPtr.next;
    }
    return mainPtr;
  }

  public static void main(String[] args){
    findNthNodeSLL sll = new findNthNodeSLL();

    // insert elements
    sll.insertAtBeginning(15);
    sll.insertAtBeginning(11);
    sll.insertAtBeginning(1);
    sll.insertAtBeginning(8);  // 4th node
    sll.insertAtBeginning(10);

    sll.printLindedList();
    ListNode nthNodeFromEnd = sll.getNthNodeFromEnd(4);
    System.out.println("Nth node from end is - " + nthNodeFromEnd.data);

  }



}