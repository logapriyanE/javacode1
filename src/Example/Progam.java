package Example;
class a{
	void add() {
		System.out.println("hi loga");
	}
static	void add1() {
		System.out.println("hi loga----1");
	}
}
public class Progam extends a{
	public Progam(int i) {
		System.out.println("hi hari "+i);
	}
	void add() {
		super.add();
		System.out.println("sathis");
	}
	static	void add1() {
		System.out.println("hi loga----2");
	}

	public static void main(String[] args) {
		Progam ob=new Progam(4);
		ob.add();
        a obc=new Progam(7);
        obc.add1();
	}

}
