package com.commarce.commarce;
import com.commarce.commarce.dio.StudentDIO;
import com.commarce.commarce.entity.Student;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.boot.CommandLineRunner;

import java.util.List;
import java.util.Scanner;

@SpringBootApplication(
		scanBasePackages = {"com.commarce.commarce", "util"})
	public class CommarceApplication {

	static void main(String[] args) {
		SpringApplication.run(CommarceApplication.class, args);
	}

	// This is Custom Code
	@Bean
	public CommandLineRunner commandLineRunner(StudentDIO studentDIO) {

		return _ -> {

			// this creates single entry
			//createStudent(studentDIO);

			//this creates multiple entry
			//createMultiStudent(studentDIO);

			//search students
			//searchStudent(studentDIO);
			
			//Database Query

			//queryForStudent(studentDIO);

			//queryForStudentLastName(studentDIO);

			//updateStudent(studentDIO);

			deleteStudent(studentDIO);
		};
	}

	private void deleteStudent(StudentDIO studentDIO) {
		int studentId = 6;
		System.out.println("Deleting student with id " + studentId);
		studentDIO.delete(studentId);
	}

	private void updateStudent(StudentDIO studentDIO) {
		//retrieve student based on the id: primary key
		int  studentId = 1;
		System.out.println("Getting with id " + studentId);
		Student myStudent = studentDIO.findById(studentId);

		//chang first name and last Name
		myStudent.setFirstName("aaa");
		myStudent.setLastName("bbb");

		studentDIO.save(myStudent);

		System.out.println("Saving student with id " + studentId);
	}

	private void queryForStudentLastName(StudentDIO studentDIO) {
		// Gat a List Of Students
		List<Student> theStudents = studentDIO.findByLastName("Siddique");

		// Display List Of Students
		for (Student student : theStudents) {
			System.out.println("First Name: " + student.getFirstName() + " | Last Name: " + student.getLastName() + " | Email: " + student.getEmail());
		}
	}

	private void queryForStudent(StudentDIO studentDIO) {
		//get list of student
		List<Student> theStudents = studentDIO.findAll();

		//display list of student
		for (Student student : theStudents) {
			System.out.println(student);
		}
	}

	private void searchStudent(StudentDIO studentDIO) {
		//create student object
		Student tempStudent = new Student("Sad Bin", "Siddique", "sadbinsiddique@gmail.com" );
		studentDIO.save(tempStudent);
		System.out.println("Generated id: " + tempStudent.getId());

		int theId = tempStudent.getId();
		Student result = studentDIO.findById(theId);

		//retrieve student base on the id: primary key
		System.out.println("Found the student: " + result);
		//display student
	}

	private void createMultiStudent(StudentDIO studentDIO) {
		//create Multiple Student
		System.out.println("Creating Multiple Student");

		//creating Scanner as object
		Scanner dataScanner = new Scanner(System.in);
		System.out.println("Enter How Many student you want to create ?");
		System.out.print("> ");
		int studentCount = dataScanner.nextInt();

		System.out.println("\n".repeat(50));
		for (int i = 0 ; i < studentCount; i++) {

			System.out.println("Enter First Name of Student's of " + (i+1));
			System.out.print("> ");
			String firstName = dataScanner.next();

			System.out.println("\n".repeat(50));


			System.out.println("Enter Last Name of Student's of " + (i+1));
			System.out.print("> ");
			String lastName = dataScanner.next();

			System.out.println("\n".repeat(50));

			System.out.println("Enter Email of Student's of " + (i+1));
			System.out.print("> ");
			String email = dataScanner.next();

			System.out.println("\n".repeat(50));


			// create the student Object
			System.out.println("Creating Student Object");
			Student tempStudent = new Student(firstName, lastName, email);
			// save the student object
			System.out.println("Saving Student");
			studentDIO.save(tempStudent);
			// display id of the saved student
			System.out.println("Saved Student. Generated id: " + tempStudent.getId());
		}


		//save the student

	}

	private void createStudent(StudentDIO studentDIO) {
		// create the student Object
		System.out.println("Creating Student Object");
		Student tempStudent = new Student("Sad Bin", "Siddique", "sadbinsiddique@gmail.com" );
		// save the student object
		System.out.println("Saving Student");
		studentDIO.save(tempStudent);
		// display id of the saved student
		System.out.println("Saved Student. Generated id: " + tempStudent.getId());

	}

}
