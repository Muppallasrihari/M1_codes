import java.util.Scanner;

public class Activity {
	static String string1;
	static String string2;
	String operator;
	

	public Activity(String string1, String string2, String operator) {
		
		this.string1 = string1;
		this.string2 = string2;
		this.operator = operator;
	}
 public static class Source{
	
	 public String handleException(Activity a) {
		 
		 try {
			 if(a.string1.length()==0 || a.string2.length()==0) {
				throw new NullPointerException("Null values Found");
			 }
			 else {
				 System.out.println("No Exception found");
			 }}
			 catch(NullPointerException e) {
				 System.out.println(e.getMessage());
			 }
		 try {
			 if(a.operator!="+" && a.operator!="-") {
				 throw new Exception("Invalid operator");
			 }
			 else {
				 System.out.println("No Exception found");
			 }}
			 catch(Exception e) {
				 System.out.println(e.getMessage());
			 }
		 
		return null;
		 
	 
 }
		 public String doOperation(Activity a) {
			 int i=0;
			 if(a.operator=="+") {
				 i=1;
			 
			 }
			 if(a.operator=="-") {
				 i=2;
			 }
			 switch(i) {
			 case 1:
				 System.out.println(a.string1 + a.string2);
				 break;
			 
			 case 2:
			       System.out.println(a.string1.replace(a.string2,""));	
			       break;
			 
			 }
			return null;
			 }
		
		 }

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
     Source s=new Source(); 
      Activity a = new Activity("helloworld" , "world","-");
      s.handleException(a);
      s. doOperation(a);
      
       
	}

}
