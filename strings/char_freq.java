import java.util.*;

class char_freq{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        String s = sc.nextLine();
        int count = 0;

        int n = s.length();
        HashMap<Character, Integer> map = new HashMap<>();
        for(int i=0; i<n; i++){
            
            char ch = s.charAt(i);

            map.put(ch, map.getOrDefault(ch, 0)+1);
        }

        System.out.println(map);
    }
}