package home_ques.hashmap;

import java.util.HashMap;

public class HM {
    public static void frequencyMap(String str){
        HashMap<Character, Integer> hmap = new HashMap<>();
        for(int i=0; i<str.length(); i++){
            char ch = str.charAt(i);
            hmap.put(ch, hmap.getOrDefault(ch,0)+1);
        }
        System.out.println(hmap);
    }
    public static void main(String[] args) {

        frequencyMap("aaajwjbdjwb");
    }
}
