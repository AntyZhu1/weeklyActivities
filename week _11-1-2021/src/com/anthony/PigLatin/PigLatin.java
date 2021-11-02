package com.anthony.PigLatin;

import java.util.*;

public class PigLatin {
    public static void pigLatin(String input) {
        String[] inputArray = input.split(" ");

        ArrayList<StringBuilder> outArray = new ArrayList<>();
//
//        for (String s : inputArray) {
//            System.err.println(s);
//        }

        int wordNum = 0;

        ArrayList<Character> vowels = new ArrayList<Character>( Arrays.asList('a', 'e', 'i', 'o', 'u'));

        for (String s : inputArray) {
            StringBuilder rearranged = new StringBuilder();
            Boolean startsWithVowel = false;

            int position = 0;


                //First Character is a vowel
                if (position == 0 && vowels.contains(Character.toLowerCase(s.charAt(position)))) {

                    System.err.println(s);


                    startsWithVowel = true;
                    //Is First Word
                    if (wordNum == 0) {
                        rearranged.append(Character.toUpperCase(s.charAt(position)));
                    }
                    else {
                        rearranged.append(s.charAt(position));
                    }
                    position++;
                    while (position < s.length()) {
                        rearranged.append(s.charAt(position));
                        position++;
                    }
                }

                //First Character is a consonant
                else if (position == 0 && !vowels.contains(Character.toLowerCase(s.charAt(position)))) {

                    char firstLetter = s.charAt(position);
//                    System.err.println(firstLetter);

                    position++;
                    Boolean capitalize = true;
                    if (s.length() > 1) {
                        if (wordNum == 0) {
                            rearranged.append(Character.toUpperCase(s.charAt(position)));
                        }
                        else {
                            rearranged.append(s.charAt(position));
                        }
                        position++;
                    }
                    while (position < s.length()) {
                        rearranged.append(s.charAt(position));
                        position++;
                    }
                    rearranged.append(Character.toLowerCase(firstLetter));



                }


                if (startsWithVowel) {
                    rearranged.append("way");
                }
                else {
                    rearranged.append("ay");
                }
//            System.err.println(rearranged);

            outArray.add(rearranged);
            wordNum++;



        }

        ArrayList<Character> punctuation = new ArrayList<>(Arrays.asList(',', '.', '!', '?', ':', ';', '\'', '"', '/'));

        //punctuation checking
        for (StringBuilder s : outArray) {
            for(int i = 0; i < s.length(); i++) {
                if (punctuation.contains(s.charAt(i))) {
                    char addPunctuation = s.charAt(i);
                    s.deleteCharAt(i);
                    s.append(addPunctuation);
                }
            }
            System.out.print(s + " ");
            System.out.println(" ");
        }

    }



}
