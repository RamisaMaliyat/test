public class Sum{
    int a, b;
    static int sum;
    public static int sum(int a,int b)
    {
        sum= a+b;
        System.out.println(sum);
        return  sum;
    }

    public static void main(String[] args) {
        sum(10,10);
    }
}
