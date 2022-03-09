import java.util.Scanner;
public class Suerte
{

    public static boolean Suerte(long n0)
    {
        long izq=n0*n0, der=0, decena=1;
        boolean res=false; 
        while(izq>0 && !res) 
        {
            der=der+izq%10*decena; 
            izq=izq/10;
            decena=decena*10;
            res=der>0 && izq+der==n0; 
        }
        return res;
    }
    

    public static void main(String[] args)
    {
        Scanner in=new Scanner(System.in);
        long n;
        do
        {
            n=in.nextLong();
            if (n>0)
            {
                 System.out.println(Suerte(n)?"SI":"NO");
            }
        } while (n>0);
        
    }
}