package Java_Pratice;

public class car
{
    void color()
    {
        System.out.println("should accept the requirement");
    }
}
class buloro extends car {
    void color() {
        System.out.println("white");
    }
}
class benz extends car
{
    void color()
    {
        System.out.println("black");
    }
}

class stimulator
{
    static void anism(car x)
    {
        x.color();
    }
}
class excuetion
{
    public static void main(String[]args)
    {
        benz b=new benz();
        stimulator.anism(b);
    }
}
