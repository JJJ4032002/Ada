/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datastructureex;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Rohan
 */
// Java program for implementation of Heap Sort 
public class Hsort
{ 
	public void sort(int arr[]) 
	{ 
		int n = arr.length; 

	
		for (int i = n / 2 - 1; i >= 0; i--) 
			heapify(arr, n, i); 

		
		for (int i=n-1; i>=0; i--) 
		{ 
		
			int temp = arr[0]; 
			arr[0] = arr[i]; 
			arr[i] = temp; 

			
			heapify(arr, i, 0); 
		} 
	} 

	
	
	void heapify(int arr[], int n, int i) 
	{ 
		int largest = i; 
		int l = 2*i + 1; 
		int r = 2*i + 2; 

		
		if (l < n && arr[l] > arr[largest]) 
			largest = l; 

		
		if (r < n && arr[r] > arr[largest]) 
			largest = r; 

		
		if (largest != i) 
		{ 
			int swap = arr[i]; 
			arr[i] = arr[largest]; 
			arr[largest] = swap; 

			// Recursively heapify the affected sub-tree 
			heapify(arr, n, largest); 
		} 
	} 

	
	static void printArray(int arr[]) 
	{ 
		int n = arr.length; 
		for (int i=0; i<n; ++i) 
			System.out.print(arr[i]+" "); 
		System.out.println(); 
	} 

	
	public static void main(String args[]) 
	{ 
		Scanner sc = new Scanner(System.in);
                System.out.println("Enter the size of the array");
                Random randNum = new Random();
                int n = sc.nextInt();
                int arr[] = new int[n];
                for(int i= 0; i < arr.length;i++){
                    arr[i] = randNum.nextInt();
                }
                


		Hsort ob = new Hsort(); 
		ob.sort(arr); 

		System.out.println("Sorted array is"); 
		printArray(arr); 
	} 
} 

