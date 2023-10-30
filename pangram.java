import java.util.*;
public class pangram{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        String str = in.nextLine();
        int[] freq = new int[26];
        for(int i = 0; i<str.length(); i++){
            char c = str.charAt(i);
            if(c>='a' && c<='z'){
                int idx = c-'a';
                freq[idx]++;
            }
        }
        for(int i = 0; i<26; i++){
            if(freq[i] == 0){
                System.out.println("Not Pangram");
                return;
            }
        }
        System.out.println("Pangram");
    }
}