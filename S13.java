import java.util.*;
public class S13 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        // char ch = 'A';
        // for(int i =1 ; i<=4; i++){
        //     for(int j=1; j<=i; j++ ){
        //         System.out.print(ch);
        //         ch++;
        //     }
        //     System.out.println();
        // }

        // for(int i = 1; i<=4; i++){
        //     for(int j = 1; j<=i; j++){
        //         System.out.print(j);
        //     }
        //     System.out.println();
        // }

        for(int i = 4; i>=1; i--){
            for(int j =i; j>=1; j--){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}

