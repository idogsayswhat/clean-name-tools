package com.idogsayswhat.cleannametools;

import com.idogsayswhat.cleannametools.naming.DisplayStyle;
import com.idogsayswhat.cleannametools.naming.Name;
import com.idogsayswhat.cleannametools.naming.NameStyle;
import com.idogsayswhat.cleannametools.words.WordPool;

public class CleanNameTools {

    public static WordPool wordPool = new WordPool();

    public static String generateRandomCleanName(){


        return new Name(DisplayStyle.NO_CHANGE, NameStyle.BY_L.get((int) (Math.random() *NameStyle.BY_L.size())),wordPool).toString();

    }
}
