import java.util.ArrayList;

public class TreeSetRunner{
	
	public TreeSetRunner()
	{
		TreeSet<Integer> tree=new TreeSet<Integer>();

		tree.add(10);
		tree.add(6);
		tree.add(12);
		tree.add(3);
		tree.add(7);
		tree.add(15);
		tree.add(4);
		tree.add(5);
		tree.add(10);
		tree.add(11);
		tree.add(19);
		System.out.println("PreOrder: "+tree.preOrder());
		System.out.println("InOrder: "+tree.inOrder());
		System.out.println("PostOrder: "+tree.postOrder());
		System.out.println("Size: "+tree.size());

		System.out.println("\n\nRemoving: ");
		tree.remove(10);
		System.out.println("Removed 10");
		System.out.println(tree.preOrder());
		System.out.println("Size: "+tree.size());
		tree.remove(3);
		System.out.println("\nRemoved 3");
		System.out.println(tree.preOrder());
		System.out.println("Size: "+tree.size());
		tree.remove(7);
		System.out.println("\nRemoved 7");
		System.out.println(tree.preOrder());
		System.out.println("Size: "+tree.size());
		tree.remove(15);
		System.out.println("\nRemoved 15");
		System.out.println(tree.preOrder());
		System.out.println("Size: "+tree.size());
		tree.remove(4);
		System.out.println("\nRemoved 4");
		System.out.println(tree.preOrder());
		System.out.println("Size: "+tree.size());
		tree.remove(5);
		System.out.println("\nRemoved 5");
		System.out.println(tree.preOrder());
		System.out.println("Size: "+tree.size());
		tree.remove(6);
		System.out.println("\nRemoved 6");
		System.out.println(tree.preOrder());
		System.out.println("Size: "+tree.size());
		tree.remove(12);
		System.out.println("\nRemoved 12");
		System.out.println(tree.preOrder());
		System.out.println("Size: "+tree.size());
		tree.remove(10);
		System.out.println("\nRemoved 10");
		System.out.println(tree.preOrder());
		System.out.println("Size: "+tree.size());
		tree.remove(19);
		System.out.println("\nRemoved 19");
		System.out.println(tree.preOrder());
		System.out.println("Size: "+tree.size());
		tree.remove(11);
		System.out.println("\nRemoved 11");
		System.out.println(tree.preOrder());
		System.out.println("Size: "+tree.size());
		
		//MARCH 2, 2021
		
		TreeSet<String> tree2=new TreeSet<String>();
		
		String[]letters =  "Q W E R T Y U I O P A S D F G H J K L Z X C V B N M ! @ # $ ".split(" ");
		for(String s:letters) {
			tree2.add(s);
		}
		System.out.println("Original set - PreOrder: " + tree2.preOrder());
		System.out.println("Original set - InOrder: " + tree2.postOrder());
		System.out.println("Original set - PostOrder: " + tree2.inOrder());
		System.out.println("********************************************************************");
		
		String preOrderStr = tree2.preOrder();
		String[] temp = preOrderStr.substring(1,preOrderStr.length()).split(", ");
		TreeSet<String> preOrderCopy = new TreeSet<String>();
		for(String s:temp) {
			preOrderCopy.add(s);
		}
		System.out.println("PreOrder set - PreOrder: " + preOrderCopy.preOrder());
		System.out.println("PreOrder set - InOrder: " + preOrderCopy.postOrder());
		System.out.println("PreOrder set - PostOrder: " + preOrderCopy.inOrder());
		System.out.println("********************************************************************");
		
		String inOrderStr = tree2.preOrder();
		temp = inOrderStr.substring(1,inOrderStr.length()).split(", ");
		TreeSet<String> inOrderCopy = new TreeSet<String>();
		for(String s:temp) {
			inOrderCopy.add(s);
		}
		System.out.println("InOrder set - PreOrder: " + inOrderCopy.preOrder());
		System.out.println("InOrder set - InOrder: " + inOrderCopy.postOrder());
		System.out.println("InOrder set - PostOrder: " + inOrderCopy.inOrder());
		System.out.println("********************************************************************");
		
		String postOrderStr = tree2.postOrder();
		temp = postOrderStr.substring(1,preOrderStr.length()).split(", ");
		TreeSet<String> postOrderCopy = new TreeSet<String>();
		for(String s:temp) {
			postOrderCopy.add(s);
		}
		System.out.println("PostOrder set - PreOrder: " + postOrderCopy.preOrder());
		System.out.println("PostOrder set - InOrder: " + postOrderCopy.postOrder());
		System.out.println("PostOrder set - PostOrder: " + postOrderCopy.inOrder());
		System.out.println("********************************************************************");
		//Rotation stuff
		System.out.println("Rotate Right");
		tree2.rotateRight();
		System.out.println(tree2.preOrder());
		System.out.println(tree2.inOrder());
		System.out.println(tree2.postOrder());
		System.out.println("Rotate Right Again");
		tree2.rotateRight();
		System.out.println(tree2.preOrder());
		System.out.println(tree2.inOrder());
		System.out.println(tree2.postOrder());
		System.out.println("Rotate Right Third Time");
		tree2.rotateRight();
		System.out.println(tree2.preOrder());
		System.out.println(tree2.inOrder());
		System.out.println(tree2.postOrder());
		System.out.println("Rotate Left");
		tree2.rotateLeft();
		System.out.println(tree2.preOrder());
		System.out.println(tree2.inOrder());
		System.out.println(tree2.postOrder());
		System.out.println("Rotate Left Again");
		tree2.rotateLeft();
		System.out.println(tree2.preOrder());
		System.out.println(tree2.inOrder());
		System.out.println(tree2.postOrder());
		System.out.println("Rotate Left Third Time");
		tree2.rotateLeft();
		System.out.println(tree2.preOrder());
		System.out.println(tree2.inOrder());
		System.out.println(tree2.postOrder());
		
		
		//THE SECOND RUNNER (ON ORIGINAL ASSIGNMENT)******************************************************
		
		
		//1
		System.out.println("\nPART 1 AND 2 | Fill your TreeSet with 30 random numbers from 1 to 100.");
		TreeSet<Integer> numbers = new TreeSet<Integer>();
		for(int i = 0; i < 30; i++) {
			int n = (int)(Math.random()*100+1);
			numbers.add(n);
			//2
			System.out.print(n + " ");
		}
		//3
		System.out.println("\nPART 3| Output the size of the tree.");
		System.out.println("size of the tree: " + numbers.size());
		//4
		TreeSet<Integer> numbers2 = new TreeSet<Integer>();
		String numberstr = numbers.preOrder();
		temp = numberstr.substring(1,numberstr.length()-1).split(", ");
		for(String s: temp) {
			numbers2.add(Integer.parseInt(s));
		}
		//5
		System.out.println("\n\nPART 5| Output all of the values from the new tree using PreOrder, InOrder, and PostOrder traversals to\n" + 
				"verify that it has made an exact duplicate of your original tree.");
		System.out.println("PreOrder: " + numbers2.preOrder());
		System.out.println("InOrder: " + numbers2.inOrder());
		System.out.println("PostOrder: " + numbers2.postOrder());
		//6
		TreeSet<Integer> numbers3 = new TreeSet<Integer>();
		for(String s: temp) {
			numbers3.add(Integer.parseInt(s));
		}
		//7
		System.out.println("\nPART 7| Output all of the values from the new tree using PreOrder, InOrder, and PostOrder traversals to\n" + 
				"verify that it has made an exact duplicate of your original tree.");
		System.out.println("PreOrder: " + numbers3.preOrder());
		System.out.println("InOrder: " + numbers3.inOrder());
		System.out.println("PostOrder: " + numbers3.postOrder());
		//8
		TreeSet<Integer> numbers4 = new TreeSet<Integer>();
		for(String s: temp) {
			numbers4.add(Integer.parseInt(s));
		}
		//9
		System.out.println("\nPART 9| Output all of the values from the new tree using PreOrder, InOrder, and PostOrder traversals to\n" + 
				"verify that it has made an exact duplicate of your original tree.");
		System.out.println("PreOrder: " + numbers4.preOrder());
		System.out.println("InOrder: " + numbers4.inOrder());
		System.out.println("PostOrder: " + numbers4.postOrder());
		//10
		System.out.println("\nPART 10 | Create a new TreeSet and fill it with 20 random String values (you can randomly generate letters\n" + 
				"of the alphabet). Output the letters as they are being generated so that you can check them with\n" + 
				"the traversals in step 10.");
		TreeSet<String> strings = new TreeSet<String>();
		for(int i = 0; i < 20; i++) {
			int n = (int)(Math.random()*26 + 1);
			strings.add(letters[n]);
			System.out.print(letters[n] + " ");
		}
		//11
		System.out.println("\n\nPART 11 | Output all of the values from the new tree using PreOrder, InOrder, and PostOrder traversals.");
		System.out.println("PreOrder: " + strings.preOrder());
		System.out.println("InOrder: " + strings.inOrder());
		System.out.println("PostOrder: " + strings.postOrder());
		//12
		System.out.println("\nPART 12| Rotate your tree 3 times to the right. After each rotation, output the PreOrder, InOrder, and\n" + 
				"PostOrder traversals of the tree.");
		strings.rotateRight();
		System.out.println("PreOrder: " + strings.preOrder());
		System.out.println("InOrder: " + strings.inOrder());
		System.out.println("PostOrder: " + strings.postOrder());
		
		strings.rotateRight();
		System.out.println("PreOrder: " + strings.preOrder());
		System.out.println("InOrder: " + strings.inOrder());
		System.out.println("PostOrder: " + strings.postOrder());
		
		strings.rotateRight();
		System.out.println("PreOrder: " + strings.preOrder());
		System.out.println("InOrder: " + strings.inOrder());
		System.out.println("PostOrder: " + strings.postOrder());
		//13
		System.out.println("\nPART 13| Rotate your tree 3 times to the left. After each rotation, output the PreOrder, InOrder, and\n" + 
				"PostOrder traversals of the tree.");
		strings.rotateLeft();
		System.out.println("PreOrder: " + strings.preOrder());
		System.out.println("InOrder: " + strings.inOrder());
		System.out.println("PostOrder: " + strings.postOrder());
		
		strings.rotateLeft();
		System.out.println("PreOrder: " + strings.preOrder());
		System.out.println("InOrder: " + strings.inOrder());
		System.out.println("PostOrder: " + strings.postOrder());
		
		strings.rotateLeft();
		System.out.println("PreOrder: " + strings.preOrder());
		System.out.println("InOrder: " + strings.inOrder());
		System.out.println("PostOrder: " + strings.postOrder());
		//14
		System.out.println("\nPART 14| Create a new TreeSet and fill it with 10 random integer values (as you are doing this, make an\n" + 
				"ArrayList version that has the same values).");
		ArrayList<Integer> list = new ArrayList<Integer>();
		TreeSet<Integer> integers = new TreeSet<Integer>();
		for(int i = 0; i < 10; i++) {
			int n = (int)(Math.random()*10 + 1);
			integers.add(n);
			list.add(n);
			System.out.print(n + " ");
		}
		//15
		System.out.println("\n\nPART 15| Randomly remove a value from the ArrayList and use that number as the remove value for the\n" + 
				"TreeSet.");
		while(integers.size()!=0) {
			int randomindex = (int)(Math.random()*list.size());
			int num = list.remove(randomindex);
			integers.remove(num);
			System.out.println("removed " + num + ". preOrder: " + integers.preOrder());
		}
		//16
		System.out.println("\nPART 16| Display the TreeSet using PreOrder, InOrder, and PostOrder traversals after each value is\n" + 
				"removed from the TreeSet.");
		System.out.println("PreOrder: " + integers.preOrder());
		System.out.println("InOrder: " + integers.inOrder());
		System.out.println("PostOrder: " + integers.postOrder());
	}
	public static void main(String[] args){
		TreeSetRunner app=new TreeSetRunner();
	}
}
