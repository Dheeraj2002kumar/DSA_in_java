# DSA_in_java

 * <a href="https://github.com/Dheeraj2002kumar/DSA_in_java/blob/main/TimeComplexity/TimeComplexity.java"> Time Complexity </a>
* <a href="https://github.com/Dheeraj2002kumar/DSA_in_java/blob/main/Adding%20or%20Updating%20elements%20in%20an%20Array/ArrayUtil.java"> Adding and Update Element</a>
* <h3>Remove Even Integers From an Array</h3>
<pre>Q. Give an array of integers, return an array with even integers removed.
Example –
	Input: arr = {3, 2, 4, 7, 10 , 6, 5}
	Output: arr = {3, 7, 5}
--> <a href="https://github.com/Dheeraj2002kumar/DSA_in_java/blob/main/Remove%20Even%20Integer/removeEvenInteger.java"> Remove Even Integers From an Array</a>
</pre>

* <h4>How to reverse an array in java</h4>
<pre>
	Q. Give an array or string, the task is to reverse the array or string. 
Example-
    Given array of integers – { 2, 11, 5, 10, 7, 8}

Solution – 
    Return reverse of array – {8, 7, 10, 5, 11,2}

Algorithm-
reverseArray(int numbers[], int start, int end){
   while(start<end){
       int temp = numbers[start];
       numbers[start]=numbers[end];
       numbers[end]=temp;
       start++;
       end--;
     }
}

reverseArray(numbers, 0, numbers.length – 1)

*--><a href="https://github.com/Dheeraj2002kumar/DSA_in_java/blob/main/Array/ReverseArray/ReverseArray.java">Reverse Array</a>
</pre>

* <h4>Find Minimum value in array</h4>
<pre> 
Algorithm-
	
Public int findMinimum(int[] arr){
     int min = arr[0];
     for(int i=1; i<arr.length; i++){
            if(arr[i] < min){
               min=arr[i];
           }
      }
     Return min;
} 

<a href="https://github.com/Dheeraj2002kumar/DSA_in_java/blob/main/Array/MinArray/MinArray.java">Find minimum value in array</a>
</pre>

* <h4>Find Second Maximum Value in an Array</h4>
<pre>
Q. Give an array of integers, return second maximum value. The second maximum value exists.
Example-
	Input:  arr={12, 34, 2, 34, 33, 1}
	Output: 33

Algorithm-

  int findSecondMax(int[] arr){
  int max = Integer.MIN_VALUE;
  int secondMax = Integer.MIN_VALUE;	
   for(int i = 0; i<arr.length; i++){
        if(arr[i]>max){
	secondMax = max;
 	max = arr[i];
	} else if(arr[i]>secondMax && arr[i] != max){
	     secondMax = arr[i];
	}
         }
        Return secondMax;
}                                                   
</pre>

*  <h4>Move all Zero’s to end of an Array</h4>
<pre>
Q. Given an array of integers, write a function to move all 0’s to end of it while maintaining the relative order of the non-zero elements.

Example-
	Given array of integers – {0, 1, 0, 4, 12}

Solution – 
	{1, 4, 12, 0, 0}

 Algorithm-

 public void movezeros(int[] arr, int n){
	int j = 0; 
	for(arr[i] != 0 && arr[j] == 0){
	    int temp = arr[i];
	    arr[i]  = arr[j];
	   arr[j] = temp;
	}
	If(arr[j] != 0){
	     j++;
	}
        }
    }  


*--><a href="https://github.com/Dheeraj2002kumar/DSA_in_java/blob/main/Array/moveAllZeroToEnd/moveAllZeroToEnd.java">Move all Zero's to end of an array</a>
</pre>

* <h4>How to resize an Array in Java</h4>
<pre>
* Algorith:-

public void resize(int[] arr, int capacity){
    int[] temp = new int[capacity];
    for(int i=0; i<arr.length; i++){
        temp[i]  = arr[i];
    }
    Return temp;  
}
<a href="https://github.com/Dheeraj2002kumar/DSA_in_java/blob/main/Array/resizeArray/resizeArray.java">Resize an Array</a>
</pre>


* <h4>Find the Missing Number in an Array</h4>

<pre>
Q. Given an array of n – 1 distinct numbers in the range of 1 to n. Find the missing number in it.

          arr[]          2           4           1            8           6       3          7
                          0          1           2            3           4       5           6

Output: 5
Explanation: The missing number from range 1 to 8 is 5.

</pre>
<h5>Mathematical Approach to find missing number in an array</h5>

<pre>
	The sum of first n natural numbers = 1 + 2 + 3 + 4 … + n = n * (n + 1) / 2
	Let n = 4
		= 4*(4+1)/2
	 	= 4*5/2
		= 20/2 = 10

Example 1:-
	
arr[]           1        2           3           5                         4 numbers
               0         1           2               3                         1 to 5

	N = 5
	= 5*(5+1)/2
	= 5*6/2	= 30/2	= 15
Then subtract the each element of the arr to the given sum i.e. 15
15 – 1 = 14
14 – 2 = 12
12 – 3 = 9
9 – 5 = 4
So , 4 is the missing number of the array.
Output: 4
Explanation: The missing number from range 1 to 5 is 4.


Example 2:-	
arr[]        2         4         1         8         6        3          7           7 --> 1 to 8
 
            0          1        2          3         4        5         6
n = 8
	= 8*(8+1)/2
	= 8*9 / 2	= 72/2	= 36
Then subtract the each element of the arr to given sum i.e. 36
36 – 2 = 34
34 – 4 = 30
30 – 1 = 29
29 – 8 = 21
21 – 6 = 14
14 – 3 = 11
11 – 7 = 4
So, the missing number of the arr is 4
Output: 4
Explanation: missing number form range 1 to 8 is 4.


--> Algorithm:-	
int findMissingNumber(int[] arr){
	int n = arr.length + 1;
	int sum = n * (n + 1) / 2;
	for(int num : arr){
		sum = sum – num;
	}
	Return sum;
}  

Find missingNumber(arr);   


<a href="https://github.com/Dheeraj2002kumar/DSA_in_java/blob/main/Array/missingValueInArray/missingValueInArray.java">Missing number in an array</a>
</pre>


* <h4>How to check if a String is Palindrome or not</h4>

<pre>
Q.  Given a string, the task is check whether given string is palindrome or not.

Example-	 Given string- “Madam”
Solution-	It should return – true

Example- 	Given string-	“that”
Solution-	It should return – false

--> Algorithm:-	
Public Boolean isPalindrome(String word){
	char[] charArray = word.toCharArray();
	int start = 0;
	int end = word.length() – 1;
	while(start < end){
		if(charArray[start] != charArray[end]){
			return false;
		}
		start++;
		end--;
	}
	Return true;
}  

<a href="https://github.com/Dheeraj2002kumar/DSA_in_java/blob/main/String/StringUtil.java">Check Palindrome</a>
</pre>

* <h4>How to create a Singly Linked List <h4>
<pre>
--> Algorithm:-
// head is instance variable
head = new ListNode(10);
ListNode second = new ListNode(1);
ListNode third = new ListNode(8);
ListNode fourth = new ListNode(11);
head.next = second;
second.next = third;
third.next = fourth;
<a href="https://github.com/Dheeraj2002kumar/DSA_in_java/blob/main/SinglyLinkedList/Create%20s%20Singly%20Linked%20List/Create_SLList.java">Create Singly Linked List</a>
	
</pre>

* <h4>How to print elements of a Singly Linked List</h4>

<pre>
Output -10  1  8  11  null

ListNode current = head;
While(current != null){
	System.out.print(current.data + “ --> “ );
	Current = current.next;
}
System.out.print(“null”);  

<a href="https://github.com/Dheeraj2002kumar/DSA_in_java/blob/main/SinglyLinkedList/Print_element_SLL/print_elementSLL.java">Print element in Singly Linked List</a>

</pre>

* <h4>How to find length of a Singly Linked List<h4>
<pre>
--> Algorithm:-
public int lenght(){
    if(head == null){
      return 0;
    }
    int count = 0;
    ListNode current = head;
    while(current != null){
      count++;
      current = current.next;
    }
    return count;
  }
* <a href="https://github.com/Dheeraj2002kumar/DSA_in_java/blob/main/SinglyLinkedList/PrintLengthSLL/PrintLenghtSLL.java">Length of Singly Linked List</a>
</pre>

* <h4>How to insert node at the beginning of a singly Linked List </h4>
<pre>
--> Algorithm:-
 public void insertFirst(int value) {
    ListNode newNode = new ListNode(value);
    newNode.next = head;
    head = newNode;
  }
--> <a href="https://github.com/Dheeraj2002kumar/DSA_in_java/blob/main/SinglyLinkedList/insertDataTheBegining_in_singlyLinkList/insertDataTheBegining_in_singlyLinkList.java">Insert node at beginning</a>
</pre>

* <h4>How to insert a node at the end of a Singly Linked List </h4>
<pre>
--> Algorithm:-
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

* <a href="https://github.com/Dheeraj2002kumar/DSA_in_java/blob/main/SinglyLinkedList/insertNodeAtTheEnd/insertNodeAtTheEnd.java">Insert node at end </a>
</pre>

* <h4>Insert a node in a singly Linked List at a given position</h4>
<pre>
Q. Implement method to insert a node at a given position. Assuming position to be valid and starting from 1.
For example – Given following Singly Linked List

head

  10   ----->	1	 ---->	8	----->11	---->	null

* Algorithm:-
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

* <a href="https://github.com/Dheeraj2002kumar/DSA_in_java/blob/main/SinglyLinkedList/insertNodeInAnyOfThePositionSLL/insertNodeInAnyOfThePosition.java">Insert node at given position</a>
</pre>

* <h4>Delete first node of a Singly Linked List</h4>
<pre>
* Algorithm:-
public ListNode deleteFirst(){
    if(head == null){
      return null;
    }
    ListNode temp = head;
    head = head.next;
    temp.next = null;
    return temp;
  }
<a href="https://github.com/Dheeraj2002kumar/DSA_in_java/blob/main/SinglyLinkedList/DeleteFirstNodeInSLL/DeleteFirstNodeInSLL.java"> Delete First node of SLL</a>
</pre>

* <h4>Delete last node of a Singly Linked List</h4>
<pre>
* Algorithm:-
 public ListNode deleteLast(){
    if(head == null || head.next == null){
      return head;
    }
    ListNode current = head;
    ListNode previous = null;

    while(current.next != null){
      previous = current;
      current = current.next;
    }
    previous.next = null; // break the chain
    return current;
  }
*--> <a href="https://github.com/Dheeraj2002kumar/DSA_in_java/blob/main/SinglyLinkedList/DeleteLastNodeInSLL/DeleteLastNodeInSLL.java">Delete last node of a SLL</a>
</pre>

* <h4>Delete a node from a Singly Linked List at a given position</h4>
<pre>
Q. Implement method to delete a node at a given position. Assuming position to be valid and starting from 1.
For example- Given following Singly Linked List
   head 
    ^
    |
   10 -->1-->8-->11-->	null

* Algorithm:-
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

* <a href="https://github.com/Dheeraj2002kumar/DSA_in_java/blob/main/SinglyLinkedList/deleteGivenPositionSLL/deleteGivenPositionSLL.java">Insert node at given position</a>
</pre>

* <h4>How to search an element in a Linked List </h4>
<pre>
* Algorithm:-
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

* <a href="https://github.com/Dheeraj2002kumar/DSA_in_java/blob/main/SinglyLinkedList/findElementSLL/findElementSLL.java">Search / find element in SLL</a>
</pre>

* <h4>How to reverse a Singly Linked List in Java</h4>
<pre>
* Algorithm:-
 public ListNode reverse(ListNode head) {
       if (head == null) {
          return head;
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

* <a href="https://github.com/Dheeraj2002kumar/DSA_in_java/blob/main/SinglyLinkedList/reverseSLL/reverseSLL.java">Reverse element in SLL</a>
</pre>

