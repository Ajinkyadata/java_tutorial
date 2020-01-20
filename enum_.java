class glass
{
  enum glassize{small, mid, large}
  glassize x;
}


public class head
{
  public static void main(String args[])
  {
    glass v= new glass();
    
    v.x= glass.x.mid;
    
    System.out.println("----"+v.x);
  }
}
