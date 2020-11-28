import java.util.*;
public class Main{
	public static void main(String[] args){
		System.out.print("単語を入れてね>");
		String word=new Scanner(System.in).nextLine();
		//文字数をもとにchar配列を作成(配列変数名chars)
		char[] chars=word.toCharArray();
		//System.out.println(Arrays.toString(chars));
		for(int i=0;i<chars.length/2;i++){
			//配列にお尻の文字から詰めていく処理
			char temp=chars[i];
			chars[i]=chars[chars.length-i-1];
			chars[chars.length-i-1]=temp;
		}
		System.out.println(Arrays.toString(chars));
	}
}
