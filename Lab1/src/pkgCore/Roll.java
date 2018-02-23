/*package pkgCore;

public class Roll {
	
	private Die d1;
	private Die d2;
	private int Score;

	public Roll() {
		Die d1 = new Die();
		Die d2 = new Die();
		// TODO: Create an instance of d1 and d2...
		// TODO: Determine 'Score'
	}

	public int getScore() {
		Score = d1.getDieValue() + d2.getDieValue();
		return Score;
	}

} */

package pkgCore;

public class Roll {

	private Die d1;
	private Die d2;
	private int Score;

	public Roll() {
		// TODO: Create an instance of d1 and d2...
		// TODO: Determine 'Score'
		d1 = new Die();
		d2 = new Die();
		
	}

	public int getScore() {
		return  d1.getDieValue() + d2.getDieValue();
	}
	
	public boolean isSeven() {
		return Score == 7;
	}
	public boolean isEleven() {
		return Score == 11;
	}
	public boolean isNatural() {
		return isSeven() || isEleven();
	}
	
	public boolean isTwo() {
		return Score == 2;
	}
	public boolean isThree() {
		return Score == 3;
	}
	public boolean isTwelve() {
		return Score == 12;
	}
	public boolean isCraps() {
		return isTwo() || isThree() || isTwelve();
	}
}

