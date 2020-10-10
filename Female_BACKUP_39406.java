<<<<<<< HEAD
package healthcare;

=======
package com.amazonaws.quickstart;
>>>>>>> a6ac04c3868d12edf4976b4c781547e65f806875

public class Female {
	public Female(Read_File rd){    	
			for(int i=0;i<rd.detailList.size();i++) {
				String data = rd.detailList.get(i);
				try {
					rd.val=Double.parseDouble(rd.valueList.get(i));
				}
				catch(Exception e) {}
				switch(data) {
				case "Glucose":
					if(rd.val<100.0)
						rd.message = rd.message+"\nGlucose is Low @ "+rd.val;
		            else if(rd.val>125.0)
		            	rd.message = rd.message+"\nGlucose is High @ "+rd.val;
					break;
				case "Calcium":
					if(rd.val<8.6)
		                rd.message = rd.message+"\nCalcium is Low @ "+rd.val;
		            else if(rd.val>10.2)
		            	rd.message = rd.message+"\nCalcium is High @ "+rd.val;
					break;
				case "Cholestrol":
					if(rd.val<200)
		                rd.message = rd.message+"\nCholestrol is Low @ "+rd.val;
		            else if(rd.val>239)
		            	rd.message = rd.message+"\nCholestrol is High @ "+rd.val;
					break;
				case "RBC":
					if(rd.val<4.1)
		                rd.message = rd.message+"\nRBC is Low @ "+rd.val;
		            else if(rd.val>5.1)
		            	rd.message = rd.message+"\nRBC is High @ "+rd.val;
					break;
				case "WBC":
					if(rd.val<4500)
		                rd.message = rd.message+"\nWBC is Low @ "+rd.val;
		            else if(rd.val>10000)
		            	rd.message = rd.message+"\nWBC is High @ "+rd.val;
					break;
				case "Hemoglobin":
					if(rd.val<12.3)
		                rd.message = rd.message+"\nHemoglobin is Low @ "+rd.val;
		            else if(rd.val>15.3)
		            	rd.message = rd.message+"\nHemoglobin is High @ "+rd.val;
					break;
				case "Platelets":
					if(rd.val<150000)
		                rd.message = rd.message+"\nPlatelets is Low @ "+rd.val;
		            else if(rd.val>450000)
		            	rd.message = rd.message+"\nPlatelets is High @ "+rd.val;
					break;
				case "Chloride":
					if(rd.val<97)
		                rd.message = rd.message+"\nChloride is Low @ "+rd.val;
		            else if(rd.val>107.0)
		            	rd.message = rd.message+"\nChloride is High @ "+rd.val;
					break;
				case "Sodium":
					if(rd.val<135.0)
		                rd.message = rd.message+"\nSodium is Low @ "+rd.val;
		            else if(rd.val>145.0)
		            	rd.message = rd.message+"\nSodium is High @ "+rd.val;
					break;
				case "Potassium":
					if(rd.val<3.5)
		                rd.message = rd.message+"\nPotassium is Low @ "+rd.val;
		            else if(rd.val>5.0)
		            	rd.message = rd.message+"\nPotassium is High @ "+rd.val;
					break;
				}
			}
			if(rd.message.equals(""))
				rd.message = "Dear,\n"+rd.Name+"\nEverything is normal";
			else
				rd.message = "Dear,\n"+rd.Name+"\nyou have a situation "+rd.message+"\nPlease visit Doctor ASAP!!";
			System.out.println(rd.message);
		}
		
<<<<<<< HEAD
	}
=======
	}
>>>>>>> a6ac04c3868d12edf4976b4c781547e65f806875
