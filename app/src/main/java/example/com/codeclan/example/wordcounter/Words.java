package example.com.codeclan.example.wordcounter;

/**
 * Created by user on 17/01/2017.
 */

public class Words {

    String somestring;

    public Words(String somestring){
        this.somestring = somestring;
    }

    public int countWordsInString(String data){
        return somestring.split(" ").length;
    }

    public void addString(String sentence){
        this.somestring = sentence;
    }

    public String getString(){
        return this.somestring;
    }

    public int countWords(){
        addString(somestring);
        return somestring.split(" ").length;
    }

    public String changeToString(){
        int words = countWords();
        return somestring + " is "  + words + " words long.";
    }

}
