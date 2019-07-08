package solution;

public class MethodOverride
{
    static  int[] a;
    static
    {
        a = new int[] {1, 2, 3};
    }
    public static void main(String[] args)
    {
        a = new int[5];
    }
}