package com.foxminded.anagram.processors;

public class AnagramsProcessor {
    private final String SEPARATOR = " ";
    private final String NON_LETTERS = "[^\\p{L}\\s]";

    public String process(String userInput){
        String result = "";
        if(userInput != null) {
            String[] splitedInput = userInput.split(SEPARATOR);
            splitedInput = deleteSymbols(splitedInput);
            result = reverseInput(splitedInput);
            result = insertSymbols(userInput, result);
        }
        return result;
    }

    private String[] deleteSymbols(String[] splitedInput) {
        for (int i = 0; i <= splitedInput.length - 1; i++) {
            splitedInput[i] = splitedInput[i].replaceAll(NON_LETTERS, "");
        }
        return splitedInput;
    }

    private String reverseInput(String[] splitedInput){
        String result = "";
        for(int i = 0; i <= splitedInput.length - 1; i++) {
            splitedInput[i] = new StringBuffer(splitedInput[i]).reverse().toString();
            result = result + splitedInput[i] + SEPARATOR;
        }
        return result;
    }

    private String insertSymbols(String userInput, String result) {
        String[] inputAsArray = new String[userInput.length()];
        for (int i = 0; i <= userInput.length() - 1; i++) {
            inputAsArray[i] = userInput.substring(i, i + 1);
            if (inputAsArray[i].matches(NON_LETTERS)) {
                result = result.substring(0, i) + inputAsArray[i] + result.substring(i);
            }
        }
        return result;
    }
}
