package loga;

class Bank {
	int amt=1000;
	synchronized void withdraw(int amt1) {
		if(amt1<=amt) {
		amt=amt-amt1;
		System.out.println("bal amt --"+amt);
		}
		else {
			System.out.println(" not available ");
			try {
				wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			amt=amt-amt1;
			System.out.println("bal amt  "+amt);
			
		}
		System.out.println("finished...");
		
	}
	synchronized void deposit(int amt2) {
		amt=amt+amt2;
		System.out.println("amt added");
		notify();
	}
	

}
class Th1  implements Runnable {
	Bank b;
	Th1(Bank b){
		this.b=b;
	}
	public void run() {
		b.withdraw(2000);
		
	}
	
}
class Th2  implements Runnable {
	Bank b;
	Th2(Bank b){
		this.b=b;
	}
	public void run() {
		b.deposit(2000);
	}
	
}
public class Waitnotify {
    public static void main(String[] args) throws InterruptedException {
    	Bank b=new Bank();
    	Th1 t=new Th1(b);
    	Th2 tt=new  Th2(b);
    	
    	
    	Thread t1=new Thread(t);
    	Thread t2=new Thread(tt);
    	    	
    	t1.start();
   
    	t2.start();
    	
    	
    	
    	
    	
    	
		
	}
	
}
