package com.idogsayswhat.cleannametools.words;

import com.idogsayswhat.cleannametools.naming.TokenType;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class WordPool {


    private Map<TokenType,List<String>> pool = new HashMap<>();


    /***
     * Create a default word pool
     */
    public WordPool(){
        //Load from resources on classpath
        fillMap();
        loadDefaultMap(TokenType.NOUN,"nouns");
        loadDefaultMap(TokenType.ADJECTIVE,"adjectives");
        loadDefaultMap(TokenType.ADVERB,"adverbs");
        loadDefaultMap(TokenType.VERB,"verbs");
    }

    private void loadDefaultMap(TokenType type,String file) {
        var reader =new BufferedReader(new InputStreamReader(this.getClass().getClassLoader().getResourceAsStream(file)));
        String line = null;
        try {
            line = reader.readLine();
        } catch (IOException exception) {
            exception.printStackTrace();
        }
        while(line != null){
            try {
                pool.get(type).add(line);
                line = reader.readLine();
            } catch (IOException exception) {
                exception.printStackTrace();
                break;
            }

        }
    }

    /***
     * Use a specific list of words for each list in the word pool
     */
    public WordPool(List<String> nouns,List<String> adjectives,List<String> verbs,List<String> adverbs){
        fillMap();

        pool.get(TokenType.NOUN).addAll(nouns);
        pool.get(TokenType.ADJECTIVE).addAll(adjectives);
        pool.get(TokenType.ADVERB).addAll(adverbs);
        pool.get(TokenType.VERB).addAll(verbs);


    }

    private void fillMap(){
        for (var type : TokenType.values()){
            pool.put(type,new ArrayList<>());
        }
        for(int i=0; i <10;i++){
            pool.get(TokenType.NUMBERS).add(String.valueOf(i));
        }
    }

    public String getWord(TokenType type) {
        return pool.get(type).get((int) (Math.random()* pool.get(type).size()));
    }

    public String toString(){
        StringBuilder builder = new StringBuilder();

        for(var entry : pool.entrySet()){
            builder.append(entry.getKey().toString()+":\n");

            for(var val : entry.getValue()){
                builder.append(val+",");
            }
            builder.append("\n");
        }
        return builder.toString();
    }
}
