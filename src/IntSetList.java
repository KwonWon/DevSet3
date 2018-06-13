import java.util.LinkedList;

public class IntSetList implements IntSet {
	
	/*
	 * by peinilla / Kim hyeon bin
	 */
	
	private LinkedList<Integer> intList = new LinkedList<Integer>();
	private int length;
	private int maxelems;
	private int maxval;
	
	@Override
	public void intSetImp(int maxelems, int maxval) {
		// TODO Auto-generated method stub
		this.maxelems = maxelems;
		this.maxval = maxval;
	}

	@Override
	public void insert(int element) {
		// TODO Auto-generated method stub
		if(size() < maxelems) {
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
		// TODO Auto-generated method stub
		return null;
	}

}
