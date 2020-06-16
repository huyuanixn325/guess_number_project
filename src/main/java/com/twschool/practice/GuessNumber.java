package com.twschool.practice;

import java.util.List;

public class GuessNumber {
    public String count(List<String> userAnswerList,String gameAnswer) {
        int sameCount = countSameNumber(userAnswerList,gameAnswer);
        int sameSpaceNumber=countSameSpanceNumber(userAnswerList,gameAnswer);
        return formatOutPut(sameCount,sameSpaceNumber);
    }

    public int countSameNumber(List<String> guestNumberList,String gameAnswer){
        int sameCount = 0;
        //System.out.println(answer.contains(guestNumberList.get(2)));
        for(String s:guestNumberList) {
            if(gameAnswer.contains(s)) {
                sameCount ++;
            }
        }
        return sameCount;

    }

    public int countSameSpanceNumber(List<String> guessNumberList,String gameAnswer){
        int sameSpaceNumber = 0;
        for(int i = 0;i<gameAnswer.length();i++){
            if (String.valueOf(gameAnswer.charAt(i)).equals(guessNumberList.get(i))){
                sameSpaceNumber++;
            }
        }
        return sameSpaceNumber;
    }

    public String formatOutPut(int sameCount,int sameSpaceNumber){
        String output = sameSpaceNumber+"A"+(sameCount-sameSpaceNumber)+"B";
        if (sameSpaceNumber ==0 && (sameCount-sameSpaceNumber)==4) return output+"   4 numbers position wrong";
        if (sameSpaceNumber ==4 && (sameCount-sameSpaceNumber)==0) return output+"   win, all correct";
        if (sameSpaceNumber ==0 && (sameCount-sameSpaceNumber)==0) return output+"   all wrong";
        if ((sameCount-sameSpaceNumber)==0) return output+" "+sameSpaceNumber+" correct";
        if (sameSpaceNumber==0) return output+" "+(sameCount-sameSpaceNumber)+" and 4 wrong position";
        if (sameSpaceNumber >0 && (sameCount-sameSpaceNumber)>0) return output+"  4 correct，2 and 3 wrong position";
        return output;
    }
}
