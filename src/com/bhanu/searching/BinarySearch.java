package com.bhanu.searching;

public class BinarySearch {

	static int arr[] = {4,4,5,5,6,6,7,7,0,0,1,1,2,2};
	public static int binarySearch(int start , int end , int k){
		if(end >start){
		int mid = (start + end)/2;
		
		if(arr[mid] == k){
			return mid;
		}
		
		if(arr[mid] > k){
			end = mid;
		}else{
			start = mid+1;
		}
		return binarySearch(start , end , k);
		}
		
		return -1;
	}
	public static void main(String[] args) {
//		System.out.println(binarySearch(0, arr.length -1 , 3));
		int pivot =findPivot(0, arr.length -1);
		System.out.println(" pivot "+pivot);
		System.out.println(arr[pivot]);
		System.out.println(binarySearch(0, pivot , 5));
		System.out.println(binarySearch(pivot+1, arr.length -1 , 5));
		
	}
	
	
	public static int findPivot(int start , int end){
		if(arr[start] < arr[end]){
			return start;
		}
		if(start < end){
			int mid = (start+ end )/2;
			if( arr[mid] > arr[mid+1]){
				return mid +1;
			}
			
			if(arr[start] > arr[mid] ){
				return findPivot(start , mid);
			}else{
				return findPivot(mid+1 , end);
			}
			
		}
		return -1;
	}
	
}
