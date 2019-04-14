package healthcare;

import java.io.BufferedReader;
import java.io.FileReader;
import java.net.*;
import java.util.ArrayList;
import java.util.List;

public class Java_sms_requesthttp {

        public static void main(String[] args) {
        	String message="",PhoneNo="",Name="",gender;
        	int Glucose,Calcium,Cholestrol,Rbc,Wbc,Hemoglobin,Platelet,Sodium,Potassium,Chloride;
        	List<String> detailList = new ArrayList<String>();
    	    List<String> valueList = new ArrayList<String>();
    	    
    	    try(BufferedReader in = new BufferedReader(new FileReader("/home/stoneduser/Desktop/Java/test.txt"))){
    	        String line;
    	        while((line = in.readLine())!=null){
    	            String[] pair = line.split(":");
    	            detailList.add(pair[0]);
    	            valueList.add(pair[1]);
    	        }
    	        gender = valueList.get(1);
//                System.out.println(gender);
    	        Name=valueList.get(0);
    	        PhoneNo=valueList.get(2);
//    	        System.out.println(message);
    	        if(gender.equals("M"))
    	        {
//                  System.out.println("True");
    	          Male m=new Male();
    	          m.readfile();
    	          Glucose = m.glucose();
    	          Calcium = m.calcium();
    	          Cholestrol = m.cholesterol();
    	          Rbc = m.rbc();
    	          Wbc = m.wbc();
    	          Hemoglobin = m.hemoglobin();
    	          Platelet = m.platelets();
    	          Sodium = m.sodium();
    	          Potassium = m.potassium();
    	          Chloride = m.chloride();
    	          if(Glucose==1||Glucose==2)
    	        	  message = message+" Glucose";
    	          if(Calcium==1||Calcium==2)
    	        	  message = message+" Calcium";
    	          if(Cholestrol==1||Cholestrol==2)
    	        	  message = message+" Cholestrol";
    	          if(Rbc==1||Rbc==2)
    	        	  message = message+" Rbc";
    	          if(Wbc==1||Wbc==2)
    	        	  message = message+" Wbc";
    	          if(Hemoglobin==1||Hemoglobin==2)
    	        	  message = message+" Hemoglobin";
    	          if(Platelet==1||Platelet==2)
    	        	  message = message+" Platelet";
    	          if(Sodium==1||Sodium==2)
    	        	  message = message+" Sodium";
    	          if(Potassium==1||Potassium==2)
    	        	  message = message+" Potassium";
    	          if(Chloride==1||Chloride==2)
    	        	  message = message+" Chloride";
    	        }
    	         else if(gender.equals("F"))
    	         {
    	            Female f=new Female();
    	            f.readfile();
    	            Glucose = f.glucose();
    	            Calcium = f.glucose();
    	            Cholestrol = f.cholesterol();
    	            Rbc = f.rbc();
    	            Wbc = f.wbc();
    	            Hemoglobin = f.hemoglobin();
    	            Platelet = f.platelets();
    	            Sodium = f.sodium();
    	            Potassium = f.potassium();
    	            Chloride = f.chloride();
    	            if(Glucose==1||Glucose==2)
    	          	  message = message+" Glucose";
    	            if(Calcium==1||Calcium==2)
    	          	  message = message+" Calcium";
    	            if(Cholestrol==1||Cholestrol==2)
    	          	  message = message+" Cholestrol";
    	            if(Rbc==1||Rbc==2)
    	          	  message = message+" Rbc";
    	            if(Wbc==1||Wbc==2)
    	          	  message = message+" Wbc";
    	            if(Hemoglobin==1||Hemoglobin==2)
    	          	  message = message+" Hemoglobin";
    	            if(Platelet==1||Platelet==2)
    	          	  message = message+" Platelet";
    	            if(Sodium==1||Sodium==2)
    	          	  message = message+" Sodium";
    	            if(Potassium==1||Potassium==2)
    	          	  message = message+" Potassium";
    	            if(Chloride==1||Chloride==2)
    	          	  message = message+" Chloride";
    	         }
    	      }catch(Exception e) {
    	    	  System.out.println("Non");
    	      }
                try {
                        String recipient = PhoneNo;
                        message = "Dear "+Name+" you have critical situation regarding"+message+" Please visit Doctor ASAP!!";
                        String username = "admin";
                        String password = "741852963";
                        String originator = "+919513868175";

                        String requestUrl  = "http://127.0.0.1:9501/api?action=sendmessage&" +
            "username=" + URLEncoder.encode(username, "UTF-8") +
            "&password=" + URLEncoder.encode(password, "UTF-8") +
            "&recipient=" + URLEncoder.encode(recipient, "UTF-8") +
            "&messagetype=SMS:TEXT" +
            "&messagedata=" + URLEncoder.encode(message , "UTF-8") +
            "&originator=" + URLEncoder.encode(originator, "UTF-8") +
            "&serviceprovider=GSMModem1" +
            "&responseformat=html";
                        
//                        System.out.println(requestUrl);
//                        System.out.println(message);



                        URL url = new URL(requestUrl);
                        HttpURLConnection uc = (HttpURLConnection)url.openConnection();

                        System.out.println(uc.getResponseMessage());

                        uc.disconnect();

                } catch(Exception ex) {
                        System.out.println(ex.getMessage());

                }
        }

}