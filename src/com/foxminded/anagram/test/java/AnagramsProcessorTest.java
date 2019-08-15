package com.foxminded.anagram.test.java;

import com.foxminded.anagram.main.java.processors.AnagramsProcessor;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AnagramsProcessorTest {
    private AnagramsProcessor anagramsProcessor = new AnagramsProcessor();

    @Test
    private void processResultTest() {
        assertEquals("wolleH! avaJ., риМ777 ", anagramsProcessor.process("Hellow! Java., Мир777"));
    }
}