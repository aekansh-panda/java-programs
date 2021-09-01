public class oddarraysum 
{
   public static void main(String args[])
   {
    int[]marks=new int[5];
    marks[0]=100;
    marks[1]=94;
    marks[2]=75;
    marks[3]=96;
    marks[4]=91;
    int oddsum=0;
    for(int i=1;i<marks.length;i=i+2)
    {
       oddsum+=marks[i];
    }
    System.out.println("The sum of the digits in even places is: "+oddsum);
   } 
}
