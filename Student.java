public class Student {
	
	private String name;
	private int year;
	private double GPA;
	
	//�Ű����� ���� ������
	public Student(){
		name="";
		year=0;
		GPA=0.0;
	}

	public Student(String n,int y, double g){
		name=n;
		year=y;
		GPA=g;
	}
	
	@Override
	public String toString() {
		return name+"-"+year+"-"+GPA;
	}

}