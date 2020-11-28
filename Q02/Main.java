import java.util.*;
public class Main{
	public static void main(String[] args){
		System.out.print("要素数>");
		int num = new Scanner(System.in).nextInt();
		//配列作成
		int[] nums=new int[num];
		for(int i=0;i<nums.length;i++){
			//1から連番の要素をいれる
			nums[i]=i+1;
		}
		System.out.println(Arrays.toString(nums));
	}
}
