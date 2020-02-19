package com.mycompany.app;

import java.util.StringTokenizer;

public class ImprovedStringTokenizer extends StringTokenizer {
    public ImprovedStringTokenizer(String str) {
        super(str);
    }

    public ImprovedStringTokenizer(String str, String delim) {
        super(str, delim);
    }

    public ImprovedStringTokenizer(String str, String delim, boolean returnDelims) {
        super(str, delim, returnDelims);
    }

    public String[] allRemainingTokens(){
        int numOfTokens = countTokens();
        String [] allTokens = new String [numOfTokens];
        int i = 0;
        while(hasMoreTokens()){
            allTokens[i] = nextToken();
            i++;
        }
        return allTokens;
    }

}