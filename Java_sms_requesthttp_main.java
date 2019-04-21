package healthcare;

@SuppressWarnings("serial")
public class Java_sms_requesthttp_main extends Exception{
	public Java_sms_requesthttp_main(String s) 
    { 
        super(s); 
    }
	public static void main(String[] args) {
		Read_File rd = new Read_File();
		try {
			if(rd.gender.equals("Male"))
				new Male(rd);
			else if(rd.gender.equals("Female"))
				new Female(rd);
			else {
				throw new Java_sms_requesthttp_main("Gender Confused");
			}
		}
		catch(Java_sms_requesthttp_main e) {
			System.out.println("Gender Confused");
		}
		new Msg(rd);
    }
}
