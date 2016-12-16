package com.bhanu.linklist;
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) throws Exception{
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        
        	Scanner scan = new Scanner(System.in); 
		
		// Read a full line of input from stdin and save it to our variable, inputString.
		String inputString = scan.nextLine(); 
           
                int numberOfInputs = Integer.parseInt(inputString.replaceAll("\\s+",""));
                for(int i=0 ; i< numberOfInputs ;i++){
                    String inputSize = scan.nextLine();
                    String arrayInput = scan.nextLine(); 
                    int arr[]= inputArray(inputSize , arrayInput);   
                    int contiSum = maxContigeousSum(arr);
                    int maxS = maxSum(arr);
                    System.out.print(contiSum+" "+maxS);
                   // System.out.print(maxS)
                }
           
		// Close the scanner object, because we've finished reading 
        // all of the input from stdin needed for this challenge.
		scan.close(); 
        
    }
    
   public static int maxContigeousSum(int array[]){
       
       int maxSum =0;
       int temp = 0;
       
       for(int i=0;i<array.length;i++){
           if(array[i]+temp > maxSum){
               maxSum = array[i]+temp;
               temp = array[i]+temp;
           }else{
               if(array[i]+temp <0){
                   temp = 0;
               }else{
                 temp = array[i]+temp;  
               }
           }
       }
       return maxSum;
   }
    
    public static int maxSum(int array[]){
        int max =-1;
        
        for(int i=1;i<array.length;i++){
            if(array[i]> 0){
                max = max+ array[i];
            }
        }
        return max;
    }
    
    public static int[] inputArray(String size , String input) throws NumberFormatException{
        String inputStringArr[] = input.replaceAll("\\s+","").split(",");
        int inputSize = Integer.parseInt(size.replaceAll("\\s+",""));
        int arr[] = new int[inputSize];
        int count=0;
        for(String s : inputStringArr){
            arr[count] = Integer.parseInt(s);
            count++;
        }
        return arr;
    }
}