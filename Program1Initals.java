/*Hunter Patterson
 * COSC 1337 001
 * 9/22/2021
 * Purpose: To create a loop that allows you to pass in different first middle and last names and get information back.  (Program 01: Initials)
 * Insight: In this program I learned how to do .indexOf and randoms. 
*/

package initals;

import java.util.Random;

public class Program1Initals {

	public static void main(String[] args) {

		String[] strings = {"David Lee Alger", "Kate Garry Hudson", "Tina Stamatina Fey", "Hugh Mungo Grant","Uma Karuna Thurman"};
		
		for (int i=0;i<strings.length;i++) {
			String currentName = strings[i];
		
			String firstName = currentName.substring(0, currentName.indexOf(" "));
			System.out.println("Your first name is "+firstName+" with a length of: "+firstName.length());
			String middleName = currentName.substring(currentName.indexOf(" ") +1, currentName.lastIndexOf(" "));
			System.out.println("Your middle name is "+middleName+" with a length of: "+middleName.length());
			String lastName = currentName.substring(currentName.lastIndexOf(" ")+1);
			System.out.println("Your last name is "+lastName+" with a length of: "+lastName.length());
		
			char firstIntial = currentName.charAt(0);
			char middleInital = middleName.charAt(0);
			char lastInital = lastName.charAt(0);
			System.out.println("Your initals are "+firstIntial+middleInital+lastInital+". The length of your entire name is "+currentName.length());
		
			Random random = new Random();
			int random1 = random.nextInt(currentName.length()-4);
			int random2 = random1+5;
			String randomSequence = currentName.substring(random1, random2);
			System.out.println("A random sequence of 5 letters in your name is: "+randomSequence);
		
			System.out.println();
			System.out.println();
		

	}

}
}
