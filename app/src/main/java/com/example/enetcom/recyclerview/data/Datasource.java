package com.example.enetcom.recyclerview.data;
import com.example.enetcom.recyclerview.model.Word;
import java.util.LinkedList;
public class Datasource {
    public Datasource(){}
    public LinkedList loadWords(){
        LinkedList<Word> wordList = new LinkedList<>();
        for (int i = 0; i < 20; i++) {
            wordList.addLast(new Word("Word " + i));
        }
        return wordList;
    }
}
