import java.util.*;

public class Pp {
    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            for(int j=0; j<5; j++) {
                System.out.print("*");
            }System.out.println();
            
        }

System.out.println();
        for (int i = 1; i < 6; i++) {
            for(int j=0; j<5; j++) {
                System.out.print(i+" ");
            }System.out.println();
            
        }
System.out.println();
        for (int i = 1; i < 6; i++) {
            for(int j=1; j<6; j++) {
                System.out.print(j+" ");
            }System.out.println();
            
        }
System.out.println();
        for (int i = 0; i < 5; i++) {//for len n use i<n then i==n-1 and j==n-1 in condition 
            for(int j=0; j<5; j++) {
                if(i==0||i==4||j==0||j==4){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }System.out.println();
            
        }

System.out.println();
int count=1;
        for (int i = 0; i < 5; i++) {
            for(int j=0; j<5; j++) {
                if(count<10){
                    System.out.print("0"+count+" ");
                    count++;
                }else{
                System.out.print(count+" ");
                count++;
                }
            }System.out.println();
            
        }
System.out.println();

        for (int i = 1; i < 6; i++) {
          
            for(int j=1; j<6; j++) {
                
                if(i*j<10){
                    System.out.print("0"+i*j+" ");
                   
                }else{
                System.out.print(i*j+" ");
                
                }
            }System.out.println();
            
        }
System.out.println();

        for (int i = 1; i <6 ; i++) {
          
            for(int j=i; j<i+5; j++) {
                System.out.print(j+" ");
                 }System.out.println();
            
        }
System.out.println();

        for (int i = 0; i <5 ; i++) {
          
            for(int j=0; j<i+1; j++) {
                System.out.print("*"+" ");
                 }System.out.println();
            
        }
System.out.println();

        for (int i = 0; i <5 ; i++) {
          
            for(int j=0; j<i+1; j++) {
                System.out.print(j+1+" ");
                 }System.out.println();
            
        }
System.out.println();

        for (int i = 0; i <5 ; i++) {
          
            for(int j=0; j<i+1; j++) {
                System.out.print(i+1+" ");
                 }System.out.println();
            
        }
System.out.println();

    int n = 5; // Total number of rows

        for (int i = 0; i < n; i++) {
            for(int k=0;k<(n-1)-i;k++){
                System.out.print(" ");
            }

            for(int j=0;j<i+1;j++){
                System.out.print("*");
            }
            System.out.println();
        }
System.out.println();
            
        
        }}
