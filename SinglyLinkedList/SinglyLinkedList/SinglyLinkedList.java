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
  public void display() {
    ListNode current = head;
    while (current != null) {
      System.out.print(current.data + " --> ");
      current = current.next;
    }
    System.out.print("null");
  }

  // Method to get the length of the singly linked list
  public int length() {
    if (head == null) {
      return 0;
    }
    int count = 0;
    ListNode current = head;
    while (current != null) {
      count++;
      current = current.next;
    }
    return count;
  }

  public void insertFirst(int value) {
    ListNode newNode = new ListNode(value);
    newNode.next = head;
    head = newNode;
  }

  public void insert(int position, int value) {
    // 1 -> 4 -> 5
    // 1 -> 6 -> 4 -> 5
    ListNode node = new ListNode(value);

    if (position == 1) {
      node.next = head;
      head = node;
    } else {
      ListNode previous = head;
      int count = 1; // position - 1

      while (count < position - 1) {
        previous = previous.next;
        count++;
      }

      ListNode current = previous.next;
      previous.next = node;
      node.next = current;
    }

  }

  public void insertLast(int value) {
    ListNode newNode = new ListNode(value);
    if (head == null) {
      head = newNode;
      return;
    }
    ListNode current = head;
    while (null != current.next) {
      current = current.next;
    }
    current.next = newNode;
  }

  public ListNode deleteFirst() {
    if (head == null) {
      return null;
    }
    ListNode temp = head;
    head = head.next;
    temp.next = null;
    return temp;
  }
  // delete node at given position
  public void delete(int position) {
    // position is valid and starting from 1
    // 3 -> 4 -> 7 -> 8 -> 9 -> null
    if (position == 1) {
      head = head.next;
    } else {
      ListNode previous = head;
      int count = 1;
      while (count < position - 1) {
        previous = previous.next;
        count++;
      }

      ListNode current = previous.next;
      previous.next = current.next;
    }
  }

  public ListNode deleteLast() {
    if (head == null) {
      return head;
    }

    if (head.next == null) {
      ListNode temp = head;
      head = head.next;
      return temp;
    }

    ListNode current = head;
    ListNode previous = null;

    while (current.next != null) {
      previous = current;
      current = current.next;
    }
    previous.next = null; // break the chain
    return current;
  }

  public boolean find(int searchKey) {
    if (head == null) {
      return false;
    }

    ListNode current = head;
    while (current != null) {
      if (current.data == searchKey) {
        return true;
      }
      current = current.next;
    }
    return false;
  }

  // reverse a linked list
  public ListNode reverse() {
    if (head == null) {
      return null;
    }

    ListNode current = head;
    ListNode previous = null;
    ListNode next = null;

    while (current != null) {
      next = current.next;
      current.next = previous;
      previous = current;
      current = next;
    }
    return previous;
  }

  public static void main(String[] args) {
    /*
     * SinglyLinkedList sll = new SinglyLinkedList();
     * sll.head = new ListNode(10);
     * ListNode second = new ListNode(1);
     * ListNode third = new ListNode(8);
     * ListNode fourth = new ListNode(11);
     * 
     * // Now we will connect them together to form a chain
     * sll.head.next = second; // 10 --> 1
     * second.next = third; // 10 --> 1 --> 8
     * third.next = fourth; // 10 --> --> 8 --> 11 --> null
     * 
     * sll.display();
     * System.out.println();
     * System.out.println("Length is - " + sll.length());
     */


     /*How to find length of a Singly Linked List in Java--------------
      * 
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
    
      */






/*How to insert node at the beginning of a singly Linked List in Java ------    
 * 
 *SinglyLinkedList insertDBISll = new SinglyLinkedList();

    insertDBISll.insertFirst(11);
    insertDBISll.insertFirst(8);
    insertDBISll.insertFirst(1);

    insertDBISll.display();
    
    */




     /*How to insert a node at the end of a Singly Linked List in Java------------------
     
     SinglyLinkedList sList = new SinglyLinkedList();

    sList.insertLast(11);
    sList.insertLast(8);
    sList.insertLast(1);
    sList.insertLast(2);

    sList.display();
      
      */



     /*Insert a node in a singly Linked List at a given position----------
      * 
      SinglyLinkedList sLinkList = new SinglyLinkedList();

    sLinkList.insert(1, 3); // 3 -> null
    sLinkList.insert(2, 4);  // 3 -> 4 -> null
    sLinkList.insert(3, 5); // 3 -> 4 -> 5 -> null
    sLinkList.insert(1, 2);  // 2 -> 3 -> 4 -> 5 -> null
    sLinkList.insert(2, 6); // 2 -> 6 -> 3 -> 4 -> 5 -> null
    sLinkList.insert(1, 3);  // 3 -> 2 -> 6 -> 3 -> 4 -> 5 -> null
    sLinkList.insert(6, 8); // 3 -> 2 -> 6 -> 3 -> 4 -> 8 -> 5 -> null
    sLinkList.insert(8, 9); // 3 -> 2 -> 6 -> 3 -> 4 -> 8 -> 5 -> 9 -> null

    sLinkList.display();
      */





    /*Delete first node of a Singly Linked List------
     * SinglyLinkedList sLinkList = new SinglyLinkedList();

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
     
     */




     /*Delete Last node in singly Linked Llist
      * 
      SinglyLinkedList sLinkList = new SinglyLinkedList();

    sLinkList.insert(1, 3); // 3 -> null
    sLinkList.insert(2, 4);  // 3 -> 4 -> null
    sLinkList.insert(3, 5); // 3 -> 4 -> 5 -> null
    sLinkList.insert(1, 2);  // 2 -> 3 -> 4 -> 5 -> null
    sLinkList.insert(2, 6); // 2 -> 6 -> 3 -> 4 -> 5 -> null
    sLinkList.insert(1, 3);  // 3 -> 2 -> 6 -> 3 -> 4 -> 5 -> null
    sLinkList.insert(6, 8); // 3 -> 2 -> 6 -> 3 -> 4 -> 8 -> 5 -> null
    sLinkList.insert(8, 9); // 3 -> 2 -> 6 -> 3 -> 4 -> 8 -> 5 -> 9 -> null

    sLinkList.display();


    // delete first node--------------------
    System.out.println(sLinkList.deleteFirst().data);
    // display the data
    sLinkList.display();

    // delete one more first node
    System.out.println(sLinkList.deleteFirst().data);
    // display the data
    sLinkList.display();
 

 // delete last node 
 System.out.println(sLinkList.deleteLast().data);
 // display the data
 sLinkList.display();

 // delete one more last node
 System.out.println(sLinkList.deleteLast().data);
 // display the data
 sLinkList.display();

      */




    /*
     * Delete a node from a Singly Linked List at a given position
     * 
     * SinglyLinkedList sList = new SinglyLinkedList();

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
     */



    /*
     * How to search an element in a Linked List 
     * 
     * // Lets create a linked list demonstrated n slide
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

    SinglyLinkedList sList = new SinglyLinkedList();
    sList.head = head;
    sList.display();

    if(sList.find(head, 12)) {
      System.out.println("Search Key found !!!");
    }
    else {
      System.out.println("Search Key not found !!!");
    }
    
     */




    /*
     * Reverse the singly linked list
    
    SinglyLinkedList list = new SinglyLinkedList();
    // add some nodes to the list
    list.insertLast(1);
    list.insertLast(2);
    list.insertLast(3);
    list.insertLast(4);
    list.insertLast(5);

    list.display(); // prints: 1 -> 2 -> 3 -> 4 -> 5

    list.head = list.reverse();

    list.display(); // prints: 5 -> 4 -> 3 -> 2 -> 1
     */
  }

}
