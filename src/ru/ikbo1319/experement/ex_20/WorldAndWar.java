package ru.ikbo1319.experement.ex_20;

import java.io.File;
import java.io.IOException;
import java.util.*;

public class WorldAndWar {
    public static void tenWords(File novel) throws IOException {
        Scanner scanner = new Scanner(novel);
        HashMap<String,Integer> searchWords = new HashMap<>();
        while (scanner.hasNextLine()){
            String scanLine = scanner.nextLine();
            searchByLines(scanLine, searchWords);
            try {
                scanLine = scanner.nextLine();
            }catch (Exception e){
                break;
            }
            searchByLines(scanLine, searchWords);
        }
        List<Map.Entry<String, Integer>> words = new ArrayList<>(searchWords.entrySet());
        words.sort(Map.Entry.comparingByValue());
        Collections.reverse(words);
        for(int i = 0; i < 10; i++){
            System.out.print((i+1) + ". " + words.get(i).getKey() + " " + words.get(i).getValue());
        }

    }
    public static void searchByLines(String scanLine, HashMap<String,Integer> searchWords){
        if (!scanLine.isEmpty()) {
            String[] wordsOfLine = scanLine.split(" ");
            for (String word : wordsOfLine) {
                word = word.replaceAll("[^a-zA-ZА-Яа-яёЁ]", "");
                word = word.toLowerCase();
                if (!word.isBlank() & !word.isEmpty()) {
                    if (searchWords.containsKey(word)) {
                        int tmp = searchWords.get(word);
                        searchWords.put(word, tmp + 1);
                    } else {
                        searchWords.put(word, 1);
                    }
                }
            }
        }
    }


    public static void main(String[] args) throws IOException{
        File novel = new File("C://Users//Бабушка//IdeaProjects//untitled1//src//ru//ikbo1319//experement//ex_20//World_and_War_text.txt");
        if (novel.exists()) {
            tenWords(novel);
        }
        else {
            System.out.println("Don't exists");
        }
    }
}
