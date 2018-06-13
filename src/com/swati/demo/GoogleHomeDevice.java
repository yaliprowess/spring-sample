package com.swati.demo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.swati.demo.language.HindiVoiceCommand;

public class GoogleHomeDevice {
	
	GoogleHome googleHome;
	ApplicationContext ctx =null;
	
	public static void main(String[] args) {
		GoogleHomeDevice gHD=new GoogleHomeDevice();
		gHD.switchOn();
	}
	
	public GoogleHomeDevice() {
		ctx= new ClassPathXmlApplicationContext("application-context.xml");
	}

	public void switchOn() {
		
		HindiVoiceCommand hindiVoiceCommand=(HindiVoiceCommand) ctx.getBean("hindiVoiceCommand");
		googleHome=new GoogleHome(hindiVoiceCommand);
		googleHome.listen();
	}
}
