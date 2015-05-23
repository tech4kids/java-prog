package lastword_p;

public class LastLength {

    public int lengthOfLastWord(String s) {
    	
    	int mycount=0;
    	
    	if (s.length() == 0) 
    		return mycount;
            
            
    	int len;
    	len=s.length()-1;
    	while (len >= 0 && s.charAt(len) != ' '){
        	   mycount++;
        	   len--;
        }
                   
           return mycount;
           
                      
       }

}

