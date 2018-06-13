package com.swati.demo.language;

import com.swati.demo.VoiceCommand;

public class EnglishVoiceCommand extends VoiceCommand {

	@Override
	public void recognize() {
		System.out.println("Trying to undrestand english");
	}
	
}
