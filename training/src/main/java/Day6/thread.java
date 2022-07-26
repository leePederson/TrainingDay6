package Day6;

public class thread {
	public static void main(String[] args) {
		EvenNumThread t1 = new EvenNumThread();
		t1.start();
		OddNumberThread t2 = new OddNumberThread();
		t2.start();
		ThreadTo50 t3 = new ThreadTo50();
		
		t3.start();

	}
}

class EvenNumThread extends Thread{
	public void run() {
		
		Thread thread = Thread.currentThread();
//		System.out.println(thread.getName());
//		System.out.println(getPriority());
//		System.out.println(getState());
//		System.out.println(getId());
		try {
			thread.sleep(2000);
		}catch (InterruptedException e1) {
		// TODO Auto-generated catch block
		e1.printStackTrace();
	}
		for (int i = 0; i < 10; i=i+2) {
			System.out.println(i);
			try {
				Thread.sleep(200);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}

class OddNumberThread extends Thread{
	public void run() {
		Thread thread = Thread.currentThread();
//		System.out.println(thread.getName());
//		System.out.println(getPriority());
//		System.out.println(getState());
//		System.out.println(getId());
		try {
			thread.sleep(2000);
		} catch (InterruptedException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}


		for (int j = 1; j < 10; j = j+2) {
			System.out.println(j);
			try {
				Thread.sleep(220);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}

class ThreadTo50 extends Thread{
	public void run() {
		for (int i = 0; i <= 50; i++)
		{
			System.out.println(i);
		}
	}
}