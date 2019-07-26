package baithuchanh4;

public class MyThread2 {
	public void inSoChan() {
		for (int i = 0; i < 10; i++) {
			if (i % 2 == 0) {
				System.out.print(i + " ");
			}
		}
		System.out.println();
	}

	public void inSoLe() {
		for (int i = 0; i < 10; i++) {
			if (i % 2 != 0) {
				System.out.print(i + " ");
			}
		}
		System.out.println();
	}

	public static void main(String[] args) throws InterruptedException {
		MyThread2 mt = new MyThread2();
		Thread thread1 = new Thread() {
			public void run() {
				mt.inSoChan();
			}
		};
		Thread thread2 = new Thread() {
			public void run() {
				mt.inSoLe();
			}
		};
		thread1.start();
		thread1.join();
		thread2.start();
	}
}
