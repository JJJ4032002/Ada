/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datastructureex;

/**
 *
 * @author Rohan
 */
public class SortTypes {
    
    public static void main(String[] args) {
       int arr[] = {2,33,12,11,35,52,16};
       selection(arr);
       print(arr);
        System.out.println("---------------");
       Bubble(arr);
       print(arr);
       insertion(arr);
       print(arr);
       
    }
    static void Bubble(int arr[]){
        for(int i = 0; i < arr.length-1;i++){
        for(int j = i+1; j < arr.length;j++){
            if(arr[j] < arr[i]){
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                
            }
        }
        }
      
        
    }
    static void selection(int arr[]){
        for(int i = 0; i < arr.length-1;i++){
            int min = i;
            for(int j = i+1 ;j <arr.length;j++){
                if(arr[j] < arr[min]){
                    min = j;
                }
                
            }
            int temp = arr[i];
                arr[i] = arr[min];
                arr[min] = temp;
        }
    }
    static void insertion(int arr[]){
        for(int i = 1; i <arr.length;i++){
            int key = arr[i];
            int j = i-1;
            while(j >= 0 && key < arr[j]){
                arr[j+1] = arr[j];
                j = j-1;
            }
            arr[j+1] = key;
        }
    }
    static void print(int arr[]){
        for(int i = 0 ; i <arr.length;i++){
            System.out.println(arr[i]+"");
        }
    }
    
}
