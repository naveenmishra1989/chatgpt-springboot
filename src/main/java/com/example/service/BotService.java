package com.example.service;

import com.example.model.BotRequest;
import com.example.model.ChatGptResponse;

public interface BotService {

    ChatGptResponse askQuestion(BotRequest botRequest);
}
