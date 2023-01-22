package com.labexam.entity;

import java.util.Scanner;


public class BinarySearchMain
{	
	public static void main(String[] args) 
	{
		BinarySearch obj= new BinarySearch();
		int arr[]= { 15 , 32 , 24, 67 ,49,10};
		int end,element;
		end= arr.length-1;
		Scanner sc= new Scanner (System.in);
		System.out.println("enter element to search=");
		int num= sc.nextInt();
		//int x= obj.search(arr, 0, end, num);
		
		//int x= obj.search(arr, 0, end,num);
		int x= obj.search(arr, 0, end, num);
		System.out.println("index="+x);
		if(x>=0)
		{
			System.out.println("element at position="+(x+1));
		}
		else
		{
			System.out.println("element not found");
		}
		
	}
	

}
