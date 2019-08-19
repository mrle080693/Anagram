package com.foxminded.anagram.test.java;

import com.foxminded.anagram.main.java.processors.AnagramsProcessor;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TestAnagramsProcessor {
    private AnagramsProcessor anagramsProcessor = new AnagramsProcessor();

    @Test
    void testProcess() {
        assertEquals("wolleH! avaJ., риМ777", anagramsProcessor.process("Hellow! Java., Мир777"));
        assertEquals("", anagramsProcessor.process(""));
        assertEquals("123 4567890", anagramsProcessor.process("123 4567890"));
        assertEquals("<>!?.,=+", anagramsProcessor.process("<>!?.,=+"));
        assertEquals("olleH tinUJ", anagramsProcessor.process("Hello JUnit"));
        assertNull(anagramsProcessor.process(null));
    }

}