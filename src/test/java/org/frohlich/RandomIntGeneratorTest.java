package org.frohlich;

import org.frohlich.PassphraseGenerator.RandomIntGenerator;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

/**
 * Created by Ramax on 29/02/2016.
 */
public class RandomIntGeneratorTest {

    @Test
    public void testGenerateRandomInt() throws Exception {
        int randomInt = RandomIntGenerator.generateRandomInt();
        assertTrue(0 < randomInt);
        assertTrue(7 > randomInt);
    }

    @Test
    public void testRandomIntSpread() throws Exception {
        int checkAmount = 100000;
        Double errorMarginPercent = 0.05;

        List<Integer> integers = new ArrayList<Integer>();

        for (int i = 0; i < checkAmount; i++) {
            integers.add(RandomIntGenerator.generateRandomInt());
        }

        int amountOfOnes = 0;
        int amountOfTwos = 0;
        int amountOfThrees = 0;
        int amountOfFours = 0;
        int amountOfFives = 0;
        int amountOfSixs = 0;

        for (Integer generatedInt : integers) {
            if (generatedInt.equals(1))
                amountOfOnes ++;
            if (generatedInt.equals(2))
                amountOfTwos ++;
            if (generatedInt.equals(3))
                amountOfThrees ++;
            if (generatedInt.equals(4))
                amountOfFours ++;
            if (generatedInt.equals(5))
                amountOfFives ++;
            if (generatedInt.equals(6))
                amountOfSixs ++;
        }
        System.out.println("amountOfOnes = " + amountOfOnes);
        System.out.println("amountOfTwos = " + amountOfTwos);
        System.out.println("amountOfThrees = " + amountOfThrees);
        System.out.println("amountOfFours = " + amountOfFours);
        System.out.println("amountOfFives = " + amountOfFives);
        System.out.println("amountOfSixs = " + amountOfSixs);

        int averageAmount = (amountOfOnes + amountOfTwos + amountOfThrees + amountOfFours + amountOfFives + amountOfSixs)/6;

        System.out.println("averageAmount = " + averageAmount);

        int errorMargin = (int)(averageAmount * errorMarginPercent);

        System.out.println("errorMargin = " + errorMargin);

        assertTrue(amountOfOnes > averageAmount - errorMargin);
        assertTrue(amountOfOnes < averageAmount + errorMargin);

        assertTrue(amountOfTwos > averageAmount - errorMargin);
        assertTrue(amountOfTwos < averageAmount + errorMargin);

        assertTrue(amountOfThrees > averageAmount - errorMargin);
        assertTrue(amountOfThrees < averageAmount + errorMargin);

        assertTrue(amountOfFours > averageAmount - errorMargin);
        assertTrue(amountOfFours < averageAmount + errorMargin);

        assertTrue(amountOfFives > averageAmount - errorMargin);
        assertTrue(amountOfFives < averageAmount + errorMargin);

        assertTrue(amountOfSixs > averageAmount - errorMargin);
        assertTrue(amountOfSixs < averageAmount + errorMargin);


    }

}