package loga;

class Contra {
		int bullet=5;
		synchronized void fire()
		{
			for(int i=0;i<=10;i++)
			{
			    System.out.println(i+"fire");
				bullet--;
				if(bullet==0)
				{
					try {
						wait();
					} catch (InterruptedException e) {
						
						e.printStackTrace();
					}
				}
			}
		}
		synchronized void reload() 
		{
					bullet=5;
		   System.out.println("reloaded");
		    notify();
		}
}
class The1 implements Runnable
{
	Contra g;
	The1(Contra g){
	this.g=g;
}
	public void run() {
	g.fire();
	}
}
class The2 implements Runnable
{
	Contra g;
	The2(Contra g){
	this.g=g;
	}
	public void run() {
	g.reload();
	}

}

	public class Game{
		public static void main(String[] args)
		{ 
		Contra g=new Contra();
			The1 t=new The1(g);
			The2 tt=new The2(g);
			Thread t1=new Thread(t);
			Thread t2=new Thread(tt);
		    t1.start();
			t2.start();
		}
}


