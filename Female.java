package healthcare;

import java.io.BufferedReader;
//import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;

class Female
{
    int i;
    String data;
    ArrayList<String> datalist=new ArrayList<String>();
    ArrayList<String> value=new ArrayList<String>();
    ArrayList<Double> Value=new ArrayList<Double>();
    double val;
    
    public void readfile()throws Exception
    {
	    BufferedReader br=new BufferedReader(new FileReader("/home/stoneduser/Desktop/Java/test.txt"));
	    String sc;
	    while((sc = br.readLine())!=null){
            String[] Pair = sc.split(":");
            datalist.add(Pair[0]);
            value.add(Pair[1]);

        }
	    for(i=5;i<datalist.size();i++)
	    {
	        data=value.get(i);
	        val=Double.parseDouble(data);
	        Value.add(val);
	    }
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
            if(rbc<4.1)
                return 1;
            else if(4.1<=rbc && rbc<=5.1)
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
            if(h<12.3)
                return 1;
            else if(12.3<=h && h<=15.3)
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
