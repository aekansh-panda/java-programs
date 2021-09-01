import javax.lang.model.util.ElementScanner14;

public class EvenOddArraySum 
{
    public static void main(String args[])
    {
        int[]marks=new int[6];
        marks[0]=1;
        marks[1]=2;
        marks[2]=3;
        marks[3]=4;
        marks[4]=5;
        marks[5]=6;
        int evensum=0;
        int oddsum=0;
        for(int i=0;i<marks.length;i++)
        {           
            if(i%2==0)
            {
                evensum+=marks[i];
            }
            else
            {
                oddsum+=marks[i];
            }
            
        }
        System.out.println(evensum );
        System.out.println(oddsum );

    }  
}
