package loga;
public class ObjectEx  {
	
	public int hashCode() {
		return 123;
	}
	public boolean equals(ObjectEx o) {
		if(o.hashCode()==hashCode()) {
			return true;
		}
		else
			return false;
		
	}
	

    public static void main(String[] args) {
    ObjectEx obj1=new ObjectEx();
    ObjectEx obj2=new ObjectEx();

    System.out.println(obj1);
    System.out.println(obj2);
    
    System.out.println(obj1.hashCode());
    System.out.println(obj2.hashCode());
    System.out.println(Integer.toHexString(obj1.hashCode()));
    
    System.out.println(obj1.toString());
    
    System.out.println(obj1.getClass());
    
    System.out.println(obj1.equals(obj2));
    
    String s1= new String("java");
    String s2=new String("java");
    
    System.out.println(s1.hashCode());
    System.out.println(s2.hashCode());
    
    s1.equals(s2);

	}

}
