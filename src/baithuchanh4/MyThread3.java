package baithuchanh4;

public class MyThread3 {
	private int i;
	private boolean flag=false;

	public synchronized void inSo() throws InterruptedException {
		
		for (i = 0; i < 9;) {
			if(flag){
				wait();
				i++;
			}
			System.out.print(i + " ");
			flag=true;
			notify();
		}

	}

	public synchronized void inChanLe() throws InterruptedException {
		while (i != 9) {
			if(!flag){
				wait();
			}
			if (i % 2 == 0) {
				System.out.println("Chan");
				flag=false;
				notify();
			} else {
				System.out.println("Le");
				flag=false;
				notify();
			}
		}
	}

	public static void main(String[] args) {
		MyThread3 mt3 = new MyThread3();
		Thread thread1 = new Thread() {
			public void run() {
				try {
					mt3.inSo();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		};
		Thread thread2 = new Thread() {
			public void run() {
				try {
					mt3.inChanLe();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		};
		thread1.start();
		thread2.start();
	}
}
