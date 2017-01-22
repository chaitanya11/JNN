package extension;

import java.util.Random;

/**
 * @author chaitanyagarikipati
 *
 */
// from AI
public class OutputGenerator {
	private Random r;

	public OutputGenerator() {
		this.r = new Random();
	}

	/**
	 * Random number generator
	 * 
	 * @return
	 */
	public Object generateOputput() {
		return this.r.nextFloat();
	}

	/**
	 * Random number generator
	 * 
	 * @return
	 */
	public float generateStrength() {
		return this.r.nextFloat();
	}
}
