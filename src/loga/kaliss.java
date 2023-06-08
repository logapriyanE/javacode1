package loga;

import java.util.*;
import java.util.Collections;



class ProductDetails implements Comparable<ProductDetails>

{
	int id;
	String des;
	long prices;
	String name;
	ProductDetails(int id,String des, long prices,String name)
	
	{
		this.id=id;
		this.des=des;
		this.prices=prices;
		this.name=name;
	}
	public String toString()
	{
		return id+" : "+des+" : "+prices+" : "+name;
	 }
	
	public int compareTo(ProductDetails p)
	
	{ Integer i1=Integer.valueOf(id);
	Integer i2=Integer.valueOf(p.id);
	return i1.compareTo(i2);
	
	}
}
class OrderDetails implements Comparable<OrderDetails>

{
	int id;
	String des;
	long prices;
	String name;
	OrderDetails(int id,String des, long prices,String name)
	
	{
		this.id=id;
		this.des=des;
		this.prices=prices;
		this.name=name;
	}
	public String toString()
	{
		return id+" : "+des+" : "+prices+" : "+name;
	 }
	
	public int compareTo(OrderDetails p)
	
	{ Integer i1=Integer.valueOf(id);
	Integer i2=Integer.valueOf(p.id);
	return i1.compareTo(i2);
	
	}
}
public class kaliss {

	public static void main(String[] args) {
		Scanner aa=new Scanner(System.in);
		System.out.println("enter the id");
		int b=aa.nextInt();
		ArrayList <ProductDetails> product=new ArrayList<>();
		ProductDetails p1=new ProductDetails(10,"Smart phone low prices ",15000,"redmi");
		ProductDetails p2=new ProductDetails(70,"curved display ",25000,"one plus");
		ProductDetails p3=new ProductDetails(80,"smart Looking",35000,"Samusung");
		ProductDetails p4=new ProductDetails(110,"iphone ",655000,"apple");
		product.add(p1);product.add(p2);product.add(p3);product.add(p4);
		ArrayList <OrderDetails> order =new ArrayList<>();
		OrderDetails o1=new OrderDetails(70,"Smart phone low prices ",15000,"real me");
		OrderDetails o2=new OrderDetails(50,"Smart phone low prices ",25000,"one puls");
		OrderDetails o3=new OrderDetails(20,"Smart phone low prices ",35000,"Samsung");
		OrderDetails o4=new OrderDetails(10,"Smart phone low prices ",45000,"apple mac");
		order.add(o1); order.add(o2); order.add(o3); order.add(o4);
Collections.sort(product);
Collections.sort(order);

for(int i=0; i<=product.size()-1;i++)
{
	//for(int j=0; j<=order.size()-1;j++)
	
	
	if(product.get(i).id==b) {
		System.out.println(product.get(i)+"-- \n ");
	
	
	}

	}
System.out.println("-------displayed above equal id product adn order details------");
	}
}
