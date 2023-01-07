public class methodol {
    int l, h, w;
    void getdata()
    {
        l=10;
        h=20;
        w=30;
    }
    void getdata(int a)
    {
        l=a;
        h=a;
        w=a;
    }
    void getdata(int a, int b)
    {
        l=a;
        h=b;
        w=b;
    }
    void getdata(int a, int b, int c)
    {
        l=a;
        h=b;
        w=c;
    }
    void area()
    {
        int area=l*h*w;
        System.out.println("area="+ area);
    }
}
class cuboid
{
    public static void main(String [] ar)
    {
        methodol m = new methodol();
        m.getdata();
        m.area();
        m.getdata(11);
        m.area();
        m.getdata(11,12);
        m.area();
        m.getdata(11,12,13);
        m.area();
    }
}
