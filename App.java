package com.amazonaws.quickstart;

/**
 * Hello world!
 *
 */
public class App{
	public static void main(String[] args) {
		Read_File rd = new Read_File();
		try {
			if(rd.gender.equals("Male"))
				new Male(rd);
			else if(rd.gender.equals("Female"))
				new Female(rd);
			else {
				throw new InvalidGenderException("Not Found");
			}
		}
		catch(InvalidGenderException e) {
			System.out.println("Not Found");
		}
//		new MsgSNS(rd);
		new Msg(rd);
    }
}
