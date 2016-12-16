import java.io.BufferedReader;
import java.io.InputStreamReader;

//import for Scanner and other utility classes
import java.util.*;


class TestClass {
    public static void main(String args[] ) throws Exception {
        /*
         * Read input from stdin and provide input before running
         * Use either of these methods for input

        //BufferedReader
        */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line = br.readLine();
        int I = Integer.parseInt(br.readLine());
        int J = Integer.parseInt(br.readLine());
        System.out.println(modifiedArray(line , I , J));
		/*
        //Scanner
        Scanner s = new Scanner(System.in);
        int N = s.nextInt();

        for (int i = 0; i < N; i++) {
            System.out.println("hello world");
        }
        */

     //   System.out.println("Hello World!");
    }
    
    public static String modifiedArray(String input , int I , int J){
    	String result ="";
  
    	int i=0;
    	while(i+I+2<input.length()){
    		if(result.equals("")){
    			result = input.substring(i, I+i+2);
    			i = i+I+J+2;
    			continue;
    		}
    			result = result+","+input.substring(i, I+i+2);
    			i = i+I+J+2;
    	}
    	
    	return result;
    }
}
