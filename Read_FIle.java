package healthcare;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;


public class Read_FIle {
	String message="",PhoneNo="",Name="",gender="";
	double Glucose,Calcium,Cholestrol,Rbc,Wbc,Hemoglobin,Platelet,Sodium,Potassium,Chloride;
	List<String> detailList = new ArrayList<String>();
	List<String> valueList = new ArrayList<String>();
	public Read_FIle(){    	
		try(BufferedReader in = new BufferedReader(new FileReader("/home/stoneduser/Desktop/Java/test.txt"))){
			String line;
			while((line = in.readLine())!=null){
				String[] pair = line.split(":");
				detailList.add(pair[0]);
				valueList.add(pair[1]);
			}
			gender = valueList.get(1);
			Name=valueList.get(0);
			PhoneNo=valueList.get(2);
			if(gender.equals("M"))
			{
					Male m=new Male();
					m.readfile();
					Glucose = m.glucose();
					Calcium = m.calcium();
					Cholestrol = m.cholesterol();
					Rbc = m.rbc();
					Wbc = m.wbc();
					Hemoglobin = m.hemoglobin();
					Platelet =	 m.platelets();
					Sodium = m.sodium();
					Potassium = m.potassium();
					Chloride = m.chloride();
					if(Glucose!=0)
						message = message+"\nGlucose is critical @ "+Glucose;
					if(Calcium!=0)
						message = message+"\nCalcium is critical @ "+Calcium;
					if(Cholestrol!=0)
						message = message+"\nCholestrol is critical @ "+Cholestrol;
					if(Rbc!=0)
						message = message+"\nRbc is critical @ "+Rbc;
					if(Wbc!=0)
						message = message+"\nWbc is critical @ "+Wbc;
					if(Hemoglobin!=0)
						message = message+"\nHemoglobin is cricat @ "+Hemoglobin;
					if(Platelet!=0)
						message = message+"\nPlatelet is critical @ "+Platelet;
					if(Sodium!=0)
						message = message+"\nSodium is critical @ "+Sodium;
					if(Potassium!=0)
						message = message+"\nPotassium is critical @ "+Potassium;
					if(Chloride!=0)
						message = message+"\nChloride is critical @ "+Chloride;
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
	}
}
    