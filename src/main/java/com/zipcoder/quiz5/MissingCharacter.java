package com.zipcoder.quiz5;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MissingCharacter {

    /**
     * Given a text, return a list of all the characters that are missing from
     * the text. For example, if the text is `abc`, then the missing chars
     * are `defghijklmnopqrstuvwxyz`.
     * @param text
     * @return a list of all the missing characters from the text
     */
    public List<Character> getMissingChars(String text) {

        String alpha = "abcdefghijklmnopqrstuvwxyz";

        String blah = "";

        for(String letter : alpha.split("")){
            if(!text.contains(letter)){
                blah += letter;
            }
        }
        List<Character> answer = new ArrayList();

        char[] c = blah.toCharArray();

        for(char b : c){
            answer.add(b);
        }
        return answer;
    }
}
