package Set;

public class IntSetArr implements IntSet {
	private int[] array;
	private int length;
	private int maxelems;
	
	public IntSetArr() {
		this.length = 0;
		this.maxelems = 0;
	}

	@Override
	public void intSetImp(int maxelems, int maxval) {
		// TODO Auto-generated method stub
		array = new int[maxval];
		this.maxelems = maxelems;
	}

	@Override
	public void insert(int element) {
		// TODO Auto-generated method stub
		array[length] = element;
	}

	@Override
	public int size() {
		// TODO Auto-generated method stub
		return length;
	}

	@Override
	public int[] report() {
		// TODO Auto-generated method stub
		sort();
		
		return array;
	}
	
	private void sort() {
		for(int i = 0; i < array.length; i++) {
			for(int j = 0; j < array.length - i; j++) {
				if(array[j] > array[j+1]) {
					int temp = array[j];
					array[j] = array[j+1];
					array[j+1] = temp;
				}
			}
		}
	}
	
}
