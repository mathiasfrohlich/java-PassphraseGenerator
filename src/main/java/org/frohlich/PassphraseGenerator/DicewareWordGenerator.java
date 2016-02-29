package org.frohlich.PassphraseGenerator;

import java.util.TreeMap;

/**
 * Created by Ramax on 29/02/2016.
 */
class DicewareWordGenerator {

    public static String generateWord(TreeMap<Integer,String> wordSet){
        Integer wordPossition = 0;

        for (int i = 0; i < 5; i++) {
            int generatedInt = RandomIntGenerator.generateRandomInt();

            wordPossition += (int)Math.pow(10,i) * generatedInt;
        }

        return wordSet.get(wordPossition);
    }
}
