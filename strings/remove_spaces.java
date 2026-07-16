import java.util.*;

class remove_spaces{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        String s = sc.nextLine();

        int n = s.length();

        StringBuilder sb = new StringBuilder();

        for(int i=0; i<n; i++){
            if(s.charAt(i) != ' '){
                sb.append(s.charAt(i));
            }
        }

        System.out.println(sb.toString());
    }
}