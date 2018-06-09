import java.io.*;
import java.util.*;

public class example{
	public static void main(String[] args) {
		System.out.println("Hello");
		int x=0;
		List<String> aList = new ArrayList<String>();
		aList.add("Today");
		aList.add("New Day");
		for(String str:aList){
			System.out.println(str);
		}
	}
}