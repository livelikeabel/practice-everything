//package honux;
//
//public class Thread2 extends Thread {
//	public static int count = 0;
//	
//	private Data data = null;
//	
//	public ThreadTest(Data data) {
//		this.data = data;
//	}
//	
//	public synchronized void inc() {
//		for (int i = 0; i < 10000; i++) {
//			count = count + 1; 
//		}
//		System.out.println(count);
//	}
//	public void run() {
//		for( int i = 0; i < 10000; i++) {
//			data.add();
//		}
//		System.out.println(data.getSum());
//	}
//	
//	public static void main(String[] args) throws InterruptedException {
//		Data d = new Data();
//		Thread t1 = new Thread2();
//		Thread t2 = new Thread2();
//		t1.start();
//		t2.start();
//		t1.join(); //t1 sleep until die.
//		t2.join(); //sleep until t2 die.
//		System.out.println("Main Thread ended");
//	}
//}
