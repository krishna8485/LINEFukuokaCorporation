
/**
 * LINE Fukuoka
 * @author krishnasfamily
 *
 */

public class DiceSolution {
	
	public static void main(String arg[]) {
		System.out.println(getCombination(610));
		
	}
	
	private static int getCombination(int sum) { 
		int [] intArray = new int[sum+1];
		intArray[0]=1;
		
		for (int i=1; i<7; i++) {
			for (int j=i; j<=sum; j++) {
				intArray[j]+= intArray[j-i];
			}
		}
		return intArray[sum];
	}

}
