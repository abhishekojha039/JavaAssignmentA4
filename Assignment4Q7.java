import java.util.HashMap;

public class Assignment4Q7 {
	
	public String convertKeyValueToString(HashMap<String,Integer> map) {
		
		
		return ""+map.entrySet();
		}
	
	public static void main(String [] args)
	{
		
		Assignment4Q7 assign=new Assignment4Q7();
		HashMap<String, Integer> hash_map = new HashMap<String, Integer>(); 
		  
       
        hash_map.put("One",1); 
        hash_map.put("Two",2); 
        hash_map.put("Three",3); 
        hash_map.put("Four",4); 
        hash_map.put("Fifth",5); 
        
        System.out.println(assign.convertKeyValueToString(hash_map));
        
	}

}
