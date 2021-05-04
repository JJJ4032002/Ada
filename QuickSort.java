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
class QuickSort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of the array");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter the elements into the array");
        for(int i = 0 ; i < n;i++){
            int b = sc.nextInt();
            arr[i] = b;
        }
        
        sort(arr,0,n-1);
        printArr(arr);
    }
    static void sort(int arr[],int low,int high){
        if(low < high){
          int  pi = partition(arr,low,high);
          sort(arr,low,pi-1);
          sort(arr,pi+1,high);
        }
    }
    static int partition(int arr[],int low, int high){
        int i = low-1;
        int temp = 0;
        int pivot = arr[high];
        for(int j = 0; j < high-1;j++){
            if(arr[j] < pivot){
                i++;
                temp = arr[j];
                arr[j] = arr[i];
                arr[i] = temp;
                
            }
        }
        temp = arr[high];
        arr[high] = arr[i+1];
        arr[i+1] = temp;
        return i+1;
    }
    static void printArr(int arr[]){
        System.out.println("The result is");
        for(int i = 0 ; i < arr.length;i++){
            System.out.println(arr[i]);
        }
    }
    }
      

      


  
