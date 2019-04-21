package healthcare;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;
import java.net.URLEncoder;

public class Msg {
	@SuppressWarnings("deprecation")
	public Msg(Read_FIle rd) {
		//Your authentication key
//		rakshat="272569AZalSl0t5cb4c48b";
//		saraj="272570AS8Cq9FBIF5cb4c4a4";
//		bihari="272563AL6Lqd7hn5cb4bc62";
//		John="272574AfYXexim5cb4ca86";
        String authkey = "272574AfYXexim5cb4ca86";
        //Multiple mobiles numbers separated by comma
        String mobiles = rd.PhoneNo;
        //Sender ID,While using route4 sender id should be 6 characters long.
        String senderId = "SSRLAB";
        //Your message to send, Add URL encoding here.
//        String message = "Test message";
        if(rd.message.equals("")) {
        	rd.message = "Dear,\n"+rd.Name+"\nAll your Blood Reports are NORMAL.";
        }
        else
        	rd.message = "Dear,\n"+rd.Name+"\n you have a situation "+rd.message+"\nPlease visit Doctor ASAP!!";
        //define route
//        String route="1";

        //Prepare Url
        URLConnection myURLConnection=null;
        URL myURL=null;
        BufferedReader reader=null;

        //encoding message
        String encoded_message=URLEncoder.encode(rd.message);

        //Send SMS API
        String mainUrl="http://api.msg91.com/api/sendhttp.php?";

        //Prepare parameter string
        StringBuilder sbPostData= new StringBuilder(mainUrl);
        sbPostData.append("authkey="+authkey);
        sbPostData.append("&mobiles="+mobiles);
        sbPostData.append("&message="+encoded_message);
//        sbPostData.append("&route="+route);
        sbPostData.append("&sender="+senderId);

        //final string
        mainUrl = sbPostData.toString();
        try
        {
            //prepare connection
            myURL = new URL(mainUrl);
            myURLConnection = myURL.openConnection();
            myURLConnection.connect();
            reader= new BufferedReader(new InputStreamReader(myURLConnection.getInputStream()));
            //reading response
            String response;
            while ((response = reader.readLine()) != null)
            //print response
            System.out.println(response);

            //finally close connection
            reader.close();
        }
        catch (IOException e)
        {
                e.printStackTrace();
        }
	}
}
