import java.util.ArrayList;

public class Student {

	private int perm;
	private double gpa;
	public Student(int perm, double gpa) {
		this.perm = perm;
		this.gpa = gpa;
	}

	public int getPerm() { return this.perm; }
	public double getGPA() { return this.gpa; }

	public static ArrayList<Student> initFile(String filename) throws Exception {

		ArrayList<Student> r = new ArrayList<Student>();

		r.add(new Student(12345,4.0));
		r.add(new Student(22222,4.0));
		r.add(new Student(54321,3.7));
		r.add(new Student(999999,1.0));

		return r;

	}
	
}
