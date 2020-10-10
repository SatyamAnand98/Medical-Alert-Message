package com.amazonaws.quickstart;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.amazonaws.auth.BasicAWSCredentials;
import com.amazonaws.services.sns.AmazonSNSClient;
import com.amazonaws.services.sns.model.CreateTopicRequest;
import com.amazonaws.services.sns.model.CreateTopicResult;
import com.amazonaws.services.sns.model.MessageAttributeValue;
import com.amazonaws.services.sns.model.PublishRequest;
import com.amazonaws.services.sns.model.PublishResult;
import com.amazonaws.services.sns.model.SubscribeRequest;

public class MsgSNS {
	public MsgSNS(Read_File rd) {
		// Your Credentials
	    String ACCESS_KEY = "YOUR_ACCESS_KEY";
	    String SECRET_KEY = "YOUR_SECRET_KEY";
	    String topicName = "myTopiic";
	    String message = rd.message;
	    // Populate the list of phoneNumbers
	    List<String> phoneNumbers = Arrays.asList("+91"+rd.PhoneNo);
	    AmazonSNSClient snsClient = new AmazonSNSClient(new BasicAWSCredentials(ACCESS_KEY, SECRET_KEY));
	    // Create SMS Topic
	    String topicArn = createSNSTopic(snsClient, topicName);
	    // Subcribe Phone Numbers to Topic
	    subscribeToTopic(snsClient, topicArn, "sms", phoneNumbers);
	    // Publish Message to Topic
	    sendSMSMessageToTopic(snsClient, topicArn, message);
	}
public static String createSNSTopic(AmazonSNSClient snsClient,
                      String topicName) {
    CreateTopicRequest createTopic = new  
                     CreateTopicRequest(topicName);
    CreateTopicResult result =
             snsClient.createTopic(createTopic);
    return result.getTopicArn();
}
public static void subscribeToTopic(AmazonSNSClient snsClient, String topicArn,
                                    String protocol, List<String> phoneNumbers) {
    for (String phoneNumber : phoneNumbers) {
        SubscribeRequest subscribe = new SubscribeRequest(topicArn, protocol, phoneNumber);
        snsClient.subscribe(subscribe);
    }
}
public static String sendSMSMessageToTopic(AmazonSNSClient snsClient, String topicArn, String message) {
	
	Map<String, MessageAttributeValue> smsAttributes = 
            new HashMap<String, MessageAttributeValue>();
	smsAttributes.put("AWS.SNS.SMS.SenderID", new MessageAttributeValue()
			.withStringValue("hey")
			.withDataType("String"));
	smsAttributes.put("AWS.SNS.SMS.MaxPrice", new MessageAttributeValue()
			.withStringValue("2.0") 
			.withDataType("Number"));
	smsAttributes.put("AWS.SNS.SMS.SMSType", new MessageAttributeValue()
			.withStringValue("Transactional")
			.withDataType("String"));
	
	
    PublishResult result = snsClient.publish(new PublishRequest()
            .withTopicArn(topicArn)
            .withMessage(message)
            .withMessageAttributes(smsAttributes));
    
    return result.getMessageId();
}
	
}
