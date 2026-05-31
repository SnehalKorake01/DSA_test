class Demo{
	public static void main(String[]args){
		int[][]arr={
				{1,2,3},
				{4,5,6},
				{7,8,9}
			   };
		System.out.print("Row Sum:");
		for(int i=0;i<arr.length;i++){
			int sum=0;
			for(int j=0;j<arr[0].length;j++){
				sum=sum+arr[i][j];
			}
			System.out.print(sum+" ");
		}
		System.out.println();
		System.out.print("Column sum:");
		for(int j=0;j<arr[0].length;j++){
			int sum=0;
			for(int i=0;i<arr.length;i++){
				sum=sum+arr[i][j];
			}
			System.out.print(sum+" ");
		}
	}
}