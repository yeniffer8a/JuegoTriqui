import java.util.Scanner;
public class e {

    public static void main(String[]args) {
    	Scanner captura=new Scanner(System.in);
    	double vector=new double[3];
    	for(int i=0;i<3;i++)
    	{
    		System.out.println("Ingresa un número");
    		vector[i]=captura.nextDouble(); 
    	}
    	     for(int j=3;j>0;j--)
    	     {
    	     	System.out.print(vector[j]+" ");
    	     }
    }
    
    
}