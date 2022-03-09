import java.util.Scanner;

public class Tele {
      static int d,d1;
    public static void main(String[] args) {
    	int a,b,most;
    	Scanner captura=new Scanner(System.in);
    	do{
    		System.out.println("Ingrese el canal inicial");
          	a=captura.nextInt();
    	  }while(a<=0 || a>100);
    	do{
    	System.out.println("Ingrese el canal final");
    	b=captura.nextInt();
    	System.out.println();
    	
    	}while(b<=0 || b>100);
    	if(a<b)	
    	{
    	    d=b-a;
    		d1=99-d;
    	}else{
    		  if(b<a)
    		  	    {
    		  	   	 d=a-b;
    		  	   	 d1=99-d; 	
    		        }
             }
             most=menor();
             System.out.println(most);
    }
     public static int menor()
     {
     	int resp;
     	if(d1>d)
     	{
     	 resp=d;	
     	}else{
     		  resp=d1;
             }
             return resp;
     }
    
    
}
