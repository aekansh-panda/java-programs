public class evenarraysum
{
public static void main(String args[])
{
    //int[] marks={100,94,75,96,91};
    int[]marks=new int[5];
    marks[0]=100;
    marks[1]=94;
    marks[2]=75;
    marks[3]=96;
    marks[4]=91;
    int evensum=0;
    for(int i=0;i<marks.length;i=i+2)
    {
       evensum+=marks[i];
    }
    System.out.println("The sum of the digits in even places is: "+evensum);
}
}