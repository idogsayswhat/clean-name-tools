package com.idogsayswhast.cleannametools;

import com.idogsayswhat.cleannametools.CleanNameTools;
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

}
