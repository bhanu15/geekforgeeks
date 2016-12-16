
public class MissingNumber {

	public static int size = 10;
	public static boolean input[] = new boolean[size];
	public static void insert(int key){
		input[key-1] =true;
	}
	
	public static int missingNumberIndex(){
		for(int i =0 ;i < size ;i++){
			if(!input[i])
				return i+1;
		}
		return -1;
	}
	
	public static void main(String[] args) {
		int arr[] ={1, 2, 4,  6, 3, 7, 8};
		size = arr.length;
		input = new boolean [size+1];
		for(int key : arr){
			insert(key);
		}
		System.out.println(missingNumberIndex());
	}
}
