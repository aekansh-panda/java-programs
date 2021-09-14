public class thiscar 
{
  int topspeed;
  String color;
  float average;
  thiscar(int topspeed,String color,float average)
  {
      this.topspeed=topspeed;
      this.color=color;
      this.average=average;
  }  
   void display()
  {
    System.out.println(topspeed+""+color+""+average);
  }
  public static void main(String args[])
  {
    thiscar sc=new thiscar(215,"red",9);
    thiscar scc=new thiscar(175,"black",10);
    sc.display();
    scc.display();
  }
}
