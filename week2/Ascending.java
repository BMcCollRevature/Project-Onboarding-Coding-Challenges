package com.po.week2;

import java.util.ArrayList;
import java.util.List;

public class Ascending {
    public static boolean ascending(String numbers){

        for (int i = 1; i <= numbers.length() /2; i++){
            boolean consecutive = true;
            List<Integer> num = new ArrayList<>();
            for(int j =0; j<numbers.length(); j+=i){
                num.add(Integer.parseInt(numbers.substring(j, Math.min(j+i, numbers.length()))));
            }
            int lastNum = num.get(0);
            for(int j = 1; j<num.size(); j++){
                if(num.get(j) -1 == lastNum ){
                    lastNum++;
                }
                else{
                    consecutive = false;
                }
            }
            if(consecutive) {
                System.out.println("true");
                return true;
            }
        }

        return false;
    }
    public static void main(String[] args) {
        ascending("2324256");
    }
}
