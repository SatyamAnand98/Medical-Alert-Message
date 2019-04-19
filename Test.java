package healthcare;

import com.amazonaws.auth.AWSCredentials;
import com.amazonaws.auth.BasicAWSCredentials;
import com.amazonaws.services.sns.AmazonSNSClient;
import com.amazonaws.services.sns.model.CreateTopicRequest;
import com.amazonaws.services.sns.model.CreateTopicResult;
import com.amazonaws.services.sns.model.PublishRequest;

public class Test {
	public static void main(String[] args) {
	    AWSCredentials awsCredentials = new BasicAWSCredentials("YOUR_Client_ID", "YOUR_Client_secret");
	    final AmazonSNSClient client = new AmazonSNSClient(awsCredentials);
	    client.setRegion(Region.getRegion(Regions.REGION_YOU_WANT_TO_USE));

	    AmazonSNSClient snsClient = new AmazonSNSClient(awsCredentials);
	    String message = "My SMS message";
	    String phoneNumber = "+919513868175";
	    Map<String, MessageAttributeValue> smsAttributes = 
	            new HashMap<String, MessageAttributeValue>();
	    //<set SMS attributes>
	    sendSMSMessage(snsClient, message, phoneNumber, smsAttributes);
	    
	    public static void sendSMSMessage(AmazonSNSClient snsClient, String message, 
	    	    String phoneNumber, Map<String, MessageAttributeValue> smsAttributes) {
	    	    PublishResult result = snsClient.publish(new PublishRequest()
	    	                    .withMessage(message)
	    	                    .withPhoneNumber(phoneNumber)
	    	                    .withMessageAttributes(smsAttributes));
	    	    System.out.println(result); // Prints the message ID.
	    	}
	}
}