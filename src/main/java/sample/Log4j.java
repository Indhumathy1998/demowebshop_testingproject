package sample;

import org.apache.log4j.Appender;
import org.apache.log4j.FileAppender;
import org.apache.log4j.Layout;
import org.apache.log4j.Logger;
import org.apache.log4j.SimpleLayout;

public class Log4j{
	static Logger l = Logger.getLogger(Log4j.class.getName());
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Layout l1 = new SimpleLayout(); 
		Appender a; 
		  try 

		  { 

		  a = new FileAppender(l1,"mylog.txt", false); 

		  l.addAppender(a); 

		  } 

		  catch(Exception e) {}	   
		
		
		l.info("testcase1 registration executed successfullyy...");
		l.fatal("system displays invalid credentials-ERROR MESSAGE");
		l.info("testcase2 add to cart executed successfullyy...");
		l.info("testcase3 search executed successfullyy...");
		l.fatal("system displays invalid product-ERROR MESSAGE");
		l.fatal("system displays Please enter some search keyword-ERROR MESSAGE");
		l.info("testcase4 checkout executed successfullyy...");
		l.info("testcase5 wishlist executed successfullyy...");

		System.out.println("Your logic executed successfully....");
	}

}