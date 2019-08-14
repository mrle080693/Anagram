package com.foxminded.anagram.processors;

public class AnagramsProcessor {
    private final String SEPARATOR = " ";
    private final String NON_LETTERS_PATTERN = "[^\\p{L}\\s]";

    public String process(String input){
        String result = "";
        if(input != null) {
            String[] splitedInput = input.split(SEPARATOR);
            splitedInput = deleteSymbols(splitedInput);
            result = reverseInput(splitedInput);
            result = insertSymbols(input, result);
        }
        return result;
    }

    private String[] deleteSymbols(String[] input) {
        String[] result = new String[input.length];
        for (int i = 0; i <= input.length - 1; i++) {
            result[i] = input[i].replaceAll(NON_LETTERS_PATTERN, "");
        }
        return result;
    }

    private String reverseInput(String[] input){
        String[] reversedInput = new String[input.length];
        String result = "";
        for(int i = 0; i <= input.length - 1; i++) {
            reversedInput[i] = new StringBuffer(input[i]).reverse().toString();
            result = result + reversedInput[i] + SEPARATOR;
        }
        return result;
    }

    private String insertSymbols(String input, String inputOnlyLetters) {
        String[] inputAsArray = new String[input.length()];
        String result = inputOnlyLetters;
        for (int i = 0; i <= input.length() - 1; i++) {
            inputAsArray[i] = input.substring(i, i + 1);
            if (inputAsArray[i].matches(NON_LETTERS_PATTERN)) {
                result = result.substring(0, i) + inputAsArray[i] + result.substring(i);
            }
        }
        return result;
    }
}
