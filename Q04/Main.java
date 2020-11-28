import java.util.*;
public class Main{
	public static void main(String[] args){
		System.out.print("何日間>");
		int days=new Scanner(System.in).nextInt();
		//double型の配列を作成
		double[] weights=new double[days];
		for(int i=0;i<weights.length;i++){
			System.out.print(i+1+"日目の体重を入力>");
			//Scannerを使ってdoubleの値を取得
			double weight=new Scanner(System.in).nextDouble();
			//その値を配列に格納する
			weights[i]=weight;
		}
		System.out.println(Arrays.toString(weights));
	}
}
