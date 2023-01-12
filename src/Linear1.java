import java.util.HashMap;

public class Linear1 {
    public static void main(String[] args) {
        String s  = "VishalSingh";
        HashMap<Character,Integer>  fmap = new HashMap<>();
        for (int i = 0; i<s.length(); i++) {
            char ch = s.charAt(i);
            if (fmap.containsKey(ch)){
                fmap.put(ch, fmap.get(ch)+1);
            }
            else{
                fmap.put(ch,1);
            }
        }
        System.out.println(fmap);
    }

}
