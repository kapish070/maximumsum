import java.util.*;
public class sunday3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Scanner sc=new Scanner(System.in);
       int a=sc.nextInt();
       while(a>0)
       {
    	   int sum=0,sum1=0;
    	   int size=sc.nextInt();
    	   int b[]=new int[size];
    	   for(int i=0;i<size;i++)
    	   {
    		   b[i]=sc.nextInt();
    	   }
    	   for(int i=0;i<size;i++)
    	   {
    		   sum=sum+b[i];
    	   }
    	   for(int i=0;i<size;i++)
    	   {
    		   sum1=sum1+b[i];
    		   if(sum1>=sum)
    		   {
    			   System.out.print(sum1);
    			   break;
    		   }
    	   }
    	   a--;
       }
	}

}
