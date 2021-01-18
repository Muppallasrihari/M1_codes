import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class ArrayListOps {
	public static ArrayList<Integer> makeArrayListInt(int n){
		ArrayList<Integer> list = new ArrayList<Integer>();
		for(int j=0 ; j<n;j++) {
			list.add(0);
		}
		return list;
	}
	public ArrayList<Integer> reverseList(ArrayList<Integer> list) {
		
		Collections.reverse(list);
		return list;
	}
	public static ArrayList<Integer> changeList(ArrayList<Integer> list , int m , int n){
		for(int num:list) {
			Collections.replaceAll(list, m, n);
		}	
		return list;	
	}

	public static void main(String[] args) {
		
   
		ArrayList<Integer> list = new ArrayList<Integer>(Arrays.asList(10,25,33,28,20,12));
		ArrayListOps ar=new ArrayListOps();
       System.out.println(ar.makeArrayListInt(4));
       System.out.println(ar.reverseList(list));
       System.out.println(ar.changeList(list, 28, 20));
	}

}
