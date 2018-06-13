
public class IntSetBST implements IntSet {
	
	int[] array_result;
	public BSTNode root;
	public int maxval;
	public int maxelems;
	public int search_count;
	public int size;
	
	public class BSTNode {
		BSTNode left, right;
		int element;
		//생성자
		public BSTNode() {
			element = 0;
			left = null;
			right = null;
		}
		
		public BSTNode(int data) {
			element = data;
			left = null;
			right = null;
		}
	};

	
	@Override
	public void intSetImp(int maxval, int maxelems) {
		//초기상태 저장
		this.root = null;
		this.maxval = maxval;
		this.maxelems = maxelems;
		this.search_count = 0;
		this.array_result = new int[this.maxelems - 1];
		this.size = 0;
	}
	
	@Override
	public void insert(int element) {
		BSTNode newBSTNode = new BSTNode(element);
		
		//초기 root 삽입 
		if (this.root == null) {
			this.root = newBSTNode;
			this.size++;
			return;
		}
		
		BSTNode nowElement = root; //현재 element
		BSTNode pre_nowElement = null; //바로 전 element
		
		while (true) {
			pre_nowElement = nowElement;
			if (element < nowElement.element) { //삽입된 element가 현재 element 보다 작을 경우
				nowElement = nowElement.left;
				if (nowElement == null) {
					pre_nowElement.left = newBSTNode;
					this.size++;
					return;
				}
			} 
			else if (element > nowElement.element){	//삽입된 element가 현재 element 보다 클 경우 	
				nowElement = nowElement.right;
				if (nowElement==null) {
					pre_nowElement.right = newBSTNode;
					this.size++;
					return;
				}
			}
			else { //삽입된 element가 현재 element와 같을 경우
				return;
			}
		}
	}

	@Override
	public int size() {
		if (root == null) //root = null 일때  0을 return 한다.
			return 0;	
		return this.size;
	}
	
	public void inorder(BSTNode node) {
		if(node == null)
			return;
		inorder(node.left);
		array_result[this.search_count] = node.element;
		this.search_count++;
		inorder(node.right);
	}
	
	@Override
	public int[] report() { //삽입한 element들을 report
		inorder(this.root);
		return this.array_result;
	}
}