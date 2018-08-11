
public class CDLL{
	
	Node head;
        Node tail;
	String repr;
	CDLL(){
		repr = "^";
	}
	class Node{
		int data;
		Node next;
		Node prev;
		Node(){	
			data = 0;	
			next = null;
			prev = null;
		}
		Node(int data,Node prev,Node next){
			if(head==null){
				head = new Node();
				tail = head;
				head.data = data;
				head.next = head;
				head.prev = head;
			}
			else{
				this.data = data;
				this.next = next;
				this.prev = prev;
				
			}			
			
		}
	}
        void Enqueue(int data){
	
		if(head==null){
			head = new Node();	
			head.data  = data;
			head.prev = head;
			head.next = head;
			tail = head;
			return;
		}
		tail.next = new Node(data,tail,head);
		tail.next.prev = tail;
		tail = tail.next;
		head.prev = tail;
		int i =0;
		if(data !=0)
			while(i<(int)(Math.log10(data)+5)){
				repr += "_";
				i++;
			}
		else 
			repr += "_";
		System.out.println("enqueued("+data+")...");

	}
	public Node reverseHalf(Node head){
		if(head ==null)
			return null;
		Node slowptr = head;
		Node fastptr = head.next;
		do{
			slowptr  = slowptr.next;
			fastptr = fastptr.next.next;
			if(fastptr.next==tail)
				break;
		}while(fastptr !=tail);
		Node itr = slowptr.next;
		Node mid = slowptr;
		Node temphead = slowptr.next;
		tail.next = temphead;
		temphead.prev = tail; 
		do{
			Node temp = itr.next ;
			itr.next = itr.prev;
			itr.prev = temp;
			itr = itr.prev;
		}while(itr!=temphead);
		mid.next = tail;
		tail = temphead;
		head.prev = tail;
		tail.next = head;
		System.out.println("reversed half......");
		return head;
		
		
	}
	 public int Dequeue(){
		
		if(head.next == null){
			System.out.println("Invalid operation!!");
			return -1;
		}
		Node temp = head;
		head = temp.next;
		tail.next = head;
		head.prev = tail;
		if(temp.data == 0)
                	repr = repr.substring(1,repr.length());	
		else
			repr = repr.substring(((int)Math.log10(temp.data)+7),repr.length());	
		System.out.println("dequeued("+temp.data+")...");
		return temp.data;
		
	
	}
	public void PrintCDLL(Node head){
		if(head == null){
			System.out.println("|null|->");
			//System.out.println("^______|");
			return;
		}
		Node itr = head;
		do {
			System.out.print("|"+itr.data+"|->");
			itr = itr.next;
		}while(itr !=head);
		System.out.println();
		System.out.println(repr+"__|");
		
		
			
	}
	public Node reverse(Node head){
		if(head==null)
			return null;
		Node itr = head;
		do{	
			Node temp = itr.next;
			itr.next = itr.prev;
			itr.prev = temp;		
			itr = itr.prev;
					
		}while(itr != head);
		Node temp = head;
		head  = tail;
		tail = temp;
		temp = head;
		System.out.println("linked list reversed!!!");
		return head;
	}

	public static void main(String[] args){
		CDLL c  = new CDLL();	
		for(int i=0;i<10;i++)
		c.Enqueue(i*(i+10));
		c.PrintCDLL(c.head);
		c.Dequeue();
		c.Dequeue();
		System.out.println(c.tail.data);
		c.PrintCDLL(c.head);
		c.head = c.reverse(c.head);
		c.PrintCDLL(c.head);
		c.head = c.reverseHalf(c.head);
		c.PrintCDLL(c.head);
		
		

	}




}