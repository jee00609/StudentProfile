import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.*;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		PrintWriter writer = null;
		try {
			writer = new PrintWriter("text.txt");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Scanner s = new Scanner(System.in);
		System.out.println("학생수:");
		int n = s.nextInt();
		
		String name;
		int year;
		double GPA;
		
		Student st[] = new Student[n];
		
		for(int i=0; i<n;i++) {
			System.out.println("이름");
			name=s.next();
			System.out.println("학년");
			year=s.nextInt();
			System.out.println("평점");
			GPA=s.nextDouble();
			
			st[i]= new Student(name,year,GPA);
		}
		
		for(int i=0;i<n;i++) {
			//System.out.println(st[i]);
			writer.println(st[i]);
			
		}
		
		writer.close();

	}

}
