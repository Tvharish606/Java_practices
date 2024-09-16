package Java_Pratice;

public class Garbage_collectionss
{
    @Override
    public void finalize() throws Throwable {
        try
        {
            System.out.println("handle");
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
        finally {
            super.finalize();
        }
    }
    public static void main(String[]args)
    {
        String S1=new String("good");
        String S2=new String("Bad");
        S1=null;
        System.gc();

    }
}
