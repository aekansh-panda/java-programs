public class maxarray
{
   public static void main(String args[])
   {
      double[] arr={55.4,96.96,12.5,122.4,63.9,122.6};
      double y=0;
      for(int i=0;i<arr.length;i++)
      {
          if(arr[i]>y)
          {
              y=arr[i];
          }
      }
      System.out.println("The largest number in the array is: \n"+y);
   }   
}
