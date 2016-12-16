
public class Swap {

	public static void main(String[] args) {
		int arr[] = {1,2,3};
		swap(arr , 0,2);
		System.out.println(arr[0]);
		System.out.println(arr[2]);
	}
	public static void  swap(int arr[] , int i , int j){
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}
}
