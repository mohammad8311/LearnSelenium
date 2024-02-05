package testCases;

public class basicJava {

	public static void main(String[] args) {
		
		String[] arrName = {"Mohammad", "Didarul", "Alam", "LEADS", "Employee"};
		
		for (int i=0; i<arrName.length; i++)
		{
			System.out.println(arrName[i]);
		}
		
		for (String s: arrName)
		{
			System.out.println(s);
		}

	}

}
