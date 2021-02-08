import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Assignment4Q6 {
   
    public List<String> convertToUpperCase(List<String> list) {
    	
    	
    	
   	      list.replaceAll(n -> (n.toUpperCase()));

    	
		return list;
		}  
    
    public static void main(String[] args)
    {
    	List<String> list = Arrays.asList("alpha", "bravo", "charlie", "delta", "echo", "foxtrot");
    	List <String> list1 = new ArrayList();
    	
    	Assignment4Q6 assign=new Assignment4Q6();
    	list1=assign.convertToUpperCase(list);
        for(String s:list1)
        {
        	System.out.println(s);
        }
    	
    	

    	
    	
    	
    }
}