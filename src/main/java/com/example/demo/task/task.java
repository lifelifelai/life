package com.example.demo.task;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutionException;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;


@Component
public class task {
	

@Scheduled(initialDelay = 1000, fixedDelay = 600000)
void ppp() throws IOException
{
	Document doc = Jsoup.connect("https://adora.herokuapp.com/sysy").get();
System.out.println("newcode");
//	List<playplannlist> playplannl=new ArrayList<playplannlist>();
//	playplannl=rep4.wwstat1();
//	System.out.println(playplannl.size()+"WW");
//	for (int ii=0;ii<playplannl.size();ii++)
//	{
//	   LineMessagingClient client = LineMessagingClient.builder("siyTXOs4UvFs4axEaIzKNPwfKupC0vWU3gC0ij7+vCHtX5gDgHe/5L8uIBaYHj0/wYE0iLP0ibgCv7m83ZBxhI9t06UVMDlNe7qx8xs/SSMnLnF6FnVPES2aEJBrWpMEJKDxKy+rhKOWYeTRiYP7/QdB04t89/1O/w1cDnyilFU=").build();
//	    
//			//Uf9ab298ecf4fd9df1c8c048dabdcf924書岑
//	   String texx="妳有一筆新的約會，時間在"+playplannl.get(ii).getDate()+"，要去"+playplannl.get(ii).getGo2()
//			   +" "+playplannl.get(ii).getHow()+" 。memo:"+playplannl.get(ii).getMemo();
//		    TextMessage textMessage = new TextMessage(texx);
//		    PushMessage pushMessage = new PushMessage(
//		            "Uf9ab298ecf4fd9df1c8c048dabdcf924",
//		            textMessage);
//
//		     BotApiResponse botApiResponse=null;
//		    try {
//		        botApiResponse = client.pushMessage(pushMessage).get();
//		    } catch (InterruptedException | ExecutionException e) {
//		        e.printStackTrace();
//		      
//		    }
//
//		  //  System.out.println(botApiResponse);
//	rep.sett("date", texx);
//	}
//	
//	rep4.upto0();
}
}
