package Example;
class Phone{
	   void call(){
		for(int i=1;i<4;i++)
		System.out.println(i+"   calling...."+Thread.currentThread());
	synchronized(this){
		for(int i=1;i<4;i++)
		System.out.println(i+"   msg...."+Thread.currentThread());
	}

}
}
class Th1 extends Phone implements Runnable{
	public void run() {
		
					}
}
class Th2 extends Thread{
	Phone p;//int a;
	Th2(Phone p){
		this.p=p;
	}
		public void run() {
		p.call();
		
	}
}
public class ThreadExa {
    public static void main(String[] args) {
		Phone pp=new Phone();
		Th1 t=new Th1();
		Thread t1=new Thread(t);
		t1.setName("t1");
		t1.start();
		Th2 t2=new Th2(pp);
		t2.setName("t2");
		t2.start();
		Th2 t3=new Th2(pp);
		t3.setName("t3");
		t3.start();
		}

}
