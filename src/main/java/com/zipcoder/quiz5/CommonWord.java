package com.zipcoder.quiz5;

import java.util.*;

public class CommonWord {

    /**
     * Read the text and count each word in the text. Return the word and its
     * count in descending order to see what's the common word used in the text.
     * Store the word and its count in an Entry object.
     *
     * @param text
     * @return a list of word and its count in descending order stored in the object entry
     */
    public List<Entry> getCommonWord(String text) {

        String[] array = text.split(" ");

        Map<String, Integer> words = new TreeMap<>();

        Arrays.stream(array).forEach(string -> words.put(string.toLowerCase(), words.get(string.toLowerCase()) != null ? words.get(string.toLowerCase())+1 : 1));

        List<Entry> answer = new ArrayList<>();

        Iterator<String> itr = words.keySet().iterator();

        while (itr.hasNext()) {
            String key = itr.next();
            Integer val = words.get(key);
            answer.add(new Entry(key, val));
        }


        return answer;
    }
}