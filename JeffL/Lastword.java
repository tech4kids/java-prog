package lastword_p;

public class Lastword {

	public static void main(String[] args) {
		

		int lastwordlength;
		LastLength l=new LastLength();
		
	    //test regular string
		lastwordlength=l.lengthOfLastWord("hello world123");
		
	    //test empty string	
		//lastwordlength=l.lengthOfLastWord(" ");
		//lastwordlength=l.lengthOfLastWord("");
		
	
		System.out.println("The last word length is "+lastwordlength);


	}

}  
