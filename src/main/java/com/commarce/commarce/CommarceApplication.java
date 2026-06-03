package com.commarce.commarce;
import com.commarce.commarce.dio.StudentDIO;
import com.commarce.commarce.entity.Student;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.boot.CommandLineRunner;
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
			
			//createStudent(studentDIO);
			createMultiStudent(studentDIO);
		};
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
