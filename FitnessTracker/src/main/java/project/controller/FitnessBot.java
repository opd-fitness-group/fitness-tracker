package project.controller;

import org.springframework.stereotype.Component;
import org.telegram.telegrambots.bots.TelegramLongPollingBot;
import org.telegram.telegrambots.meta.api.objects.Update;

@Component
public class FitnessBot extends TelegramLongPollingBot{
	@Override 
	public String getBotUsername() {
		return null;
	}
	
	@Override
	public String getBotToken() {
		return null;
	}
	
	@Override
	public void onUpdateReceived(Update update) {
		
	}
}
