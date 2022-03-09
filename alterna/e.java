import java.util.Scanner;
public class e {

    public static void main(String[]args) {
    	Scanner captura=new Scanner(System.in);
    	int[] vector=new int[3];
    	for(int i=0;i<3;i++)
    	{
    		System.out.println("Ingresa un número");
    		vector[i]=captura.nextInt(); 
    	}
    	     for(int j=2;j>=0;j--)
    	     {
    	     	System.out.print(vector[j]+" ");
    	     }
    }
    
    
}