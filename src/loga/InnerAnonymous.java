package loga;



class AOut{
	private String name="k";
	class BIn{
		private String id="101";
		void dis() {
			System.out.println(name);
		}
		
	}
}
abstract class AbsOut{
	  public abstract void add();
	  void sub() {
		  System.out.println("sub");
	  }
	}

interface inter{
	void m1();
}

public class InnerAnonymous {

	public static void main(String[] args) {
		AOut o=new AOut();
     AOut.BIn obj=o.new BIn();
     obj.dis();
     AbsOut obj1=new AbsOut() {
    	 public void add() {
    		System.out.println("add"); 
    	 }
    	 public void sub() {
    		 System.out.println("sub1");
    	 }
     };
     obj1.add();
     obj1.sub();
	
	
	Thread t1=new Thread(new Runnable (){ 
		  public void run() {
				System.out.println("Thread");
			} 
	  });
	t1.start();
	 new inter() {
	public	void m1() {
			
		}
	 };
	
  
}
}









