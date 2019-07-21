import java.lang.*;
import java.util.*;
import java.io.*;

public class Main
{
	public static void main(String[] args) throws IOException {
		int a;
		BufferedReader input = new BufferedReader (new InputStreamReader (System.in));
		String inputString = input.readLine();
		a = Integer.parseInt(inputString);
		int points = 0;
		int temp = 0;
		for(int i=0; i<a; i++){
		    int b;
		    BufferedReader input1 = new BufferedReader (new InputStreamReader (System.in));
		    String inputString1 = input1.readLine();
		    b = Integer.parseInt(inputString1);
		    
		    if(b<=0){
		        temp = 0;
		    }
		    else
		        temp+=b;
		    if (temp>points)
		    points = temp;
		}
		System.out.println(points);
	}
}

