import java.util.*;

class count_vowels{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        String s = sc.nextLine();

        int n = s.length();
        
        int count = 0;
        char[] ch = s.toCharArray();

        for(int i=0; i<n; i++){
            if(ch[i] == 'a' || ch[i] == 'e' || ch[i] == 'i' || ch[i] == 'o' || ch[i] == 'u'){
                count++;
            }
        }

        System.out.println(count);
        
    }
}