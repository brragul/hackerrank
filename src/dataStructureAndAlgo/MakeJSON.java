package dataStructureAndAlgo;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MakeJSON {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		List<String> li = new ArrayList<String>();
		int i=0;
		while(i<25){
			li.add(sc.nextLine());
			i++;
		}
		StringBuilder out = new StringBuilder();
		for (String s : li) {
			String[] a = s.trim().split("<-->");
			out.append("\""+a[0].trim()+"\":\""+a[1].trim()+"\",");
		}
		System.out.println(out);
	}

}
