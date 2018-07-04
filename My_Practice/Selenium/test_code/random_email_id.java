package test_code;

import java.util.Random;

public class random_email_id {
	public String getSaltString() {
        String SALTCHARS = "ABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890";
        StringBuilder salt = new StringBuilder();
        Random rnd = new Random();
        while (salt.length() < 10) { // length of the random string.
            int index = (int) (rnd.nextFloat() * SALTCHARS.length());
            salt.append(SALTCHARS.charAt(index));
        }
        String str1= "@gmail.com";;
		String saltStr = salt.toString() + str1;
       
        saltStr.concat(str1);
        return saltStr;

    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		random_email_id t=new random_email_id();
		System.out.println(t.getSaltString());
	}

}
