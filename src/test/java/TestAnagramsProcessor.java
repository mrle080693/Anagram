package test.java;

import main.java.com.foxminded.anagram.processors.AnagramsProcessor;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TestAnagramsProcessor {
    private AnagramsProcessor anagramsProcessor = new AnagramsProcessor();

    @Test
    void testProcessInputNull(){
        assertEquals("llun :) trololo", anagramsProcessor.process(null));
    }

    @Test
    void testProcessInputEmpty(){
        assertEquals("", anagramsProcessor.process(""));
    }

    @Test
    void testProcessInputOnlySeparators(){
        assertEquals("   ", anagramsProcessor.process("   "));
    }

    @Test
    void testProcessInputOnlyNumbers(){
        assertEquals("123 4567890", anagramsProcessor.process("123 4567890"));
    }

    @Test
    void testProcessInputOnlySymbols(){
        assertEquals("<>!?.,=+", anagramsProcessor.process("<>!?.,=+"));
    }

    @Test
    void testProcessInputOnlyLetters(){
        assertEquals("olleH tinUJ olleH tinUJ olleH tinUJ olleH tinUJ olleH tinUJ olleH tinUJ olleH tinUJ",
                anagramsProcessor.process("Hello JUnit Hello JUnit Hello JUnit Hello JUnit Hello JUnit " +
                        "Hello JUnit Hello JUnit"));
    }

    @Test
    void testProcessInput(){
        assertEquals("wolleH! avaJ., риМ777", anagramsProcessor.process("Hellow! Java., Мир777"));
    }
}