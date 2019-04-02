
public class Student 
{
	private String name;
	private int gradeLevel;
	private int phoneNumber;
	private int gradYear;
	
	public Student(String name, int gradeLevel, int phoneNumber, int gradYear)
	{
		String student_name = name;
		int student_gradeLevel = gradeLevel;
		int student_phoneNumber = phoneNumber;
		int student_gradYear = gradYear;
		int student_nextGrade = gradeLevel +1;
		
	}
	public String getName(String str1)
	{
		name = str1;
		return name;
	}
	public int getgradeLevel(int int1)
	{
		gradeLevel = int1;
		return gradeLevel;
	}
	public int getphoneNumber(int int2)
	{
		phoneNumber = int2;
		return phoneNumber;
	}
	public int getgradYear(int int3)
	{
		gradYear = int3;
		return gradYear;
	}
	public int nextGrade(int int4)
	{
		gradeLevel++;
		return gradeLevel;
	}
	public void setphoneNumber(int int5)
	{
		phoneNumber = int5;
	}
}
