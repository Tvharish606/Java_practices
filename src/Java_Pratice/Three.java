package Java_Pratice;

class one
{
   public String name;
   one(String name)
   {
      this.name=name;
   }
   public void printbabu()
   {
      System.out.print(name);
   }
}

class two extends one
{

   two(String name) {
      super(name);
   }
}

public class Three
{
   public static void main(String[]args)
   {
      two t=new two("harish");
      t.printbabu();
   }

}
