package com.codecool.whattoprint;

class Challenge {
    public static String decideAndSay(String[] words, int number) {
        number=Math.abs(number);
        if((number%3==0)&&(number%7==0)){
            String returnConcatString="";
            returnConcatString +=words[0];
            returnConcatString +=words[1];
            return returnConcatString;
        }
        if(number%3==0){
            return words[0];
        }
        if(number%7==0){
            return words[1];
        }
        return "";
    }
}
