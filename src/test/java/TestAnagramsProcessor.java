package test.java;

import com.foxminded.anagram.main.java.processors.AnagramsProcessor;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TestAnagramsProcessor {
    private AnagramsProcessor anagramsProcessor = new AnagramsProcessor();

    private String expected;
    private String actual;

    @Test
    void processMustReturnNullIfInputIsNull(){
        assertNull(anagramsProcessor.process(null));
    }

    @Test
    void processMustReturnEmptyStringWhenInputIsEmptyString(){
        expected = "";
        actual = anagramsProcessor.process("");
        assertEquals(expected, actual);
    }

    @Test
    void processMustReturnEmptyStringWhenInputStringIsSeparator(){
        expected = "";
        actual = anagramsProcessor.process(" ");
        assertEquals(expected, actual);
    }

    @Test
    void processMustReturnEmptyStringWhenInputStringIsSeparators(){
        expected = "";
        actual = anagramsProcessor.process("   ");
        assertEquals(expected, actual);
    }

    @Test
    void processMustReturnTheSameLetterWhenInputIsOneLetter(){
        expected = "a";
        actual = anagramsProcessor.process("a");
        assertEquals(expected, actual);
    }

    @Test
    void processMustReturnTheSameLettersWhenInputIsTheSameLetters(){
        expected = "aaa";
        actual = anagramsProcessor.process("aaa");
        assertEquals(expected, actual);
    }

    @Test
    void processMustReturnReversedInputWhenInputIsOnlyLetters(){
        expected = "oLLeH";
        actual = anagramsProcessor.process("HeLLo");
        assertEquals(expected, actual);
    }

    @Test
    void processMustReturnReversedWordsWhenInputIsOnlyWords(){
        expected = "oLLeH tinUJ";
        actual = anagramsProcessor.process("HeLLo JUnit");
        assertEquals(expected, actual);
    }

    @Test
    void processMustReturnTheSameNumbersWhenInputIsOnlyNumbers(){
        expected = "123 4567890";
        actual = anagramsProcessor.process("123 4567890");
        assertEquals(expected, actual);
    }

    @Test
    void processMustReturnTheSameSymbolsWhenInputIsOnlySymbols(){
        expected = "<>!?.,=+";
        actual = anagramsProcessor.process("<>!?.,=+");
        assertEquals(expected, actual);
    }

    @Test
    void processMustReturnOnlyLettersReversedWhenInputIsMixed(){
        expected = "wolleH! avaJ., риМ771";
        actual = anagramsProcessor.process("Hellow! Java., Мир771");
        assertEquals(expected, actual);
    }
}