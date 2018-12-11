package jliu2882;

import java.util.ArrayList;

public class Digits {
    private ArrayList<Integer> digitList;

    public Digits(int num){
        this.digitList = new ArrayList<>();
        String nums = String.valueOf(num);
        for(int i =0 ; i < nums.length();i++){
            digitList.add(Integer.parseInt(nums.substring(i,i+1)));
        }
    }

    public boolean isStrictlyIncreasing(){
        int temp  = 0;
        for(int i= 0; i < digitList.size();i++){
            if(digitList.get(i)>temp){
                temp = digitList.get(i);
            }
            else{
                return false;
            }
        }
        return true;
    }

    public String getDigitList(){
        String result = "[";
        for(int i = 0; i < digitList.size();i++){
            result+= digitList.get(i) + ", ";
        }
        return result.substring(0,result.length()-2) + "]";
    }
}
