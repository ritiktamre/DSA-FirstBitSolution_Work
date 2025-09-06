package DataStructure;

public class Node {
    int value;
    Node next;
    
    public Node(int value) {
		super();
		this.value = value;
		
	}

	int getValue() {
		return value;
	}

	void setValue(int value) {
		this.value = value;
	}

	Node getNext() {
		return next;
	}

	void setNext(Node next) {
		this.next = next;
	}

	public Node() {
		// TODO Auto-generated constructor stub
	}
    
    
}
