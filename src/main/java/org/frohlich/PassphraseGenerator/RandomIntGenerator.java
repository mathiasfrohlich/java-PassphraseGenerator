package org.frohlich.PassphraseGenerator;

import java.util.Random;

/**
 * Created by Ramax on 29/02/2016.
 */
class RandomIntGenerator {

    private static Random random = new Random();

    public static Integer generateRandomInt(){
        return random.nextInt(6) + 1;
    }

}
