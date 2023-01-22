package com.labexam.entity;

import java.util.Scanner;

public class Stack 
{
	Scanner sc= new Scanner(System.in);
	int top=-1;
	int n=10;
	int a[]= new int[n];
	void push()
	{
		if(top==(n-1))
		{
			System.out.println("overflow");
		}
		else
		{
			System.out.println("Enter items");
			int i=sc.nextInt();
			top=top+1;
			a[top]=i;
			
		}
	}
	
	void pop()
	{
		if(top==-1)
		{
			System.out.println("undeflow");
		}
		else
		{
			top=top-1;
			System.out.println("Item deleted is="+a[top+1]);
		}
	}
	
	void display()
	{
		System.out.println("items are");
		for(int j=top; j>=0;j--)
		{
			System.out.println(a[j]);
		}
	}
	
}



