import java.util.*;

class prime_number{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();

        if(num <= 1){
            System.out.println(false);
            return;
        }

        for(int i=2; i*i<=num; i++){ //for(int i=2; i<=Math.sqrt(num); i++)
            if(num%i == 0) {
                System.out.println(false);
                return;
            }    
        }
        
        System.out.println(true);
    }
}

