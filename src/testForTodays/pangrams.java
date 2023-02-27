package testForTodays;

public class pangrams {
    public static void main(String[] args) {
        String a = "We promptly judged antique ivory buckles for the prize";
        System.out.println(pangrams(a));
    }

    public static String pangrams(String s) {
        // Write your code here
        s = s.toLowerCase();
        int store [] = new int [26];
//        Arrays.fill(store, 0);
        for(int i = 0; i < s.length(); i++){
            if(Character.isLetter(s.charAt(i))){
                store[s.charAt(i)-'a'] += 1;
            }
        }
        for(Integer i:store){
            if(i==0){
                System.out.println(store[i]);
                return "not pangram";
            }
        }
        return "pangram";
    }

}
