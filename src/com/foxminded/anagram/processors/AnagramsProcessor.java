package com.foxminded.anagram.processors;

public class AnagramsProcessor {
    private final String SEPARATOR = " ";
    private final String NON_LETTERS_PATTERN = "[^\\p{L}\\s]";

    public String process(String input){
        String result = null;
        if(input != null) {
            String[] splitedInput = input.split(SEPARATOR);
            splitedInput = deleteSymbols(splitedInput);
            result = reverseInput(splitedInput);
            result = insertSymbols(input, result).trim();
            if(result.length() == 0){
                result = input;
            }
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
    private String insertSymbols(String input, String inputReversedLetters) {
        String[] inputAsChars = new String[input.length()];
        String result = inputReversedLetters;
        for (int i = 0; i <= input.length() - 1; i++) {
            inputAsChars[i] = input.substring(i, i + 1);
            if (inputAsChars[i].matches(NON_LETTERS_PATTERN)) {
                result = result.substring(0, i) + inputAsChars[i] + result.substring(i);
            }
        }
        return result;
    }
}
