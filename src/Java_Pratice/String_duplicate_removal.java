package Java_Pratice;

public class String_duplicate_removal
{
    public static void main(String[]args)
    {
        String[]names={"Harish","madhu","ragbag","threader","Harish"};

        for(int i=0;i<names.length;i++)
        {
            for(int j=i+1;j<names.length;j++)
            {

                if(names[i]==names[j])
                {

                    names[j]="dup";

                }




            }


        }

        for(int k=0;k<names.length;k++)
        {

            if(names[k]!="dup")
            {
                System.out.println(names[k]+" ");
            }
        }




    }




}
