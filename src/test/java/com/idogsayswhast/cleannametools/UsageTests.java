package com.idogsayswhast.cleannametools;

import com.idogsayswhat.cleannametools.CleanNameTools;
import com.idogsayswhat.cleannametools.naming.TokenType;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class UsageTests {


    @Test
    public void generate10NamesWithoutError(){

        int i =0;
        while(i< 10){
            System.out.println(CleanNameTools.generateRandomCleanName());
            i++;
        }

    }

    @Test
    public void displayHumanReadablePool(){

        System.out.println( CleanNameTools.wordPool.toString() );

    }

    @Test
    /***
     * Go through 100,000 iterations to ensure 'null' never returns.
     */
    public void wordPoolNeverGeneratesNull(){

        for(var type : TokenType.values()){
            System.out.println(type);

            for(int i = 0; i < 100000; i++){
                String word = CleanNameTools.wordPool.getWord(type);
                Assertions.assertTrue(word != null,"The word pool must NOT generate null.");
                Assertions.assertTrue(!word.equals("null"),"The word pool must NOT generate null.");
            }

        }

    }

}
