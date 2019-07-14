package eg.edu.alexu.csd.filestructure.btree.cs19_cs61_cs12;

import eg.edu.alexu.csd.filestructure.btree.IBTree;

public class Main {

	public static void main(String[] args) {

		IBTree<Integer, Integer> b = new BTree<>(3);
		//MIN 2
		//MAX 5
		
		b.insert(1, 1);
		b.insert(3, 3);
		b.insert(7, 7);
		b.insert(10, 10);
		b.insert(11, 11);
		b.insert(13, 13);
		b.insert(14, 14);
		b.insert(15, 15);
		b.insert(18, 18);
		b.insert(16, 16);
		b.insert(19, 19);
		b.insert(24, 24);
		b.insert(25, 25);
		b.insert(26, 26);
		b.insert(21, 21);
		b.insert(4, 4);
		b.insert(5, 5);
		b.insert(20, 20);
		b.insert(22, 22);
		b.insert(2, 2);
		b.insert(17, 17);
		b.insert(12, 12);
		b.insert(6, 6);
		
		
		
		b.delete(14);



		
		
		
		/*for (int i = 1; i <= 9; i++) {
			b.insert(i, i);
		}
		
		for (int i = 1; i <= 6; i++) {
			System.out.println("searching for: " + i + " found: " + b.search(i));
		}
		
		b.delete(1);
		b.delete(4);*/
		/*b.delete(6);
		b.delete(5);
		b.delete(4);*/
		//System.out.println("searching for: " + 2 + " found: " + b.search(2));
		
		/*IBTree<Integer, Integer> b = new BTree<>(5);
		 * 
		for (int i = 1; i <= 9; i++) {
			b.insert(i, i);
		}
		b.delete(1);
		b.delete(2);
		b.delete(3);
		b.delete(4);
		b.delete(5);
		b.delete(6);
		b.delete(7);
		b.delete(8);
		b.delete(9);*/


		
	}

}
