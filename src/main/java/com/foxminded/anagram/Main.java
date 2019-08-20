package main.java.com.foxminded.anagram;

import main.java.com.foxminded.anagram.processors.AnagramsProcessor;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String userInput = scanner.nextLine();

        AnagramsProcessor anagramsProcessor = new AnagramsProcessor();
        System.out.println(anagramsProcessor.process(userInput));
    }
}
