/**
 * LINE Fukuoka
 * @author krishnasfamily
 *
 */

import java.math.BigDecimal;

public class FunctionN {
	/**
	 * @param arg
	 */
	
	public static void main (String arg[]) {
		System.out.println(4/4);
		
		//System.out.println(fn(8181));
	}
	
	private static BigDecimal fn(int n) {
		if(n <= 1) {
			return new BigDecimal(n);
		}
		BigDecimal fn = new BigDecimal(1);
		BigDecimal prevFn = new BigDecimal(1);
		
		for(int i=2; i<n; i++) {
			BigDecimal temp = fn;
			fn = prevFn.add(fn);
			prevFn = temp;
		}
		return fn;
	}

}
