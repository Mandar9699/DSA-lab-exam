package com.labexam.entity;

public class BinarySearch
{
	public int search(int arr[],int start,int end,int element)
	{
		if(start==end)
		{
			if(arr[start]==element)
			{
				return start;
			}
			else 
				return -1;
		}
		
		int mid= (start+end)/2;
		if(element == arr[mid])
			return mid;
		if(element > arr[mid])
			return search( arr,(mid+1), end,  element);
		else
			return search(arr,0, (mid-1),element);
	}
}
