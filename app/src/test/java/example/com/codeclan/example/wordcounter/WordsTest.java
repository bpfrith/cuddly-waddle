package example.codeclan.com.example.wordcounter;

import org.junit.Before;
import org.junit.Test;

import example.com.codeclan.example.wordcounter.Words;

import static junit.framework.Assert.*;

/**
 * Created by user on 17/01/2017.
 */

public class WordsTest {

    Words words;

    @Before
    public void before(){
        words = new Words("see the little goblin see his little feet see his little nosey wosey isn't the goblin sweet");
    }

    @Test
    public void canGetString(){
        assertEquals("see the little goblin see his little feet see his little nosey wosey isn't the goblin sweet", words.getString());
    }

    @Test
    public void canCountWords(){
        assertEquals(17, words.countWordsInString("see the little goblin see his little feet see his little nosey wosey isn't the goblin sweet"));
    }

    @Test
    public void canChangeDataVariable(){
        words.addString("see the little goblin see his little feet see his little nosey wosey isn't the goblin sweet");
        assertEquals("see the little goblin see his little feet see his little nosey wosey isn't the goblin sweet", words.getString());
    }

    @Test
    public void canChangeToString(){
        assertEquals("see the little goblin see his little feet see his little nosey wosey isn't the goblin sweet is 17 words long.", words.changeToString());
    }

}
