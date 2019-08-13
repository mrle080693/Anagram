package com.foxminded.anagram.processors;

public class AnagramsProcessor {
    private final String SEPARATOR = " ";
    private final String PATTERN = "[^\\p{L}\\s]";

    public String process(String inputStr){
        String finalResult = "";
        if(inputStr != null) {
            String[] splitedInput = inputStr.split(SEPARATOR);
            splitedInput = deleteSymbols(splitedInput);
            String result = reverseInput(splitedInput);
            finalResult = insertSymbols(inputStr, result);
        }
        return finalResult;
    }

    private String[] deleteSymbols(String[] splitedInput) {
        for (int i = 0; i <= splitedInput.length - 1; i++) {
            splitedInput[i] = splitedInput[i].replaceAll(PATTERN, "");
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

    private String insertSymbols(String inputStr, String result) {
        String[] charArr = new String[inputStr.length()];
        for (int i = 0; i <= inputStr.length() - 1; i++) {
            charArr[i] = inputStr.substring(i, i + 1);
            if (charArr[i].matches(PATTERN)) {
                result = result.substring(0, i) + charArr[i] + result.substring(i);
            }
        }
        return result;
    }
}
