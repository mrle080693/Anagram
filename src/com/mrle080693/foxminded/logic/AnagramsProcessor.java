package com.mrle080693.foxminded.logic;

public class AnagramsProcessor {
    private final String SEPARATOR = " ";
    private final String PATTERN = "[^a-zA-Z' ']";

    public String process(String inputStr){
        String[] splitedInput = splitInput(inputStr);
        splitedInput = deleteSymbols(splitedInput);
        String result = reverseInput(splitedInput);
        return insertSymbols(inputStr, result);
    }

    public String[] splitInput(String inputStr){
        return inputStr.split(SEPARATOR);
    }

    public String[] deleteSymbols(String[] splitedInput) {
        for (int i = 0; i <= splitedInput.length - 1; i++) {
            splitedInput[i] = splitedInput[i].replaceAll(PATTERN, "");
        }
        return splitedInput;
    }

    public String reverseInput(String[] splitedInput){
        String result = "";
        for(int i = 0; i <= splitedInput.length - 1; i++) {
            splitedInput[i] = new StringBuffer(splitedInput[i]).reverse().toString();
            result = result + splitedInput[i] + SEPARATOR;
        }
        return result;
    }

    public String insertSymbols(String inputStr, String result){
        String[] charArr = new String[inputStr.length()];
        for(int i = 0; i <= inputStr.length() - 1; i++){
            charArr[i] = inputStr.substring(i, i + 1);
            if(charArr[i].matches(PATTERN)){
                result = result.substring(0, i) + charArr[i] + result.substring(i);
            }
        }
        return result;
    }
}
