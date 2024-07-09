package Java_Pratice;

public class Method_Overloading {
    public void search(String name) {
        System.out.println(name);
    }

    public void search(int age) {
        System.out.println(age);
    }
}
 class main_class_1
 {
    public static void main(String[]args)
    {
        Method_Overloading M=new Method_Overloading();
        M.search("Harish");
        M.search(28);
    }
}
