package eg.edu.alexu.csd.filestructure.btree.cs19_cs61_cs12;

import eg.edu.alexu.csd.filestructure.btree.ISearchResult;

public class SearchResult implements ISearchResult {
	
	private String id;
	private int rank;
	
	public SearchResult(String string, int i) {
		this.id = string;
		this.rank = i;
	}

	@Override
	public String getId() {
		return this.id;
	}

	@Override
	public void setId(String id) {
		this.id = id;
	}

	@Override
	public int getRank() {
		return this.rank;
	}

	@Override
	public void setRank(int rank) {
		this.rank = rank;
	}

}
