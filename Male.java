package healthcare;

import java.io.BufferedReader;
//import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
//import java.io.*;

class Male
{
    int i;
    String data;
//    double vl;
    ArrayList<String> datalist=new ArrayList<String>();
    ArrayList<String> value=new ArrayList<String>();
    ArrayList<Double> Value=new ArrayList<Double>();
    double val;
    
    public void readfile()throws Exception
    {
//	    File patientfile=new File("/home/stoneduser/Desktop/Java/test.txt");
	    BufferedReader br=new BufferedReader(new FileReader("/home/stoneduser/Desktop/Java/test.txt"));
	    String sc;
	    while((sc = br.readLine())!=null){
//	    	System.out.println(sc);
            String[] Pair = sc.split(":");
            datalist.add(Pair[0]);
            value.add(Pair[1]);
//            System.out.println(datalist);
//            System.out.println(value);

        }
//	    while((sc=br.readLine())!=null)
//	    {
//	    	if(sc.equals("Report:"))
//            {
//               while((sc=br.readLine())!=null)
//               {
//                String[] datapart=sc.split(":");
//                datalist.add(datapart[1]);
//               }
//            }
//        }
	    for(i=5;i<datalist.size();i++)
	    {
	        data=value.get(i);
	        val=Double.parseDouble(data);
//	        System.out.println(data);
	        Value.add(val);
	    }
//	    for(i=0;i<value.size();i++)
//	    {
//	      vl=value.get(i);
////	       System.out.println(vl);
//	    }
	    br.close();
    }
    public int glucose()
    {
            double g=Value.get(0);
            if(g<100.0)
                return 1;
            else if(100.0<=g && g<=125.0)
                return 0;
            else
                return 2;
    }
    public int calcium()
    {
        double c=Value.get(1);

            if(c<8.6)
                return 1;
            else if(8.6<=c && c<=10.2)
                return 0;
            else
                return 2;
    }
    public int cholesterol()
    {
        double ch=Value.get(2);
            if(ch<200.0)
                return 1;
            else if(200.0<=ch && ch<=239.0)
                return 0;
            else
                return 2;
    }
    public int rbc()
    {
        double rbc=Value.get(3);
            if(rbc<4.5)
                return 1;
            else if(4.5<=rbc && rbc<=5.9)
                return 0;
            else
                return 2;
    }
    public int wbc()
    {
        double wbc=Value.get(4);
            if(wbc<4500.0)
                return 1;
            else if(4500.0<=wbc && wbc<=10000.0)
                return 0;
            else
                return 2;
    }
    public int hemoglobin()
    {
        double h=Value.get(5);
            if(h<14.0)
                return 1;
            else if(14.0<=h && h<=17.5)
                return 0;
            else
                return 2;
    }
    public int platelets()
    {
        double p=Value.get(6);
            if(p<150000.0)
                return 1;
            else if(150000.0<=p && p<=450000.0)
                return 0;
            else
                return 2;
    }
    public int sodium()
    {
        double s=Value.get(7);
            if(s<135.0)
                return 1;
            else if(135.0<=s && s<=145.0)
                return 0;
            else
                return 2;
    }
    public int potassium()
    {
       double pt=Value.get(8);
            if(pt<3.6)
                return 1;
            else if(3.5<=pt && pt<=5.0)
                return 0;
            else
                return 2;
    }
    public int chloride()
    {
       double cl=Value.get(9);
            if(cl<97.0)
                return 1;
            else if(97.0<=cl && cl<=107.0)
                return 0;
            else
                return 2;
    }
}