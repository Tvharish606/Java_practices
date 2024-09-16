package Revision_logical_coding;

public class Count_the_repeated_characters_in_string
{
    public static void main(String[]args) {
        String name_of_user = "Prabara ";
        String name = name_of_user.trim();
        int a=0;
        for(int i=0;i<name.length();i++)
        {
                if(name.charAt(i)=='a')
                {
                    a++;

                }
                else {
                    System.out.println("other than a");
                }

            }
        System.out.println(a);
        }


    }
