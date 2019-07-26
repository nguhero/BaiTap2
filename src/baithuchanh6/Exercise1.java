package baithuchanh6;

import java.util.ArrayList;

public class Exercise1 {
public static void main(String[] args) {
	ArrayList al=new ArrayList<>();
	al.add(12);
	al.add(new Float(13));
	al.add(true);
	al.add("as");
	for(int i=0;i<al.size();i++){
		System.out.println(al.get(i));
	}
}
}
