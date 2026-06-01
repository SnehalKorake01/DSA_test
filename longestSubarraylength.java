class Demo{
	public static void main(String[]args){
		int[]arr={10,5,2,7,1,9};
		int k=15;
		int longLength=0;
		for(int i=0;i<arr.length;i++){
			int sum=0;
			for(int j=i;j<arr.length;j++){
			sum=sum+arr[j];
				if(sum==k){
					int chaluLength=j-i+1;
					if(longLength<chaluLength){
						longLength=chaluLength;
					}
				}
			}
		}
		System.out.println(longLength);
	}
}
	