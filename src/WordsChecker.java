import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class WordsChecker {
    protected String text;

    public WordsChecker (String text) {
        this.text = text;
    }

    public boolean hasWord (String word) {
        String text1 = text.toLowerCase();
        String wordLower = word.toLowerCase();
        String [] words = text1.split("\\P{IsAlphabetic}+");
        Set<String> wordSet = new HashSet<>();
        wordSet.addAll(Arrays.asList(words));
        for (String word2 : wordSet) {
            if (wordLower.equals(word2)) {
                return true;
            }
        }
        return false;
    }
}
