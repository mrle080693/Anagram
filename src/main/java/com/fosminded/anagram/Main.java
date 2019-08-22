package com.fosminded.anagram;

import com.fosminded.anagram.processors.AnagramsProcessor;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String userInput = scanner.nextLine();

        AnagramsProcessor anagramsProcessor = new AnagramsProcessor();
        System.out.println(anagramsProcessor.process(userInput));
    }
}
