
public class detect_a_loop_in_Linked_list {

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
      
        // get Middile node
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
      
        // remove duplicates
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
      
        // insert sorted list
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
  
        // delete node
        public void deleteNode(int key){
          ListNode current = head;
          ListNode temp = null;
  
          if(current != null && current.data == key){
            head = current.next;
            return;
          }
          while(current != null && current.data != key){
            temp = current;
            current = current.next;
          }
          if(current == null){
            return;
          }
          temp.next = current.next;
        }

        // contains loop or not
        public boolean containsLoop() {
          ListNode fastPtr = head;
          ListNode slowPtr = head;

          while(fastPtr != null && fastPtr.next != null) {
            fastPtr = fastPtr.next.next;
            slowPtr = slowPtr.next;

            if(slowPtr == fastPtr) {
              return true;
            }
          }
          return false;
        }

        // create a method having a loop
        public void createALoopInLindedList(){
          ListNode first = new ListNode(1);
          ListNode second = new ListNode(2);
          ListNode third = new ListNode(3);
          ListNode fourth = new ListNode(4);
          ListNode fifth = new ListNode(5);
          ListNode sixth = new ListNode(6);

          head = first;
          first.next = second;
          second.next = third;
          third.next = fourth;
          fourth.next = fifth;
          fifth.next = sixth;
          sixth.next = third;
        }

        public static void main(String[] args) {
          detect_a_loop_in_Linked_list sll = new detect_a_loop_in_Linked_list();

          sll.createALoopInLindedList();
          System.out.println(sll.containsLoop());
        }


}
