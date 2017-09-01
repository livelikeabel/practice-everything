package honux;

public class Data {
	private int sum = 0;
	
	public synchronized void add(int n) {
		sum ++;
	}
	
	public int getSum() {
		return sum;
	}
 }
