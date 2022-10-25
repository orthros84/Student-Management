package studentManagement;

import java.util.Scanner;

public class StudentManagement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		System.out.print("Entere number of new students to enroll: ");
		Scanner in = new Scanner(System.in);
		int numOfStudents = in.nextInt();
		Student[] students = new Student[numOfStudents]; 
		
		for(int n = 0 ; n < numOfStudents ; n++) {
			students[n] = new Student();
			students[n].enroll();
			students[n].payTuition();
			System.out.println(students[n].toString());
		}
		

	}

}
 