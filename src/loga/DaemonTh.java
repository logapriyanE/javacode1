package loga;

class ThreadEx extends Thread {
	public void run() {
		for(int i=0;i<5;i++) {
			System.out.println(i+"--Thread");
		}
	}
}

public class DaemonTh {
 
	public static void main(String[] args) throws InterruptedException {
		System.out.println("hii");
		new ThreadEx();
		ThreadEx t1=new ThreadEx();
		t1.setDaemon(true);
		t1.start();
		System.out.println(t1.isDaemon());
		System.out.println("thank you");
		Thread.sleep(1);
		System.out.println("thank you");


	}

}
