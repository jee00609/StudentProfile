import java.util.*;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner s = new Scanner(System.in);
		System.out.println("�л���:");
		int n = s.nextInt();
		String name;
		int year;
		double GPA;
		
		Student st[] = new Student[n];
		
		for(int i=0; i<n;i++) {
			System.out.println("�̸�");
			name=s.next();
			System.out.println("�г�");
			year=s.nextInt();
			System.out.println("����");
			GPA=s.nextDouble();
			
			st[i]= new Student(name,year,GPA);
		}
		
		for(int i=0;i<n;i++) {
			System.out.println(st[i]);
		}

	}

}