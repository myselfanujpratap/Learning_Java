import java.util.*;
public class S12 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
    //     int n = in.nextInt();

    //     boolean isprime = true;

    //     if(n ==2){
    //         System.out.println("n is prime");
    //     }
    //     else {

    //     for(int i =2; i<=n-1; i++){
    //         if(n%i == 0){
    //             isprime = false;
    //         }
    //     }
    //     if(isprime == true){
    //         System.out.println("n is prime");
    //     }
    //     else {
    //         System.out.println("n is not prime");
    //     }
    // }

    // for(int i=0; i<5; i++){
    //     System.out.println("HELLO");
    //     i+=2;
    // }
    int n = in.nextInt();
    int fact = 1;
    for(int i=1; i<=n; i++){
        fact *= i;
        System.out.println(fact);
    }
    }  
}

