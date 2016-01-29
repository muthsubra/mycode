package day1;

public class StringMethods {

	public static void main(String[]args){
		//String Method - length()
		/*String palindrome = "Tomorrow never dies";
		int len = palindrome.length();
		System.out.println("String length is :" +len );*/

		/*//String Method - substring()
		String Str = new String("Welcome to America");

	      System.out.print("Return Value :" );
	      System.out.println(Str.substring(10) );

	      System.out.print("Return Value :" );
	      System.out.println(Str.substring(10, 20) );

    //String Method - split()
	      String Str = new String("Welcome to America");

	      System.out.println("Return Value :" );
	      for (String retval: Str.split("-", 2)){
	         System.out.println(retval);
	      }
	      System.out.println("");
	      System.out.println("Return Value :" );
	      for (String retval: Str.split("-", 3)){
	         System.out.println(retval);
	 //Reverse String
	         String string="abcdef";
	         String reverse = new StringBuffer(string).
	         reverse().toString();
	         System.out.println("\nString before reverse:"+string);
	         System.out.println("String after reverse:"+reverse);
	 //String Buffer
	         StringBuffer a = new StringBuffer("Java Code is fun");
	         System.out.println(a.reverse());*/


		//Replace()
		String Rplace = new String("Bayamp");
		System.out.println("Return Value:");
		System.out.println(Rplace.replace('y', 'T'));

		//ReplaceAll()
		String RplaceAll = new String("Welcome to Baymap");
		System.out.println("Return Value:");
		System.out.println(RplaceAll.replaceAll("(.*)to(.*)","Santa Clara" ));

		//CharAt()
		String h = new String("Bayamp Technologies");
		char result = h.charAt(5);
		System.out.println(result);
		
	}
}
