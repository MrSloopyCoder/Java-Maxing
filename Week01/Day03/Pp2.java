import java.util.*;

public class Pp2 {
    public static void main(String[] args) {
        int n=5;
         for (int i = 0; i < n; i++) {
            for(int k=0;k<(n-1)-i;k++){
                System.out.print(" ");
            }

            for(int j=0;j<i+1;j++){
                System.out.print("*"+" ");
            }
            System.out.println();
        }
System.out.println();


 for (int i = 0; i < n; i++) {
            for(int k=0;k<(n-1)-i;k++){
                System.out.print(" ");
            }

            for(int j=0;j<i+1;j++){
                if(j==0||j==i||i==n-1){
                    System.out.print("* ");
                }else{
                System.out.print("  ");

                }
            }
            System.out.println();
        }
System.out.println();
 for (int i = 0; i < n; i++) {
            for(int k=0;k<(n-1)-i;k++){
                System.out.print(" ");
            }

            for(int j=0;j<i+1;j++){
                if(j==0||j==i||i==n-1){
                    System.out.print(j+1+" ");
                }else{
                System.out.print("  ");

                }
            }
            System.out.println();
        }
System.out.println();

 for (int i = 0; i < n; i++) {
           

            for(int j=0;j<i+1;j++){
                if(j==0||j==i||i==n-1){
                    System.out.print(j+1+" ");
                }else{
                System.out.print("  ");

                }
            }
            System.out.println();
        }
System.out.println();

 for (int i = 0; i < n; i++) {
           

            for(int j=0;j<i+1;j++){
                
                    System.out.print(j+1+" ");
                

                
            }
            System.out.println();
        }
System.out.println();

for (int i = 0; i < n; i++) {
           

            for(int j=i;j<n;j++){
                if(i==0||j==i||j==n-1){
                    System.out.print(j+1+" ");
                }else{
                System.out.print("  ");

                }
            }
            System.out.println();
        }
System.out.println();

for (int i = 0; i < n; i++) {
           

            for(int j=i;j<n;j++){
                if(i==0||j==i||j==n-1){
                    System.out.print(j+1+" ");
                }else{
                System.out.print("  ");

                }
            }
            System.out.println();
        }
System.out.println();

for (int i = 0; i < n; i++) {
    for(int j=1;j<(i+1)*2;j++){
        System.out.print("* ");
                
            }
            System.out.println();
        }
System.out.println();

for (int i = 0; i < n; i++) {
    for(int j=1;j<(i+1)*2;j++){
        System.out.print(j+" ");
                
            }
            System.out.println();
        }
System.out.println();

for (int i = 0; i < n; i++) {
    for(int k=0;k<(n-1)-i;k++){
        System.out.print("  ");
    }
    for(int j=1;j<(i+1)*2;j++){
        System.out.print("* ");
                
            }
            System.out.println();
        }
System.out.println();

for (int i = 1; i <= n; i++) {
    int count=1;
    for(int j=1;j<=(2*i)-1;j++){
        if(i>j){
            System.out.print(count++ +" ");
        }else{
            System.out.print(count-- +" ");
        }
        
                
            }
            System.out.println();
        }
System.out.println();

for (int i = 1; i <= n; i++) {
    for(int k=1;k<=n-i;k++){
        System.out.print("  ");
    }
    int count=1;
    for(int j=1;j<=(2*i)-1;j++){
        if(i>j){
            System.out.print(count++ +" ");
        }else{
            System.out.print(count-- +" ");
        }
        
                
            }
            System.out.println();
        }
System.out.println();

for (int i = 1; i <= n; i++) {
    if(i%2==0){
                System.out.print(i+1);
            }
    
    for(int j=1;j<=n;j++){
        System.out.print(i);
            }
            if(i%2!=0){
                System.out.print(i+1);
            }
            System.out.println();
        }
System.out.println();

for (int i = 1; i <= n; i++) {
   
    for(int j=1;j<=i;j++){
        System.out.print(i);
            }
             
           
            System.out.println();
        }


for (int i = n-1; i >= 1; i--) {
   
    for(int j=n-1;j>=n-i;j--){
        System.out.print(i);
            }
             
           
            System.out.println();
        }





    }
}