import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class WordsChecker {
    protected String text;
    protected Set<String> wordSet;

    public WordsChecker(String text) {
        this.text = text;
        wordSet = new HashSet<>();
    }

    public boolean hasWord(String word) {
        String text1 = text.toLowerCase();
        String wordLower = word.toLowerCase();
        String[] words = text1.split("\\P{IsAlphabetic}+");
        wordSet.addAll(Arrays.asList(words));
        Iterator<String> it = wordSet.iterator();
        while (it.hasNext()) {
            String word2 = it.next();
            if (wordLower.equals(word2)) {
                return true;
            }
        }
        return false;
    }
}
