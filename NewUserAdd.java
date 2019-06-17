package test1;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;

public class NewUserAdd {
	
	boolean addUserToFile(String fname, String lname, String email, String phone, String username, String password) {
		
		String s = fname+"|"+lname+"|"+email+"|"+phone+"|"+username+"|"+password+"\n";
		File fusers = new File("Users.txt");
		try {
			FileWriter fw = new FileWriter(fusers,true);
			BufferedWriter bw = new BufferedWriter(fw);
			bw.write(s);
			bw.close();
			fw.close();
			return true;
		} catch(Exception e) {
			System.out.println("Filed to write to file: "+e);
		}
		return false;
		
	}

}
