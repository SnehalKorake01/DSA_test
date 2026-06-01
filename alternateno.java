import java.util.*;
class Demo{
	public static void main(String[]args){
		int[]arr={1,2,-3,-1,-2,3};
		int positive =0;
		int negative= 1;
		int[]newArr=new int[arr.length];
		for(int i=0;i<arr.length;i++){
			if(arr[i]>0){
				newArr[positive]=arr[i];
				positive=positive+2;
			}
			else{
				newArr[negative]=arr[i];
				negative=negative+2;
			}
		}
		System.out.println(Arrays.toString(newArr));
	}
}
		
		