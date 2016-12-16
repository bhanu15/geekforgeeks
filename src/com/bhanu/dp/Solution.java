package com.bhanu.dp;
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) throws Exception {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scan = new Scanner(System.in);
        
        String inputLength = scan.nextLine();
        
        int length = Integer.parseInt(inputLength);
        int arr[] = new int[length];
        for(int i=0;i<length ;i++){
            arr[i] = Integer.parseInt(scan.nextLine());
        }
        System.out.println(lenghtOfLongestIncreasingSequence(arr));
        
    }
    
    public static int lenghtOfLongestIncreasingSequence(int arr[]){
        int longestIncreasingSequence[] = new int[arr.length];
        int maxLength =1;
        for(int i=0;i<arr.length; i++){
            longestIncreasingSequence[i] =1;
        }
        
        for(int i=1;i<arr.length ;i++){
            for(int j=0;j<i;j++){
                if(arr[i] > arr[j]){
                    longestIncreasingSequence[i] = max(longestIncreasingSequence[i] , longestIncreasingSequence[j]+1);
                    maxLength = max(maxLength ,longestIncreasingSequence[i]);
                }
            }
        }
        return maxLength;
    }
    
    public static int max(int a , int b){
        return a>b? a:b;
    }
}