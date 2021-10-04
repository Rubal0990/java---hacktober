class Complete
{
    public static ArrayList<Integer> array(int a[][], int b[], int n)
    {
        int sum=0;
       ArrayList<Integer> result = new ArrayList<Integer>();
       for(int i=0 ;i<n ; i++){
           for(int j=0 ; j<n ; j++){
               if(i==j)
               sum=sum+a[i][j];
           }
       }
       int max=b[0];
       for(int i=1 ; i<n ; i++){
           if(b[i]>max)
           max=b[i];
       }
       result.add(sum);
       result.add(max);
       return result;
    }
}