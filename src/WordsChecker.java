import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class WordsChecker {
    protected String text;
    protected Set<String> wordSet;

    public WordsChecker(String text) {
        this.text = text.toLowerCase();
        String[] words = text.split("\\P{IsAlphabetic}+");
        wordSet = new HashSet<>();
        wordSet.addAll(Arrays.asList(words));
    }

    public boolean hasWord(String word) {
        String wordLower = word.toLowerCase();
        return wordSet.contains(wordLower);
    }
}
