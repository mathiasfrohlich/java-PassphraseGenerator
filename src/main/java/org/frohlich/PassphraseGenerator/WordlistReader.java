package org.frohlich.PassphraseGenerator;

import java.io.*;
import java.util.Scanner;
import java.util.TreeMap;

/**
 * Created by Ramax on 29/02/2016.
 */
class WordlistReader {

    public TreeMap<Integer,String> readFile(String fileName){
        TreeMap<Integer, String> words = new TreeMap<Integer, String>();


        try {
        //Get file from resources folder
        ClassLoader classLoader = getClass().getClassLoader();
//        File file = new File(classLoader.getResource(fileName).getFile());


        InputStream file = classLoader.getResourceAsStream(fileName);


            Scanner scanner = new Scanner(file);
            while (scanner.hasNextLine()) {
                String[] splitLine = scanner.nextLine().split("\\t");
                if (splitLine.length == 2) {
                    words.put(Integer.parseInt(splitLine[0]),splitLine[1]);

                }
            }

            scanner.close();

        } catch (Exception e) {
            System.out.println("Not file by name " + fileName);
            System.out.println("Accepted inputs are : diceware or beale, by default beale");
        }

        return words;
    }

}
