package Java_Pratice;

public class Duplicate_printing
{
    public static void main(String[]args)
    {
        String[]name={"Harish","Ramesh","Suraj","prakash","Ramesh"};
        for(int i=0;i<name.length;i++)
        {
            for(int j=i+1;j< name.length;j++)
            {
                if(name[i]==name[j])
                {
                    System.out.println(name[j]);
                }
            }

        }
    }
}
