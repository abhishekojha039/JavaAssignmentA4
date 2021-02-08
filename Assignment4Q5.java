import java.util.Arrays;
import java.util.List;

public class Assignment4Q5 {
    static List<String> list = Arrays.asList("alpha", "bravo", "charlie", "delta", "echo", "foxtrot");



    public static String processWords(List<String> list) {
    	
    	String str="";
    	
    	for(String s:list)
    	{
    		str=str+s.charAt(0);
    	}
    	
		return str;
		}
    
    public static void main(String[] args) {
    	
    	
    	  
    	  System.out.println(processWords(list));
    }
    
    
      
      
      
}
