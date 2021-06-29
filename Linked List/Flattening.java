// { Driver Code Starts
import java.util.Scanner;
import java.util.*;
import java.io.*;

class Node
{
	int data;
	Node next;
	Node bottom;
	
	Node(int d)
	{
		data = d;
		next = null;
		bottom = null;
	}
}


class Flatttening_A_LinkedList
{	
    Node head;
	
	void printList(Node node)
    {
        //Node temp = head;
        while (node != null)
        {
            System.out.print(node.data + " ");
            node =node.bottom;
        }
        System.out.println();
    }
	public  static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		Flatttening_A_LinkedList list = new Flatttening_A_LinkedList();
		while(t>0)
		{
			int N = sc.nextInt();
			int arr[] = new int[N];
			for(int i=0;i<N;i++)
				arr[i] = sc.nextInt();
			
			Node temp = null;
			Node tempB = null;
			Node pre = null;
			Node preB = null;	
			int flag=1;
			int flag1=1;
			for(int i=0; i<N;i++)
			{
				int m = arr[i];
				m--;
				int a1 = sc.nextInt();
				temp = new Node(a1);
				if(flag == 1)
				{
					list.head = temp;
					pre = temp;
					flag = 0;
					flag1 = 1;
				}
				else
				{
					pre.next = temp;
					pre = temp;
					flag1 = 1;
				}
				
				for(int j=0;j<m;j++)
				{
					int a = sc.nextInt();
					tempB = new Node(a);
					if(flag1 == 1)
					{
						temp.bottom = tempB;
						preB = tempB;
						flag1 = 0;
					}
					else
					{
						preB.bottom = tempB;
						preB = tempB;
					}
				}
				
			}
			//list.printList();
			GfG g = new GfG();
			Node root = g.flatten(list.head);
			list.printList(root);
		
		t--;
		}
	}	
}// } Driver Code Ends

/*Node class  used in the program
class Node
{
	int data;
	Node next;
	Node bottom;
	
	Node(int d)
	{
		data = d;
		next = null;
		bottom = null;
	}
}
*/
/*  Function which returns the  root of 
    the flattened linked list. */
class GfG
{
    Node sortedMerge(Node a, Node b) 
    { 
        Node result = null; 
       
        if (a == null) 
            return b; 
        if (b == null) 
            return a; 
  
        if (a.data < b.data)
        { 
            result = a; 
            result.bottom = sortedMerge(a.bottom, b); 
        } 
        else
        { 
            result = b; 
            result.bottom = sortedMerge(a, b.bottom); 
        } 
        
        return result; 
    } 
  
    Node mergeSort(Node h) 
    { 
        if (h == null || h.bottom == null)
        { 
            return h; 
        } 
  
        Node middle = getMiddle(h); 
        Node nextofmiddle = middle.bottom; 
  
        middle.bottom = null; 
  
        Node left = mergeSort(h); 
  
        Node right = mergeSort(nextofmiddle); 
  
        Node sortedlist = sortedMerge(left, right); 
        
        return sortedlist; 
    } 
 
    public static Node getMiddle(Node head) 
    { 
        if (head == null) 
            return head; 
  
        Node slow = head, fast = head; 
  
        while (fast.bottom != null && fast.bottom.bottom != null)
        { 
            slow = slow.bottom; 
            fast = fast.bottom.bottom; 
        } 
        
        return slow; 
    } 
        
    Node flatten(Node root)
    {
	 Node temp=root;
	 Node temp1=root.next;
	 Node newnode=root;
	 Node newtemp=newnode;
	 while(temp1!=null)
	 {
	 while(temp.bottom!=null)
	 {
	     newtemp.bottom=temp.bottom;
	     newtemp=newtemp.bottom;
	     temp=temp.bottom;
	 }
	 
	 newtemp.bottom=temp1;
	 newtemp=newtemp.bottom;
	 temp=temp1;
	 temp1=temp1.next;
	 }
	 
	 return mergeSort(newnode);

    }
}
