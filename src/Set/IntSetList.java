package Set;
import java.util.Comparator;
import java.util.LinkedList;

public class IntSetList implements IntSet {
	
	/*
	 * by peinilla / Kim hyeon bin
	 */
	
	private LinkedList<Integer> intList = new LinkedList<Integer>();
	
	private int maxelems;
	private int maxval;
	
	public IntSetList() {
		maxelems = 0;
		maxval = 0;
	}
	
	@Override
	public void intSetImp(int maxelems, int maxval) {
		// TODO Auto-generated method stub
		
		// Check maxelems > 0
		if(maxelems > 1) {
			this.maxelems = maxelems;
			this.maxval = maxval;
		}
	}

	@Override
	public void insert(int element) {
		// TODO Auto-generated method stub
		if(size() < maxelems && element <= maxval) {
			intList.add(element);
		}else {
			
		}
	}

	@Override
	public int size() {
		// TODO Auto-generated method stub
		return intList.size();
	}

	@Override
	public int[] report() {
		
		int[] sortArray = new int[size()];
		
		// Ascending Sort
		intList.sort(new Comparator<Integer>() {
			@Override
			public int compare(Integer o1, Integer o2) {
				// TODO Auto-generated method stub
				return o1.compareTo(o2);
			}
		});
		
		for(int idx = 0; idx < sortArray.length; idx ++) {
			sortArray[idx] = intList.get(idx);
		}
		
		return sortArray;
	}
}
