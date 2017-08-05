
public class MyMath {

	
	public int sum(int... args) {
		
		int ret = 0;
		
		for(int i: args) {
			ret += i;
		}
		
		return ret;
		
	}
	
	public int multi(int... args) {
		int ret = 1;
		
		for(int i: args) {
			ret *= i;
		}
		return ret;
	}
}