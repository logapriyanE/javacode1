package hari;
import java.util.*;
import java.io.*;
public class FileEx {
    public static void main(String[] args) throws IOException {
	try(Scanner sc=new Scanner(System.in))	{
		File file=new File("C:\\Users\\elcot\\Desktop\\File\\file.txt");
		
	
		System.out.println(file.canRead());
		file.createNewFile();
		FileWriter w=new FileWriter(file);
		w.write("java");
		w.write(" program");
		w.append(" lang");
		w.close();
		//FileReader r=new FileReader(file);
		File file2=new File("C:\\Users\\elcot\\Desktop\\File\\file.txt");
		Scanner ss=new Scanner (file2);
		while(ss.hasNext()) {
			System.out.println(ss.next());
		}
		ss.close();
        file.delete();
        
	   System.out.println(file2.delete()); ;
		System.out.println(file.delete());
		System.out.println(file.canRead());
		
	}
   
	}

}
