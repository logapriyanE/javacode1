package hari;
class Aaa extends Thread
{
    public void run()throws IllegalMonitorStateException
	{
		synchronized(this){
		for(int i=0;i<3;i++)
		{
			System.out.println(i);
		}
		try{
		wait();}
		catch(Exception e){}
		}
		System.out.println("i got notlfy ");
		for(int j=0;j<3;j++)
		{
			System.out.println("a");
		}
	}
}
class B extends Thread
{
	public void run() throws IllegalMonitorStateException
	{
		//this.notify();
		synchronized(this){
		for(int i=0;i<3;i++)
		{
			System.out.println("loga");
		}
		}
		notifyAll();}
	}
	
public class wait {
	public static void main(String args[])throws IllegalMonitorStateException
	{
	Aaa oa=new Aaa();
	B ob=new B();
	oa.start();
	ob.start();
	}

}
