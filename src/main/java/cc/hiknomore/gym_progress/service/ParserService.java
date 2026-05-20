package cc.hiknomore.gym_progress.service;

import java.util.regex.Pattern;

import org.apache.logging.log4j.message.StringFormattedMessage;
import org.springframework.stereotype.Service;

@Service
public class ParserService {
    
    public ParserService() {}
    
    public void parseTextInput(String input) {
        input.trim();
        Pattern time = Pattern.compile("");//TODO
        Pattern timeSets = Pattern.compile("");//TODO
        Pattern timeDistance = Pattern.compile("");//TODO
        Pattern timeWeight = Pattern.compile("");//TODO
        
        Pattern repsSets = Pattern.compile("");//TODO
        Pattern repsPerSet = Pattern.compile("");//TODO
        Pattern repsSetsWeight = Pattern.compile("");//TODO
        
        Pattern distance = Pattern.compile("");//TODO
    }

}
