package Java_Pratice;

public class Pick_special_characters
{

    public static void main(String[]args)
    {
        String s="hgda@^%@@^*@*@dgasdvqdgY%@&^@!%!&";
        s=s.replaceAll("[a-zA-Z0-9]","");
        System.out.println(s);

        String K="gxdgxuyxv@&^%@*@&@^@R@&^@Rxvshxg>>><<.,>,";
     String  S= K.replaceAll("[a-zA-Z0-9]","");
        System.out.println(S);
    }
}
