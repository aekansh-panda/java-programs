import java.util.*;
public class Pallindrome_word 
{
    String word;
    int a ; String b;
    Pallindrome_word()
    {
        word =""; a = 0 ; b = "";
    }
    void input()
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the word : ");
        word = sc.nextLine();
    }
    void check()
    {
        a = word.length() - 1;
        for(int i = a; i >= 0 ; i--)
        {
            b += word.charAt(i);
        }
        if(word.equalsIgnoreCase(b))
        {
            System.out.println(word+" is a Pallindrome");
        }
        else
        {
            System.out.println(word+" is not a Pallindrome");
        }
    }
    public static void main(String args[])
    {
        Pallindrome_word o = new Pallindrome_word();
        o.input();
        o.check();
    }
}