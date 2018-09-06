import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.Test;

public class ListUtilTest {
	@Test
	public void testempty() {
		List <?> list = new ArrayList<>();
	    assertEquals(0,ListUtil.countUnique(list));
	}
	
	@Test
	public void testtypical() {
		List <?> list = makeList("a","b","a","c");
		assertEquals(3,ListUtil.countUnique(list));
		
	}
	
	@Test
	public void testtype() {
		List <?> list = makeList(1,"b","a","c",5,5);
		assertEquals(5,ListUtil.countUnique(list));
	}
	
	@Test
	public void testextreme() {
		List <?> list = makeList(0);
		assertEquals(1,ListUtil.countUnique(list));
	}
	
	private List<?> makeList(Object ... objects ){
		return Arrays.asList(objects);
	}
}
