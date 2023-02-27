package testForTodays;

public class test2Tpg {

    static boolean checkPalin(String n) {
        n = n.toLowerCase();
        for (int i = 0; i < n.length()/2; i++) {
            if(n.charAt(i)!=n.charAt(n.length()-i-1)){
                return false;
            }
        }
        return true;
    }

    static int countPalin(String str) {
        str = str + " ";
        String word = "";
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch != ' ')
                word = word + ch;
            else {
                if (checkPalin(word))
                    count++;
                word = "";
            }
        }

        return count;
    }

    // Driver code
    public static void main(String args[]) {
        System.out.println(countPalin("Nitin speaks malayalam Abcde eeff  abcba"));
    }
}
