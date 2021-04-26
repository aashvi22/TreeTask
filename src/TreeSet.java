//Aashvi, Feb 26, 2021
public class TreeSet<E extends Comparable<E>> {
	TreeNode<E> root;
	int size=0;
	String str="";
	
	public void add(E o) {
		if(root==null) {
			root=new TreeNode(o);
			size++;
		}
		else {
			add(o, root);
			//size++;
		}
	}
	public int size() {
		return size;
	}
	public void add(E o, TreeNode<E> node) {
		if(o == node.getValue())
			return;
		else if(o.compareTo((E)node.getValue())<0) {
			if(node.getLeft()==null) {
				node.setLeft(new TreeNode(o));
				size++;
				return;
			}
			else {
				add(o, node.getLeft());
			}
		}
		else {
			if(node.getRight()==null) {
				node.setRight(new TreeNode(o));
				size++;
				return;
			}
			else {
				add(o, node.getRight());
			}
		}
	}
	public String preOrder() {
		str="";
		if(size==0)
			return "[]";
		else {
			preOrder(root);
			String s = "[" + str.substring(0,str.length()-2)+"]";
			return s;
		}
	}
	public String postOrder() {
		str="";
		if(size==0)
			return "[]";
		else {
			postOrder(root);
			String s = "[" + str.substring(0,str.length()-2)+"]";
			return s;
		}
	}
	public String inOrder() {
		str="";
		if(size==0)
			return "[]";
		else {
			inOrder(root);
			String s = "[" + str.substring(0,str.length()-2)+"]";
			return s;
		}
	}
	public void preOrder(TreeNode<E> node) {
		if(node!=null) {
			str+=node.getValue().toString() + ", ";
			preOrder(node.getLeft());
			preOrder(node.getRight());
		}
	}
	public void postOrder(TreeNode<E> node) {
		if(node!=null) {
			postOrder(node.getLeft());
			postOrder(node.getRight());
			str+=node.getValue().toString() + ", ";
		}
	}
	public void inOrder(TreeNode<E> node) {
		if(node!=null) {
			inOrder(node.getLeft());
			str+=node.getValue().toString() + ", ";
			inOrder(node.getRight());
		}
	}
	public void remove(E val) {
		if(root==null) {
			return;
		}
		else if(contains(root,val)) {
			if(root.getLeft() == null && root.getRight()==null) {
				root=null;
				size=0;
				return;
			}
			else {
				size--;
				root=remove(root,val);
			}
		}
		
	}
	public TreeNode<E> remove(TreeNode<E> node, E val) {
		if(node.equals(null))
			return null;
		else if(val.compareTo(node.getValue())<0){
			node.setLeft(remove(node.getLeft(),val));
		}
		else if(val.compareTo(node.getValue())>0){
			node.setRight(remove(node.getRight(),val));
		}
		else {
			if(node.getLeft()==null && node.getRight()==null)
				node=null;
			else if(node.getLeft()==null)
				return node.getRight();
			else if(node.getRight()==null)
				return node.getLeft();
			else {
				E temp = minValue(node.getRight());
				node.setValue(temp);
				node.setRight(remove(node.getRight(),temp));
			}
		}
		return node;
	}
	public boolean contains(TreeNode<E> node, E val) {
		if(node==null) 
			return false;
		else if(node.getValue()==val)
			return true;
		else if(val.compareTo(node.getValue())<1)
			return contains(node.getLeft(),val);
		else
			return contains(node.getRight(),val);
		
	}
	public E minValue(TreeNode<E> node) {
		if(node.getLeft()==null) {
			return node.getValue();
		}
		else {
			return minValue(node.getLeft());
		}
	}
	public void rotateRight(){
		if(root==null || root.getLeft()==null)
			return;
		else {
			rotateRight(root);
		}
	}
	public void rotateRight(TreeNode<E> node){
		TreeNode<E> temp = node.getLeft();
		node.setLeft(temp.getRight());
		temp.setRight(node);
		root=temp;
	}
	public void rotateLeft(){
		if(root==null || root.getRight()==null)
			return;
		else {
			rotateLeft(root);
		}
	}
	public void rotateLeft(TreeNode<E> node){
		TreeNode<E> temp = node.getRight();
		node.setRight(temp.getLeft());
		temp.setLeft(node);
		root=temp;
	}
	
	public class TreeNode<E extends Comparable<E>>{
		TreeNode<E> left;
		TreeNode<E> right;
		E value;
		public TreeNode(E o) {
			value = o;
			left = null;
			right = null;
		}
		public TreeNode<E> getLeft() {
			return left;
		}
		public TreeNode<E> getRight() {
			return right;
		}
		public void setRight(TreeNode<E> node) {
			right=node;
		}
		public void setLeft(TreeNode<E> node) {
			left=node;
		}
		public E getValue() {
			return value;
		}
		public void setValue(E val) {
			value=val;
		}
		public String toString() {
			return value+"";
		}
	}
}
