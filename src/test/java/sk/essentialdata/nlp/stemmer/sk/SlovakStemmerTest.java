package sk.essentialdata.nlp.stemmer.sk;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * @author Filip Bednárik
 * @since 12. 4. 2016
 */

public class SlovakStemmerTest {
    private static String[] inputs = new String[]{
            "najžľaznatejšieho",
            "zefektívnenie",
            "umožnenie"
    };
    private static String[] outputs = new String[]{
            "žľaznat",
            "zefektívnn",
            "umožnn"
    };

    @Test
    public void testCases() {
        SlovakStemmer slovakStemmer = new SlovakStemmer();
        for (int i = 0; i < inputs.length; i++) {
            char[] wordCharArray = inputs[i].toCharArray();
            int size = slovakStemmer.stem(wordCharArray, wordCharArray.length);
            String stemmed = new String(wordCharArray, 0, size);
            assertEquals(stemmed, outputs[i]);
        }
    }
}
