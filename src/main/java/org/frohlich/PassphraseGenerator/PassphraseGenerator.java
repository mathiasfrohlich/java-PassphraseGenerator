package org.frohlich.PassphraseGenerator;

import java.util.ArrayList;
import java.util.List;
import java.util.TreeMap;

/**
 * Created by Ramax on 29/02/2016.
 */
public class PassphraseGenerator {

    public static List<String> generatePassphrase(int wordAmount, String fileName){
        List<String> passPhrase = new ArrayList<String>();

        TreeMap<Integer,String> wordSet = new WordlistReader().readFile(fileName);

        for (int i = 0; i < wordAmount; i++) {
            String generatedWord = DicewareWordGenerator.generateWord( wordSet );
            if(generatedWord != null)
                passPhrase.add(generatedWord) ;
        }

        return passPhrase;
    }
}
