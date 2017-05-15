package InterviewPrep;

public class LIFOImplementation <Item> {

	// top of stack (most recently added node)
	private Nodes first;
	 // number of items
	int counter;
	private class Nodes
	{
	Item item;
	Nodes next;
	}
	public boolean isEmpty() { return first == null; } // Or: N == 0.
	public int size() { return counter; }
	// Add item to top of stack.
	public void push(Item item)
	{ 
	Nodes oldfirst = first;
	first = new Nodes();
	first.item = item;
	first.next = oldfirst;
	counter++;
	}
	public Item pop()
	{ // Remove item from top of stack.
	Item item = first.item;
	first = first.next;
	counter--;
	return item;
	}
	
	public static void main(String args []){
		LIFOImplementation lifo = new LIFOImplementation();
		
		lifo.push(3);
		lifo.push(1);
		lifo.push(7);
		lifo.push(4);
		
		System.out.println(lifo.pop());
		System.out.println(lifo.pop());
		lifo.push(4);
		lifo.push(3);
		System.out.println(lifo.pop());
		System.out.println(lifo.pop());
		System.out.println(lifo.pop());
		//System.out.println(lifo.pop());
		//System.out.println(lifo.pop());
		//System.out.println(lifo.pop());
	}
	
}
