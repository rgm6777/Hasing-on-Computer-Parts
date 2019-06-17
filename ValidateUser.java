package test1;

import java.io.File;
import java.util.Scanner;

public class ValidateUser {
	@SuppressWarnings("resource")
	boolean isUserValid(String username, String password) {
		File fusers = new File("Users.txt");
		Scanner sc;
		String l[];
		try {
			sc = new Scanner(fusers);
			while(sc.hasNextLine()) {
				l=sc.nextLine().split("[|]");
				if(l[4].equals(username) && l[5].equals(password))
					return true;
			}
			sc.close();
		}catch(Exception e) {
			System.out.println("Error: "+e);
		}
		return false;
	}
}
