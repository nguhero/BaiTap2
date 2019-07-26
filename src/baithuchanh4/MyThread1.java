package baithuchanh4;

public class MyThread1 implements Runnable {

	@Override
	public void run() {
		for (int i = 0; i < 10; i++) {
			System.out.print(i + " ");
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		// TODO Auto-generated method stub

	}
public static void main(String[] args) {
	MyThread1 thread1=new MyThread1();
	MyThread1 thread2=new MyThread1();
	Thread t1=new Thread(thread1);
	Thread t2=new Thread(thread2);
	t1.setPriority(Thread.MAX_PRIORITY);
	t2.setPriority(Thread.MIN_PRIORITY);
	t1.start();
	t2.start();
}
}
