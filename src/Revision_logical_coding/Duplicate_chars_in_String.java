package Revision_logical_coding;

public class Duplicate_chars_in_String
{
    public static void main(String[]args)
    {
        String name="harisha";
        for(int i=0;i<name.length()-1;i++)
        {
            for(int j=i;j<name.length()-1;j++)
            {
                if(name.charAt(i)==name.charAt(j+1))
                {
                    System.out.println(name.charAt(i));
                }
            }
        }
    }
}
