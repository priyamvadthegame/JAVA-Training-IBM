class Wrapper
{
	public static void main(String args[])
	{
		int arr[]=new int[args.length],k=0;
		for(String ele:args)
		{
			arr[k++]=Integer.parseInt(ele);
		}
		sort(arr);
		for(int ele:arr)
		{
			System.out.println(ele);
		}
		
	}
	public static void sort(int arr[])
	{
		int n = arr.length; 
        for (int i = 0; i < n-1; i++) 
            for (int j = 0; j < n-i-1; j++) 
                if (arr[j] > arr[j+1]) 
                { 	
					int temp = arr[j]; 
                    arr[j] = arr[j+1]; 
                    arr[j+1] = temp; 
                }
	}
}