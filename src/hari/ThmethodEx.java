package hari;

class Th extends Thread{
	public void run() {
	for(int i=1;i<=5;i++) {
			System.out.println(i+" Th---1");
		}
}
}

class Thjoin1 extends Thread{
	public void run() {
		for(int i=11;i<=15;i++) {
			System.out.println(i+" Th--2");
		}
}
}
class Thjoin2 extends Thread{
	public void run() {
		for(int i=11;i<=15;i++) {
			System.out.println(i+" Th--3");
		}
}
}

public class ThmethodEx {

	public static void main(String[] args) {
		Th t1=new Th();
		System.out.println(t1.getState());;;
		//
		t1.start();
		System.out.println(t1.getState());;;
		System.out.println(Thread.activeCount());
		System.out.println(t1.getState());;;
		
		
		Thjoin1 t2=new Thjoin1();
		
		Thjoin2 t3=new Thjoin2();
		//t.start();
		
        t2.start();
		try {
			t2.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
				t3.start();
		

	}

}
