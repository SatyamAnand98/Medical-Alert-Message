package healthcare;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Read_File {
	String message="",PhoneNo="",Name="",gender="";
	double Glucose,Calcium,Cholestrol,Rbc,Wbc,Hemoglobin,Platelet,Sodium,Potassium,Chloride;
	List<String> detailList = new ArrayList<String>();
	List<String> valueList = new ArrayList<String>();
	Double val;
	Read_File(){
		Scanner scan= new Scanner(System.in);
		String name = scan.nextLine();
		scan.close();
		try(BufferedReader in = new BufferedReader(new FileReader("/home/stoneduser/eclipse-workspace/Java-SMS-Application-HTTP/src/healthcare/test_names/"+name+".txt"))){
			String line;
			while((line = in.readLine())!=null){
				String[] pair = line.split(":");
				detailList.add(pair[0]);
				valueList.add(pair[1]);
			}
			for(int i=0;i<detailList.size();i++) {
				if(detailList.get(i).equals("Name"))
					Name = valueList.get(i);
				if(detailList.get(i).equals("Gender"))
					gender = valueList.get(i);
				if(detailList.get(i).equals("Phone"))
					PhoneNo=valueList.get(i);
			}
		}catch(Exception e) {
			System.out.println(e);
		}
	}
}
