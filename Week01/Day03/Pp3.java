import java.util.*;

public class Pp3 {
    public static void main(String[] args) {
        int n = 5;
        int count = 1;
        for (int i = 0; i < n; i++) {

            for (int j = 0; j <= i; j++) {
                System.out.print(count++ + " ");
            }
            System.out.println();
        }
        System.out.println();

        int countt = 0;
        for (int i = 1; i <= n; i++) {
            countt += i;
            int curr = countt;
            System.out.print(curr + " ");
            for (int j = i + 1; j <= (2 * i) - 1; j++) {
                System.out.print("* ");
                System.out.print(--curr + " ");

            }
            System.out.println();

        }
        System.out.println();

        /*
         * Another Approach
         * for(int i = 1; i <= n; i++)
         * {
         * int count = i * (i + 1) / 2;
         * 
         * for(int j = 1; j <= i; j++)
         * {
         * System.out.print(count--);
         * 
         * if(j <= i - 1)
         * {
         * System.out.print("* ");
         * }
         * }
         * 
         * System.out.println();
         * }
         */
         char alp='A';
        for (int i = 1; i <= n; i++) {

            for (int j = 1; j<=i ; j++) {
                System.out.print(alp +" ");
                
            }alp++;
            System.out.println();

        }
        System.out.println();

        
        for (int i = 1; i <= n; i++) {
            alp='A';
            for (int j = 1; j<=i ; j++) {
                System.out.print(alp +" ");
                alp++;
            }
            System.out.println();

        }
        System.out.println();

        alp='A';
        for (int i = 1; i <= n; i++) {
            
            for (int j = 1; j<=i ; j++) {
                System.out.print(alp +" ");
                alp++;
            }
            System.out.println();

        }
        System.out.println();

        alp='A';
        
        for (int i = 1; i <= n; i++) {
            
            if(i%2!=0){for (int j = 1; j<=i ; j++) {
                System.out.print(alp++ +" ");
                
               
            }
            
            }else{for (int j = i; j>=1 ; j--) {
                System.out.print((char)(alp+j-1) +" ");
                
                
            }alp=(char)(alp+i);
            
            }
            System.out.println();

        }
        System.out.println();



    }
}