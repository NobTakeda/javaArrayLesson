import java.util.*;
public class Main{
	public static void main(String[] args){
		System.out.print("何人>");
		int num=new Scanner(System.in).nextInt();
		//人数分の名前が入る配列を作成(配列変数名はdata)
		String[] data=new String[num];
		for(int i=0;i<data.length;i++){
			System.out.print(i+1+"人目>");
			String name=new Scanner(System.in).nextLine();
			//配列に名前を格納
			data[i]=name;
		}
		//当選indexを変数luckyIndexに格納(Random)
		int luckyIndex=new Random().nextInt(data.length);
		System.out.println("当選は"+data[luckyIndex]+"さんです！");
	}
}
