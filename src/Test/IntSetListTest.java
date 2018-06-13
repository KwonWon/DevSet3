package Test;

import static org.junit.Assert.*;
import org.junit.Test;
import Set.IntSetList;

public class IntSetListTest {
	IntSetList S = new IntSetList();

	final int bigNum = 10000;
	
	public IntSetListTest() {
		S.intSetImp(5, 100);
		
		S.insert(1);
		S.insert(10);
		S.insert(5);
		S.insert(3);
		S.insert(7);
	}

	@Test
	public void testIntSetImp() {
		
	}

	@Test
	public void testInsert() {
		IntSetList test = new IntSetList();
		test.intSetImp(2, 10);
		
		test.insert(11); // over maxVal test
		
		test.insert(3);
		test.insert(10);
		
		test.insert(5); // over size test
		
		assertEquals(2, test.size());
	}

	@Test
	public void testSize() {	
		assertEquals(5, S.size());
	}

	@Test
	public void testReport() {
		int[] compareSort = {1, 3, 5, 7, 10};
		
		assertArrayEquals(compareSort, S.report());
	}
	
	@Test
	public void testP() {
		IntSetList timeTest = new IntSetList();
		timeTest.intSetImp(bigNum, bigNum);
		
		for(int idx = 0; idx < bigNum; idx++) {
			timeTest.insert(idx);
		}
	}

}
