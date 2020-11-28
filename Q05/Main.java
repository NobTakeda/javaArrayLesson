import java.util.*;
public class Main{
	public static void main(String[] args){
		String name="山田太郎";
		//char型配列を名前の文字数で作成(配列変数名はchars)
		char[] chars=new char[name.length()];
		for(int i=0;i<chars.length;i++){
			chars[i]=name.charAt(i);/*文字列から1文字ずつcharとして取り出す*/
		}
		System.out.println(Arrays.toString(chars));
	}
}
