
public class Test {

	public static void main(String[] args) {
		int arr[] = {1,2,3,4,5};
		int result[] = subArray(arr , 1,6);
		if(result == null){
			throw new NullPointerException("array is null ");
			
		}
		for(int i: result){
			System.out.println(" i "+i);
		}
	}
	
	public static int[] subArray(int input[] , int start , int end){
		
		if(start > end || end > input.length)
		return null;
		int result[] = new int[end-start];
		for(int i= start, j=0 ; i<end ;i++,j++){
			result[j] = input[i];
		}
		return result;
	}
}
