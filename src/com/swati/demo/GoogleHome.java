package com.swati.demo;

public class GoogleHome {
	private VoiceCommand voiceCommand;
	
	public GoogleHome(VoiceCommand voiceCommand) {
		this.voiceCommand=voiceCommand;
	}
	public void listen() {
		System.out.println("Listening");
		voiceCommand.recognize();
	}
}

