package com.idogsayswhat.cleannametools.naming;

import static com.idogsayswhat.cleannametools.naming.TokenType.*;

import java.util.*;

public enum NameStyle {


    TYPE0(ADJECTIVE,NOUN),
    TYPE2(ADJECTIVE,NOUN,NUMBERS),
    TYPE3(VERB,NOUN),
    TYPE4(ADVERB,VERB),
    TYPE5(VERB,NUMBERS);


    public static final List<NameStyle> BY_L = new ArrayList();

    static {
        for (NameStyle e: values()) {
            BY_L.add(e);
        }
    }


    public List<TokenType> sequence;

    NameStyle(TokenType... types){
        sequence = Arrays.asList(types);
    }



}
