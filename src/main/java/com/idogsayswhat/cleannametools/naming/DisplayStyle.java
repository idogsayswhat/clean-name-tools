package com.idogsayswhat.cleannametools.naming;

import java.util.function.Function;

public enum DisplayStyle {


    NO_CHANGE((str) -> str);
    //SPONGEBOB((str)->str.chars().);

    DisplayStyle(Function<StringBuilder,StringBuilder> applyFunction){
        this.applyFunction = applyFunction;
    }
    Function<StringBuilder,StringBuilder> applyFunction;
}
