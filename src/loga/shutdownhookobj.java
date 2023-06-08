package loga;
class TT extends Thread{
	public void run() {
		System.out.println(" User thread ");
	}
}
class T extends Thread{
	public void run() {
		System.out.println(" hook thread - End...");
	}
}

public class shutdownhookobj {
    public static void main(String[] args) {
		System.out.println("welcome");
		TT t1=new TT();
		T t2=new T();
		t1.start();
		//t2.start();
		java.lang.Runtime.getRuntime().addShutdownHook(t2);
		System.out.println("thank you");
		

	}

}
