import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int[] a = new int[10];
		List<Integer> even = new ArrayList<Integer>();
		List<Integer> odd = new ArrayList<Integer>();
		for(int i=0;i<10;i++){
		a[i]=in.nextInt();
		}
		for(int i=0;i<10;i++){
		if(a[i]%2==0){
			even.add(a[i]);
		}else odd.add(a[i]);
		}
		Collections.sort(even);
		Collections.sort(odd, Collections.reverseOrder());
		
		for(int i : even){
			System.out.print(i + " ");
		}
		System.out.println();
		for(int i : odd){
			System.out.print(i + " ");
		}in.close();


	}

}