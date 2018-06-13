package Test;

import static org.junit.Assert.*;

import org.junit.Test;

import Set.IntSetList;
import Set.IntSetArr;

public class IntSetArrTest {

	final int bigNum = 10000;
	
	public IntSetArrTest() {

	}
	
	@Test
	public void testIntSetArr() {
		fail("Not yet implemented");
	}

	@Test
	public void testIntSetImp() {
		fail("Not yet implemented");
	}

	@Test
	public void testInsert() {
		fail("Not yet implemented");
	}

	@Test
	public void testSize() {
		fail("Not yet implemented");
	}

	@Test
	public void testReport() {
		fail("Not yet implemented");
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
