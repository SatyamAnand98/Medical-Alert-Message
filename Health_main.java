package healthcare;
import java.util.*;
import java.io.BufferedReader;
import java.io.FileReader;
public class Health_main {
	public static void main(String[] args) {

	    List<String> detailList = new ArrayList<String>();
	    List<String> valueList = new ArrayList<String>();
	    
	    try(BufferedReader in = new BufferedReader(new FileReader("/home/stoneduser/Desktop/Java/test.txt"))){
	        String line;
	        while((line = in.readLine())!=null){
	            String[] pair = line.split(":");
	            detailList.add(pair[0]);
	            valueList.add(pair[1]);
	        }
	        String Name=valueList.get(0);
	        String PhoneNo=valueList.get(2);
	        String message="Dear "+Name+" You are truly a piece of SHIT and hope that you get HIV positive\nBy the way I've you phone number "+PhoneNo+" and your report will be sent to you as SMS\n Have a NICE DAY :)";
	        System.out.println(message);
	        

	        
	      }catch(Exception e) {
	    	  System.out.println("Non");
	    	  
	    	  
	    	  
	    	  
	    	  
	    	  
	      }
	}
}
