package com.idogsayswhat.cleannametools.naming;

import com.idogsayswhat.cleannametools.words.WordPool;

public class Name {


    public String stored;

    public Name(DisplayStyle nameStyle, NameStyle style, WordPool pool){

        StringBuilder builder = new StringBuilder();

        for(var type : style.sequence){
            builder.append( pool.getWord(type));
        }

        stored = nameStyle.applyFunction.apply(builder).toString();


    }

    public String toString(){
        return stored;
    }

}
