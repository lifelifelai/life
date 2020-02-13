package com.example.demo.controller;

import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutionException;

import javax.net.ssl.HttpsURLConnection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.example.demo.entity.Event;
import com.example.demo.entity.account;
import com.example.demo.entity.eventwraper;
import com.example.demo.entity.messagee;
import com.example.demo.entity.replymessage;
import com.example.demo.entity.status;
import com.example.demo.repository.repository;
import com.example.demo.repository.repositorystatus;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.linecorp.bot.client.LineMessagingClient;
import com.linecorp.bot.model.PushMessage;
import com.linecorp.bot.model.ReplyMessage;
//import com.example.demo.repository.repository;
import com.linecorp.bot.model.message.TextMessage;
import com.linecorp.bot.model.response.BotApiResponse;

@RestController
@RequestMapping("/g")
public class controller {

	@Autowired
	repository rep;
	@Autowired
	repositorystatus rep2;
	
	
//	@RequestMapping("/greeting")
//  public String hello(@RequestBody String h) {
//		String kk=null;
//		System.out.println(h.indexOf("\"text\":\""+8)+"...."+h.indexOf("\"}}],"));
//System.out.println(kk=h.substring(h.indexOf(",\"text\"")+9, h.indexOf("\"}}],")));
////rep.sett(kk);
//    return("dd"); // 根據view resolver mapping至hello.jsp
//  }
//	
	@RequestMapping(value="/gg")
	  public String hello2(@RequestBody eventwraper events) throws IOException, ExecutionException {	
	String gg=null;
	  LineMessagingClient client = LineMessagingClient.builder("siyTXOs4UvFs4axEaIzKNPwfKupC0vWU3gC0ij7+vCHtX5gDgHe/5L8uIBaYHj0/wYE0iLP0ibgCv7m83ZBxhI9t06UVMDlNe7qx8xs/SSMnLnF6FnVPES2aEJBrWpMEJKDxKy+rhKOWYeTRiYP7/QdB04t89/1O/w1cDnyilFU=").build();
	  
	gg=events.getEvents().get(0).getReplyToken();

	String ggf;
	ggf=events.getEvents().get(0).getMessage().getText();
	String replymsg="";
	String statusnow="";
 
	statusnow=rep2.status();

 
   String [] uu= {"寶貝我最愛妳了","綸綸是我的公主","綸綸是我的女神",events.getEvents().get(0).getMessage().getText(),"沒有不學妳，笨笨"};
   String [] uu1= {"寶貝要乖乖的喔","真的嗎??","好想你","現在時間大概是","不學你惹~",events.getEvents().get(0).getMessage().getText()};
  
    
    
    
   
 
    
    
   replymsg=statusnow;
   
   
    TextMessage textMessage=null;
    textMessage = new TextMessage(replymsg);
    
    
    
	final ReplyMessage replyMessage = new ReplyMessage( gg,textMessage);

	BotApiResponse botApiResponse=null;
	try {
	    botApiResponse = client.replyMessage(replyMessage).get();
	} catch (InterruptedException e) {
	    e.printStackTrace();
	 
	}

	//System.out.println(botApiResponse);
   
   
	  rep.sett(ggf,textMessage.getText());
   rep2.sett("3");
   
//   jsonString ="{\"replyToken\":\""+gg+"\",\"message\":[{\"type\":\"text\",\"text\":\"hihihihihi\"},{\"type\":\"text\",\"text\":\"ddd\"}]}";
   
//   System.out.println(jsonString);
//   sentpost(jsonString);
	    return(gg); // 根據view resolver mapping至hello.jsp
	  }
		
	
	
	@RequestMapping("/yulun")
  public String hello2(@RequestBody String ff) {
		System.out.println(ff); 
		return(rep.findAll().get(0).getPas());
		 
  // 根據view resolver mapping至hello.jsp
  }
	@RequestMapping("/y")
	@ResponseBody
	  public List<account> ss2() {
			
		  List<account> ww=new ArrayList<account>();
		  ww=rep.ww();
		  System.out.println(ww.size());
		  return ww;
			//return(rep.findAll().get(0).getPas());
			 
	  // 根據view resolver mapping至hello.jsp
	  }
	
	  
	  
		@RequestMapping("/y2")
		@ResponseBody
		  public List<status> ss3() {
				
			  List<status> ww=new ArrayList<status>();
			  ww=rep2.ww1();
			
			  return ww;
				//return(rep.findAll().get(0).getPas());
				 
		  // 根據view resolver mapping至hello.jsp
		  }
	  
	  
	String qqw=null;
	
	
	
//	@RequestMapping("/try")
//  public String hello33( String ff) {
//		
//		
//	    LineMessagingClient client = LineMessagingClient.builder("AYeucduzbLCNlLFM9KSL53gTya2WpONrZkB6PMc0TQ1MFYOmO1PP0hn0/JbTp6/Yn/JVEllpAp1F1ClZMELsCu1MCNquW0qobAxQzo2IIgt7F25ChEQ7CQUd8/G+0Uopxv75GP2a1+UMmM+WgVDghwdB04t89/1O/w1cDnyilFU=").build();
//
//	    
//		
//	    TextMessage textMessage = new TextMessage(ff);
//	    PushMessage pushMessage = new PushMessage(
//	            qqw,
//	            textMessage);
//
//	     BotApiResponse botApiResponse=null;
//	    try {
//	        botApiResponse = client.pushMessage(pushMessage).get();
//	    } catch (InterruptedException | ExecutionException e) {
//	        e.printStackTrace();
//	      
//	    }
//
//	    System.out.println(botApiResponse);
//	return "success";
//
//	
//	   
//  }

	
	
	
	
//	
//	@RequestMapping("/try1")
//	  public String hello11223(@RequestBody eventwraper events) throws IOException, ExecutionException {	
//		String gg=null;
//		gg=events.getEvents().get(0).getReplyToken();
//		System.out.println("efef");
//		System.out.println(events.getEvents().get(0).getReplyToken());
//		System.out.println(gg=events.getEvents().get(0).getSource().getUserId());
//		qqw=gg;
//		String ggf;
//	   rep.sett(ggf=events.getEvents().get(0).getMessage().getText());
//	   
//
//	
//	    LineMessagingClient client = LineMessagingClient.builder("AYeucduzbLCNlLFM9KSL53gTya2WpONrZkB6PMc0TQ1MFYOmO1PP0hn0/JbTp6/Yn/JVEllpAp1F1ClZMELsCu1MCNquW0qobAxQzo2IIgt7F25ChEQ7CQUd8/G+0Uopxv75GP2a1+UMmM+WgVDghwdB04t89/1O/w1cDnyilFU=").build();
//
//	    
//	
//	    TextMessage textMessage = new TextMessage("hello");
//	    PushMessage pushMessage = new PushMessage(
//	            gg,
//	            textMessage);
//
//	     BotApiResponse botApiResponse=null;
//	    try {
//	        botApiResponse = client.pushMessage(pushMessage).get();
//	    } catch (InterruptedException | ExecutionException e) {
//	        e.printStackTrace();
//	      
//	    }
//
//	 
//	
//
//	    System.out.println(botApiResponse);
//	   
//	   
//	   
//	   
//	//   jsonString ="{\"replyToken\":\""+gg+"\",\"message\":[{\"type\":\"text\",\"text\":\"hihihihihi\"},{\"type\":\"text\",\"text\":\"ddd\"}]}";
//	   
//	//   System.out.println(jsonString);
//	//   sentpost(jsonString);
//		    return(gg); // 根據view resolver mapping至hello.jsp
//	  }

			
	
		
	
	private void sentpost(String message) 
	{
		
//		try {
//		 String accestoken="{Q4AFo5nfKYJ8MiHV4uIYVUAAQ668GXP3d7RNL3EtV7p0l6sHkC+mXrZgwIgvcMvTg8ddT90tNHV9eMZ0yaeT48/qDB96YEISC1grArA8S6XbLuLTqPuNo8Kb4rubULYrFr3QBqMSAfFI7UXolz/EbwdB04t89/1O/w1cDnyilFU=}";
//	        URL url= new URL("localhost:8080/g/yulun");//"https://api.line.me/v2/bot/message/reply");
//	        HttpsURLConnection con = (HttpsURLConnection) url.openConnection();
//
//	        //添加请求头
//	        con.setRequestMethod("POST");
//	        con.setRequestProperty("Content-Type", "application/json");
//	        con.setRequestProperty("Authorization", "Bearer "+accestoken);
//	        con.setRequestProperty("client_secret","a525c635ec4c6f0b26fda36dbb787525");
//	        
//	        con.setDoInput(true);
//	        con.setDoOutput(true);
//
//	        //发送Post请求
//	 System.out.println("sentnttt");
//	        DataOutputStream wr = new DataOutputStream(con.getOutputStream());
//	        wr.writeBytes(message);
//	        wr.flush();
//	        wr.close();
//	        System.out.println(con.getContent().toString());
//	        
//	      	 System.out.println("sentntttover");
//		      System.out.println( con.getResponseCode()+"==="+con.getResponseMessage());
//		     
//		}catch (Exception r)
//		{
//			System.out.println(r.toString());
//			System.out.println(r.getMessage());
//		}
//	

	       
	}
}