package com.jeffborda.songr;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.StringJoiner;

@Controller
public class HelloWorldController {


    @RequestMapping(value = {"/", "hello","/helloworld"}, method = RequestMethod.GET)
    @ResponseBody
    public String helloWorld() {
        return "Hello there!!!";
    }

    @RequestMapping(value = "/capitalize/{wordToCapitalize}", method = RequestMethod.GET)
    @ResponseBody
    public String capitalize(@PathVariable() String wordToCapitalize) {
        StringJoiner echoWord = new StringJoiner(" ");
        int echoCount = 100_000;
        for(int i = 0; i < echoCount; i++) {
            echoWord.add(wordToCapitalize.toUpperCase());
        }
        return echoWord.toString();
    }

}
