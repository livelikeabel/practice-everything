//package honux;
//
//public class ThreadTest extends Thread {
//	public static long totalSum;
//	public long start, end, sum;
//	
//	public ThreadTest(long start, long end) {
//		this.start = start;
//		this.end = end;
//	}
//	
//	public synchro static long getSum() {
//		return totalSum;
//	}
//	
//	public sychroni
//	
//	public void sum() {
//		System.out.println(start);
//		for (long i = start; i <= end; i++) {
//			sum += i;
//		}
//		merge();
//	}
//
//	@Override
//	public void run() {
//		sum();
//	}
//	
//	public static void main(String[] args) {
//		long max = 100;
//		int n = Runtime.getRuntime().availableProcessors();
//		long step = max / n;
//		Thread[] t = new Thread[n];
//		for (int i = 0; i < n; i++) {
//			t[i] = new ThreadTest(i * step + 1, (i + 1) * step);
//			t[i].start();
//		}
//		
//		for (Thread thread: t) {
//			thread.join();
//		}
//		
//		System.out.println(Thread);
//		
//	}
//}
