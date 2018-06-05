package javaStuff;

import java.util.*;
import javax.mail.*;
import javax.mail.internet.*;
import javax.activation.*;


public class SendFileEmail {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//  Receiver mailbox
		String to="abc@gmail.com";
		
		// Sender mailbox
		String from="web@gmail.com";
		
		//mail localhost
		String host="localhost";
		
		//get System properties
		Properties properties=new Properties();
		
		//set mail.smtp.host
		properties.setProperty("mail.stmp.host", host);
		
		//get session object
		Session session=Session.getDefaultInstance(properties);
		
		try {
			
			//Create default MineMessage object
			MimeMessage message=new MimeMessage(session);
			
			//Set From: head info
			message.setFrom(new InternetAddress(from));
			
			//Set To: head info
			message.addRecipient(Message.RecipientType.TO, new InternetAddress(to));
			
			//Set Subject:
			message.setSubject("This is the Subject Line!");
			
			////Set Text:
			//message.setText("This is actual message.");
			
			//Set message part
			BodyPart messageBodyPart=new MimeBodyPart();
			
			//message:
			messageBodyPart.setText("This is message body.");
			
			//Set Multiple info
			Multipart multipart=new MimeMultipart();
			
			//set text message
			multipart.addBodyPart(messageBodyPart);
			
			//Attachment part
			messageBodyPart=new MimeBodyPart();
			String filename="file.text";
			DataSource source=new FileDataSource(filename);
			messageBodyPart.setDataHandler(new DataHandler(source));
			messageBodyPart.setFileName(filename);
			multipart.addBodyPart(messageBodyPart);
			
			//send total message
			message.setContent(multipart);
			
			
			//Send message action
			Transport.send(message);
			System.out.println("Send message sucessfully...");		
			
		}catch(MessagingException mex) {
			mex.printStackTrace();
		}

	}

}
