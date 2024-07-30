/*		Programmer:		Viraj Patel
		Date:			August 26, 2016
		Project:		Student
		FileName:		Student.java
		Program Description: This class defines the fields and methods of the Student Class.

*/



public class Student
{
	private String firstName;
	private String lastName;
	private int gradeLevel;
	private double gpa;

	//The calculateGpa() method

	public void calculateGpa(int points, int credits)
	{
		gpa = (double) points / credits;
	}

	// constructor

	public Student (String first, String last, int grade)
	{
		firstName = first;
		lastName = last;
		gradeLevel = grade;
		gpa = 4.0;
	}

	// accessor methods

	public String getFirstName()
	{
		return firstName;
	}

	public String getLastName()
	{
		return lastName;
	}

	public int getGradeLevel()
	{
		return gradeLevel;
	}

	public double getGPA()
	{
		return gpa;
	}





	// mutator method
	// add code to calculate a student's GPA


} // end of Student class
