// { Driver Code Starts
// driver

import java.util.*;

class Node {
    int data;
    Node next;

    Node(int d) {
        data = d;
        next = null;
    }
}

class GfG{
    
    static void printList(Node n){
        while(n!=null){
            System.out.print(n.data+" ");
            n = n.next;
        }
        System.out.println();
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        
        while (T-- > 0) {
            
            int n = sc.nextInt();
            int val = sc.nextInt();
            
            Node first = new Node(val);
            Node tail = first;
            for(int i=0; i<n-1; i++)
            {
                val = sc.nextInt();
                tail.next = new Node(val);
                tail = tail.next;
            }
            
            int m = sc.nextInt();
            val = sc.nextInt();
            
            Node second = new Node(val);
            tail = second;
            for(int i=0; i<m-1; i++)
            {
                val = sc.nextInt();
                tail.next = new Node(val);
                tail = tail.next;
            }
            
            Solution g = new Solution();
            Node res = g.addTwoLists(first, second);
            printList(res);
        }
    }
}
// } Driver Code Ends


/* node for linked list

class Node {
    int data;
    Node next;

    Node(int d) {
        data = d;
        next = null;
    }
}
*/

class Solution{
static Node revList(Node head)
{
Node curr = head;
Node prev = null;
Node next = null;
while(curr != null)
{
next = curr.next;
curr.next = prev;
prev = curr;
curr = next;
}
return prev;
}
static Node addTwoLists(Node first, Node second){
// code here
// return head of sum list
first = revList(first);
second = revList(second);

Node head = null;
Node curr = null;
Node temp;
int carry = 0, sum = 0;
while(first != null || second != null)
{
sum = carry + ((first != null) ? first.data : 0) + ((second != null) ? second.data : 0);
carry = (sum >= 10) ? 1 : 0;

temp = new Node(sum % 10);

if(head == null)
{
head = temp;
curr = head;
}

else
{
curr.next = temp;
curr = temp;
}

if(first != null)
first = first.next;

if(second != null)
second = second.next;
}

if(carry > 0)
curr.next = new Node(carry);

return revList(head);
}
}
