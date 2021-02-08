import java.util.ArrayList;

public class Assignment4Q4 {
    public ArrayList<String> removeOddLength(ArrayList<String> employeeList){
    	
    	 employeeList.removeIf(n -> (n.length()%2!= 0));
		return employeeList;
		
    }
    public static void main(String[] args) 
    {
    	
    	Assignment4Q4 assign=new Assignment4Q4();
    	ArrayList<String> employ= new ArrayList<>();
    	ArrayList<String> employ1= new ArrayList<>();
    	employ.add("Abhishek");
    	employ.add("kandil");
    	employ.add("Pawan");
    	employ.add("Supriya");
    	employ1=assign.removeOddLength(employ);
    	for(String s:employ1) {
    		System.out.println(s);
    	}
    	
    }
}