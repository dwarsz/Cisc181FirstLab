/*package pkgTest;

import static org.junit.Assert.*;

import org.junit.Test;

import pkgCore.Die;

public class DieTest {

	@Test
	public void TestDie() {

		for (int a = 0; a < 10000; a++) {
			Die d = new Die();
			// TODO: Make sure value of die is between 1 and 6.
		}

	}

}
*/
package pkgTest;

import static org.junit.Assert.*;

import org.junit.Test;

import pkgCore.Die;

public class DieTest {
/* working test
	@Test
	public void TestDie() {
int iTotalTrials = 10000;
		
		for (int a = 0; a < 10000; a++) {
			Die d = new Die();
			if ((d.getDieValue() >=1) && (d.getDieValue() <=6)) 
			{
			
			}
			else {
			fail();}}}}
			
		*/
	@Test
	public void TestRandomDie() {
int iTotalTrials = 10000;
		int[] arrayInt = { 0, 0, 0, 0, 0, 0};
		for (int a = 0; a < 10000; a++) {
			Die d = new Die();
			
			arrayInt[d.getDieValue()-1]++;
			}	
		for (int i: arrayInt)
		{
			assertEquals(iTotalTrials / 6, i, 100);   //checks to see if a number apppeared within 100 times of 1666
		}
	}
	}
			
	

	


