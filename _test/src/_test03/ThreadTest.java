package _test03;

public class ThreadTest {
	public static void main(String[] args) {
//		Thread t = new Thread();
//		t.start();
		Thread t1 = new Thread(new Runnable() {
			
			@Override
			public void run() {
				System.out.println("���Ӳ����ѱ߲�");
				
			}
		});
		t1.start();
	}
}
