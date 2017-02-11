package com.example.demon.tarea1;

import android.text.InputFilter;
import android.text.Spanned;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by DEMON on 24/01/2017.
 */

public class FiltroDecimal implements InputFilter {

    Pattern mPattern;

    public FiltroDecimal() {
        mPattern=Pattern.compile("[0-9]{0," + (3) + "}+((\\.[0-9]{0," + (0) + "})?)||(\\.)?");
    }

    @Override
    public CharSequence filter(CharSequence source, int start, int end, Spanned dest, int dstart, int dend) {

        Matcher matcher=mPattern.matcher(dest);
        if(!matcher.matches())
            return "";
        return null;
    }


}
