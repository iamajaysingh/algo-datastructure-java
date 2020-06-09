package linklist;

public class Node< T extends Comparable<T>> {
	
	private T data;
	private Node<T> nextNode;
	
	Node(T date){
		
		this.data=date;
	}

	public T getData() {
		return data;
	}

	public void setData(T data) {
		this.data = data;
	}

	public Node<T> getNextNode() {
		return nextNode;
	}

	public void setNextNode(Node<T> nextNode) {
		this.nextNode = nextNode;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return this.data.toString();
	}
	

}
