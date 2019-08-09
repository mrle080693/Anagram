package com.mrle080693.foxminded;

import com.mrle080693.foxminded.logic.AnagramsProcessor;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String inputStr = scanner.nextLine();

        AnagramsProcessor anagramsProcessor = new AnagramsProcessor();
        System.out.println(anagramsProcessor.process(inputStr));
    }
}
