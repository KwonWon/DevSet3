package Test;

import static org.junit.Assert.*;
import org.junit.Test;
import Set.IntSetList;

public class IntSetListTest {
	
	public IntSetListTest() {
		IntSetList S = new IntSetList();
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
	}

	@Test
	public void testReport() {
	}
	
	@Test(timeout = 10000)
	public void testTime() {
		
	}

}
