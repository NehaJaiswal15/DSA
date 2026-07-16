import java.util.*;

class reverse_words{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        String s = sc.nextLine();

        int n = s.length();
        int i = n-1;

        StringBuilder sb = new StringBuilder();

        while(i >= 0){
            while(i >= 0 && s.charAt(i) == '.'){
                i--;
            }

            if(i<0) break;

            int j = i;

            while(i >= 0 && s.charAt(i) != '.'){
                i--;
            }

            if(sb.length() > 0){
                sb.append('.');
            }

            sb.append(s.substring(i+1, j+1));

        }
        System.out.print(sb.toString());
        
    }
}