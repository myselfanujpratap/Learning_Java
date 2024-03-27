import java.util.*;
public class S14 {

    // int calculatesum(int p, int q){

    //     int Sum = p+q;
    //     System.out.println(Sum);
    //     return Sum;
    // }
    // public static void main(String[] args) {
    //     Scanner in = new Scanner(System.in);

    //     int a = in.nextInt();
    //     int b = in.nextInt();
    //     s14 obj = new s14();
    //     obj.calculatesum(a,b);
   // }

//    static int fib(int n){

//     if(n<=1){

//         return n;
//     }
//     return fib(n-1) + fib(n-2);
//    }

//    public static void main(String[] args) {
//     Scanner in = new Scanner(System.in);
//     System.out.println("enter ");
//     int n = in.nextInt();
     
//     for(int i =0; i<=n; i++){
//         System.out.println(fib(i)+" ");
//     }
    
//    }

    //  static int factorial(int n){
    //     int fact =1;
    //     for(int i=1; i<=n; i++){
    //         fact = fact*i;
    //         System.out.println(fact);
    //     }
    //     return fact;
    // }

    // static int bino_coff(int n, int r){
    //     int factn = factorial(n);
    //     int factr = factorial(r);
    //     int nmr = factorial(n - r);

    //     int bino_coff = factn/(factr*(factn - factr));
    //     System.out.println(bino_coff);

    //     return bino_coff;
    // }
    // public static void main(String[] args) {

    //     System.out.println("binomial coefficient = "+ bino_coff(5,2));
        
    // }

    static void binTodec(int binnum){
        int pow =0;
        int decnum=0;

        while(binnum > 0){
            int lastdigit = binnum%10;

            decnum = decnum + (int)(lastdigit*Math.pow(2, pow));
            pow++;

            binnum = binnum/10;
        }
        System.out.println(binnum +" "+decnum);
        }
    public static void main(String[] args) {
        binTodec(111);
        
    }
}

