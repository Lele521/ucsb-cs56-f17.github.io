import java.util.ArrayList;

public class Answer {

	public static void main(String [] args) throws Exception {

		ArrayList<Student> slist = Student.initFile(args[0]);
		slist.sort( (s1, s2) -> Double.compare(s1.getGPA(), s2.getGPA()) );
		for (Student s: slist) {
			System.out.println( s.getGPA() + "," + s.getPerm() );
		}
	}
}



	
