package com.company;

import java.util.ArrayList;
import java.util.Arrays;

public class Runner {

    public static void main(String[] args) {
        ArrayList animalArr = new ArrayList(Arrays.asList("cat", "mouse", "dog", "dog", "panda"));
        WordList animals = new WordList(animalArr);
        System.out.println(animals.numWordsOfLength(4));
        System.out.println(animals.numWordsOfLength(3));
        System.out.println(animals.numWordsOfLength(2));

        animals.removeWordsOfLength(4);
        System.out.println(animals);
        animals.removeWordsOfLength(3);
        System.out.println(animals);
        animals.removeWordsOfLength(2);
        System.out.println(animals);
    }
}