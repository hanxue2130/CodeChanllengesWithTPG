package com.code.Challenges.HashMap;

import java.util.HashMap;

public class hashmap {
    public static void main(String[] args) {
        int [] nums = {2,2,1,1,1,2,2};
        int result = 0;
        HashMap<Integer,Integer> hm = new HashMap<>();
        for(int i = 0; i < nums.length; i++){
            hm.put(nums[i],hm.getOrDefault(nums[i],0)+1);
        }
        for(Integer i:hm.keySet()){
            if(hm.get(i)> nums.length/2){
                result = i;
            }
        }
        System.out.println(result);
    }
}
