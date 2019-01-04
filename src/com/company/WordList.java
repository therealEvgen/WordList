package com.company;

import java.util.ArrayList;

public class WordList {
    private ArrayList<String> myList;

    public WordList(ArrayList animalArr) {
        myList = animalArr;
    }

    public int numWordsOfLength(int len) {
        int x = 0;
        for (int i = 0; i < myList.size(); i++) {
            if (myList.get(i).length() == len)
                x++;
        }
        return x;
    }

    public void removeWordsOfLength(int len) {
        for (int i = myList.size()-1; i >= 0; i--) {
            if (myList.get(i).length() == len)
                myList.remove(i);
        }
    }

    public String toString() {
        String x = "";
        for (int i = 0; i < myList.size(); i++) {
            x += myList.get(i) + " ";
        }
        return x;
    }
}