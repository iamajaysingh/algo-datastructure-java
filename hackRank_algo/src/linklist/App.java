package linklist;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LinkList bb = new LinkList<Integer>();
		bb.insert(1);
		bb.insert(2);
		bb.insert(3);
		bb.insert(4);
		bb.insert(5);
		
	   
	 int s = bb.size();
	 System.out.println("========"+s);
		//bb.traversalList();
	//	bb.middelNode();
		//bb.middelNodeViaTwoPointer();
		//bb.reverseLinkList();
		bb.reverseLinkListInPlace();
		
		
		
		
		
		
		
		
	
		
		
		

	}

}
