package eg.edu.alexu.csd.filestructure.btree.cs19_cs61_cs12;

import java.util.ArrayList;
import java.util.List;

import eg.edu.alexu.csd.filestructure.btree.ISearchEngine;
import eg.edu.alexu.csd.filestructure.btree.ISearchResult;

public class SearchEnginMain {
	

	public static void main(String[] args) {
		
		ISearchEngine searchEngine = new SearchEngine(2);



		//searchEngine.indexDirectory("Directory");

		searchEngine.indexDirectory("Directory/Sub/su");

		List<ISearchResult> res = searchEngine.searchByMultipleWordWithRanking("my name is usseif");
		

		

		for (int i = 0; i < res.size(); i++) {

			System.out.println("id: " + res.get(i).getId());

			System.out.println("rank: " + res.get(i).getRank());

			System.out.println();

			System.out.println();
		}

		
		//ISearchEngine searchEngine = new SearchEngine(3);
		
		//searchEngine.indexDirectory("directory");
		//searchEngine.indexWebPage("wiki_00");
		
        /*List<Integer> a = new ArrayList<Integer>(); 
        List<Integer> b = new ArrayList<Integer>(); 
        List<Integer> c = new ArrayList<Integer>(); 
        List<Integer> d = new ArrayList<Integer>(); 
        List<Integer> e = new ArrayList<Integer>(); 
        
        for (int i = 0; i < 4; i++) {
			a.add(i);
		}
        for (int i = 1; i < 5; i++) {
			b.add(i);
		}
        for (int i = 2; i < 6; i++) {
			c.add(i);
		}
        for (int i = 3; i < 7; i++) {
			d.add(i);
		}
        for (int i = 4; i < 8; i++) {
			e.add(i);
		}

        
        System.out.println("List a : " + a);
        System.out.println("List b : " + b);
        System.out.println("List c : " + c);
        System.out.println("List d : " + d);
        System.out.println("List e : " + e);

        
		List<List<Integer>> searchResultLists = new ArrayList();
		
		searchResultLists.add(a);
		searchResultLists.add(b);
		searchResultLists.add(c);
		searchResultLists.add(d);
		searchResultLists.add(e);
		
		System.out.println("searchResultLists size : " + searchResultLists.size());
		
		

		
		
		for (int i = 0; i < searchResultLists.size() - 1; i++) {  //AllWords
			List<Integer> intersectionSearchResult = new ArrayList();

			for (int j = 0; j < searchResultLists.get(i).size(); j++) { //FirstWord
				
				int first = searchResultLists.get(i).get(j);
				System.out.println("First : " + first);

				
				for (int t = 0; t < searchResultLists.get(i+1).size(); t++) { //SecondWord
					
					int second = searchResultLists.get(i+1).get(t);
					System.out.println("Second : " + second);

					
					if (first == second) {
						int rank = 0;
						if (first < second) {
							rank = first;
						} else {
							rank = second;
						}
						System.out.println("Rank : " + rank);
						intersectionSearchResult.add(rank);
						
					}
				}
			}
			
			System.out.println("intersectionSearchResult : " + intersectionSearchResult);
			searchResultLists.set(i + 1, intersectionSearchResult);
			
		}*/
		
		

	}

}
