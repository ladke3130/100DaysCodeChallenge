/*Definition :-A number is said to be a trendy number if and only if it has 3 digits and the middle digit is divisible by 3. 
Test case:- 
trendy numbers: 131, 264, 999
nontrendy numbers : 123, 653, 33, 4, 1034*/
class  Algorithm
{

static class Node
{
	int data;
	Node next;
}
static Node newLNode(int data)
{
	Node temp = new Node();
	temp.data = data;
	temp.next = null;
	return temp;
}

static int n;
static Node mid;
static void midpoint(Node head )
{
	if (head == null)
	{
		n = (n) / 2;
		return;
	}

	n = n + 1;

	midpoint(head.next);
	n = n - 1;
	if (n == 0)
	{
		mid = head;
	}
}

static Node midpointvalue(Node head)
{
	mid = null;
	n = 1;
	midpoint(head);
	return mid;
}
public static void main(String args[])
{
	Node head = newLNode(1);
	head.next = newLNode(4);
	head.next.next = newLNode(3);
	head.next.next.next = newLNode(3);
	head.next.next.next.next = newLNode(0);
	Node result = midpointvalue(head);
	System.out.print( result.data );
    if(result.data%3==0){
        System.out.println("\nthe number are trendy number");

    }
    else{
        System.out.println("\nthe number is not the trendy number");
    }
}
}


