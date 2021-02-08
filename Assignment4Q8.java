import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class Assignment4Q8 {
	
	public static void main(String [] args)
	{
		List<Integer> list = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
		 new Thread(new Runnable() 
	        { 
	            @Override
	            public void run() 
	            { 
	            	Consumer<List<Integer> > 
	                dispList = list -> list.stream().forEach(a -> System.out.print(a + " "));
	                dispList.accept(list); 
	            } 
	        }).start();
	}

}
