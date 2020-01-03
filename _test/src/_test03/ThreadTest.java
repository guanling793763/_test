package _test03;

public class ThreadTest {
	public static void main(String[] args) {
//		Thread t = new Thread();
//		t.start();
		Thread t1 = new Thread(new Runnable() {
			
			@Override
			public void run() {
				System.out.println("ÍÃ×Ó²»³ÔÎÑ±ß²İ");
				
			}
		});
		t1.start();
	}
}
