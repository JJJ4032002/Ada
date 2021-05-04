/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datastructureex;
import java.util.Scanner;
/**
 *
 * @author Rohan
 */
public class JobSequencing {
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of jobs");
        int n = sc.nextInt();
       
        int d[]  = new int[n];
        int p[]= new int[n];
        String s[] = new String[n];
        System.out.println("Enter the names of the job");
        for(int i = 0;i < n ;i++){
            String name = sc.next();
            s[i] = name;
        }
        System.out.println("The jobs are");
        for(int i =0 ;i < n;i++){
            System.out.println(s[i] + "");
        }
        for(int i =0; i < n;i++){
            d[i] = (int) Math.floor(Math.random()*(10-1+1)+1);
        }
        System.out.println("The deadlines are");
        for(int j = 0; j < n;j++){
            System.out.println(d[j] + "");
        }
        for(int i = 0;i < n;i++){
            p[i] = (int) Math.floor(Math.random()*(50-10+1)+10);
        }
        System.out.println("The values are ");
        for(int j = 0; j < n;j++){
            System.out.println(p[j] + "");
        }
        sequencing(s,d,p,n);
    }
    
    static void sequencing(String [] s,int d[],int p[],int n){
        for(int i = 0;i < n-1;i++){
            for(int j = i+1;j < n;j++){
                if(p[i] < p[j]){
                    int temp = p[i];
                    p[i] = p[j];
                    p[j] = temp;
                    
                     temp = d[i];
                     d[i] = d[j];
                     d[j] = temp;
                     
                     String temp1 = s[i];
                     s[i] = s[j];
                     s[j] = temp1;
                }
            }
        }
        System.out.println("Sorted job names are");
        for(int i = 0;i < n;i++){
            System.out.println(s[i] + "");
        }
        System.out.println("sorted dead lines are");
        for(int i = 0;i <n;i++){
            System.out.println(d[i] + "");
            
        }
        System.out.println("sorted profits  are ");
        for(int i = 0; i < n;i++){
        System.out.println(p[i] + "");
        }  
        
        System.out.println("For max profits the sequence is");
        int fin[] = new int[n];
        int maxpr = 0;
        int Count = 0;
        while(Count < n){
        for(int i = n;i > -1;){
            if(d[i] == i || d[i] < i){
               fin[i] = d[i];
               maxpr = maxpr + p[i];
               Count++;
            }
        }
        }
        System.out.println("The fin sequence is");
        for(int i =0 ;i < n;i++){
            System.out.println(fin[i] + "");
        }
        System.out.println("The profit is" +maxpr);
        
    }
}
