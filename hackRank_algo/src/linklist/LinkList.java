package linklist;

public class LinkList<T extends Comparable<T>> implements List<T>{
	
	private Node<T> root;
	private int sizeOfList;

	@Override
	public void insert(T data) {
		// TODO Auto-generated method stub
		++this.sizeOfList;
		
		if(root==null) {
			this.root = new Node<>(data);
		}
		else {
			
			atTheBegining(data);
		}
		
		
	}

	private void atTheBegining(T data) {
		// TODO Auto-generated method stub
		Node<T> newnode = new Node<>(data);
	    newnode.setNextNode(root);
		this.root=newnode;
	}
	
	private void atTheEnd(T data, Node<T> node) {
		if(node.getNextNode() != null) {			
			atTheEnd(data, node.getNextNode());
		}else {	
			Node<T> newnode = new Node<>(data);
			node.setNextNode(newnode);
		}
	}

	@Override
	public void removed(T data) {
		// TODO Auto-generated method stub
		if(root.getData().compareTo(data)==0) {
			-- this.sizeOfList;
			 this.root = root.getNextNode(); 
		}else {
			removed(data, root, root.getNextNode());
		}
		
	}

	private void removed(T data, Node<T> previousNode, Node<T> actualNode) {
		// TODO Auto-generated method stub
		if(actualNode.getData().compareTo(data)==0) {
			-- this.sizeOfList;
			previousNode.setNextNode(actualNode.getNextNode());
			actualNode=null;
			return;
			
	}
		previousNode = actualNode;
		actualNode= actualNode.getNextNode();
		
	}

	@Override
	public void traversalList() {
		// TODO Auto-generated method stub
		
		if(this.root==null) return;
		Node<T> actualNode = this.root;
		while(actualNode != null) {
			
			System.out.println(actualNode+"->");
			actualNode = actualNode.getNextNode();
			
		}
		
		
		
	}

	@Override
	public int size() {
		// TODO Auto-generated method stub
		
		return this.sizeOfList;
	}

	@Override
	public void middelNode() {
		int mid = (1+(this.sizeOfList-1)/2);
		         
		int flag= 1;
		Node<T> midddleNode=null;
		
		 while(flag < mid ) {
              this.root = this.root.getNextNode();
			 flag++;
		 }
		 
		 System.out.println("middle node "+this.root);
		
		
		// TODO Auto-generated method stub
		
		
	}
	
	@Override
	public void middelNodeViaTwoPointer() {
		
		Node<T> firstPointer = this.root;
		Node<T> secondPointer = this.root;
		while(secondPointer.getNextNode() !=null  && secondPointer.getNextNode().getNextNode() !=null) {
			
			firstPointer = firstPointer.getNextNode();
			secondPointer =	secondPointer.getNextNode().getNextNode();
			
		}
		
		System.out.println("*****middle pointer*******"+firstPointer);
		
	}

	@Override
	public void reverseLinkList() {
		// TODO Auto-generated method stub
		LinkList rever =  new LinkList<Integer>();
		Node<T> flag= this.root;
		rever.insert(flag.getData());
		
		
		while(flag.getNextNode()!= null) {
			
			rever.insert(flag.getNextNode().getData());
			//flag =flag.getNextNode();
			flag = flag.getNextNode();
			
		}
		rever.traversalList();
		
	}
	
	@Override
	public void reverseLinkListInPlace() {
		// TODO Auto-generated method stub
		Node <T> prev = null;
		Node <T> next =null;
		//Node<T> head = this.root;
		Node <T> current = this.root;
		
		while(current != null) {
			
			
			next = current.getNextNode();
			current.setNextNode(prev);
			prev=current;
			current= next;
			
			
		}
		
		this.root = prev;
		
		
	}
	
	

	

}
