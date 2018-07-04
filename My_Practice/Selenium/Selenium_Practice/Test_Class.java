package Selenium_Practice;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Test_Class {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DateFormat dateFormat2 = new SimpleDateFormat("dd"); 
        Date date2 = new Date();

        String today = dateFormat2.format(date2); 
        System.out.println(today);

	}

}
