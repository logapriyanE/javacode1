package loga;
import java.util.*;

class Purchase implements Comparable<Purchase>
{	String id;
	String brand;
	String model;
	String year;
	public Purchase(String id,String brand,String model,String year) {
		this.id=id;
		this.brand=brand;
		this.model=model;
		this.year=year;
	}
	public String toString() 
	{return "Id:"+id+"- Brand:"+brand+"- Model:"+model+"- Year:"+year;}

	public int compareTo(Purchase o) {
		Integer i=Integer.valueOf(o.id);
		Integer i1=Integer.valueOf(id);
		return i1.compareTo(i);
	}
	public void iterator(String sc1) {
		List l=new ArrayList();
		l.add(id);
		l.add(brand);
		l.add(model);
		l.add(year);
		for(int i=0;i<l.size();i++)
			if(l.get(i).equals(sc1)) 
			{System.out.println("Id:"+l.get(0)+"- Brand:"+l.get(1)+"- Model:"+l.get(2)+"- Year:"+l.get(3));}
	}
}

public class compertask {

	public static void main(String[] args) {
		List<Purchase>p=new ArrayList<>();
		p.add(new Purchase("09","iphone","6s","2020"));
		p.add(new Purchase("14","samsung","20ultra","2021"));
		p.add(new Purchase("02","moto","6g","2022"));
		p.add(new Purchase("11","oneplus","9t","2023"));
		p.add(new Purchase("08","oppo","22y","2021"));
		p.add(new Purchase("05","iphone","7","2022"));
		p.add(new Purchase("06","nokia","8e","2021"));
		p.add(new Purchase("04","iphone","8s","2020"));
		p.add(new Purchase("07","samsung","22s","2022"));
		p.add(new Purchase("12","moto","4g","2020"));
		p.add(new Purchase("01","oneplus","7t","2021"));
		p.add(new Purchase("03","oppo","18e","2021"));
		p.add(new Purchase("13","iphone","11","2023"));
		p.add(new Purchase("10","nokia","10","2022"));
		System.out.println("PRODUCTS AVAILABLE");
		Collections.sort(p);
		Iterator<Purchase>i=p.iterator();
		while(i.hasNext()){System.out.println(i.next());}
		System.out.println("------------------------------------");
        Scanner s1=new Scanner(System.in);
        System.out.print("Search the product by Id,Brand,Model,Year: ");
        String sc1=s1.next();
        for(int j=0;j<p.size();j++)
        {p.get(j).iterator(sc1);}
        s1.close();
	}

}
