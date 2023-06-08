package hari;

class Th1 extends Thread{
	public void run() {
		for(int i=1;i<=5;i++) {
			System.out.println(i+" Th1");
		}
}
}
class Th2 implements Runnable{
	public void run() {
	for(int i=6;i<=10;i++) {
		System.out.println(i+" Th2");
	}
	}
}
class Th3 extends Thread{
	public void run() {
		for(int i=11;i<=15;i++) {
			System.out.println(i+" Th3");
		}
}
}
public class ThreadEx {

	public static void main(String[] args) {
		Th1 t1=new Th1();
		Th2 t=new Th2();
		Thread t2=new Thread(t);
		Th3 t3=new Th3();
		t1.start();
		t2.start();
		t3.start();

	}

}
