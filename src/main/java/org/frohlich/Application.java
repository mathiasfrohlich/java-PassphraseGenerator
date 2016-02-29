package org.frohlich;

import org.frohlich.PassphraseGenerator.PassphraseGenerator;

import java.util.List;

/**
 * Created by Ramax on 29/02/2016.
 */
class Application {

    private static Integer wordsAmount = 5;
    private static String fileIndicator =  "beale";

    public static void main(String[] args) {

        if (args.length > 0)
            wordsAmount = Integer.parseInt(args[0]);
        if (args.length > 1)
            fileIndicator = args[1];


        List<String> passPhrase = PassphraseGenerator.generatePassphrase(wordsAmount,fileIndicator + ".wordlist.asc.txt");


        if (passPhrase.size() > 0) {
            System.out.println("Your generated passphrase :");
            for (String word : passPhrase)
                System.out.print(word + " ");
        }


    }

}
