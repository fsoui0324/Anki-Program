import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Main{
	public static Random rnd;
	public static int rnd_num;
	public static List<String> list;

	public static void main(String[] args) throws Exception{
		rnd=new Random();
		rnd_num=rnd.nextInt(60);
		list=new ArrayList<>();

		for(int i=1;i<=20;i++){
			list.add(String.valueOf(i));
		}

		list.add("");

		int c;

		while(!list.isEmpty()){
			while((c=System.in.read())!='\n');
			do{
				rnd_num=rnd.nextInt(60);
			}while(list.size()<=rnd_num);
			System.out.println(list.get(rnd_num));
			list.remove(rnd_num);
		}

			System.out.println("");
	}
}
