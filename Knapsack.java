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
public class Knapsack {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of items");
        int n = sc.nextInt();
        System.out.println("Enter the capacity of the bag");
        float c = sc.nextFloat();
        float w[]  = new float[n];
        float v[]= new float[n];
        for(int i =0; i < n;i++){
            w[i] = (float) Math.floor(Math.random()*20);
        }
        System.out.println("The weights are");
        for(int j = 0; j < n;j++){
            System.out.println(w[j] + "");
        }
        for(int i = 0;i < n;i++){
            v[i] = (float) Math.floor(Math.random()*20);
        }
        System.out.println("The values are ");
        for(int j = 0; j < n;j++){
            System.out.println(v[j] + "");
        }
        System.out.println(knap(w,v,c)); 
        
    }
    static double knap(float wt[],float v[],float c){
        double total = 0;
        int no = wt.length;
        float arr[] = new float[no];
        for(int i = 0;i < no;i++){
            arr[i] = v[i]/wt[i];
        }
        for(int i = 0; i < no;i++){
            for(int j =0; j < no-1;j++){
                if(arr[j] < arr[j+1]){
                   float temp = arr[j];
                   arr[j] = arr[j+1];
                   arr[j+1] = temp;
                   temp = wt[j];
                   wt[j] = wt[j+1];
                   wt[j+1] = temp;
                   temp = v[j];
                   v[j] = v[j+1];
                   v[j+1] = temp;
                }
                
            }
        }
        float arr1[] = new float[no];
        int i = 0;
        while(c > 0){
            if(wt[i] < c){
                c = c - wt[i];
                arr1[i] = wt[i];
                total = total + v[i];
            }
            else if(c < wt[i] && c != 0){
                arr1[i] = c;
                total = total + arr[i]*c;
                c = 0;
            
        }
            i++;
        }
        System.out.println("The sol is");
        for(int k = 0; k < no;k++){
            System.out.println(arr1[k] +"");
            
        }
        return total;
        
        
    }
}
