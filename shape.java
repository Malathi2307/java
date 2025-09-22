import java.util.*;
public class shape{
	public static void main(String[] arg){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter length :");
		float length =sc.nextFloat();
		System.out.println("Enter radius :");
		float radius=sc.nextFloat();
	        System.out.println("Enter base :");	
	        float base=sc.nextFloat();
	        System.out.print("Enter choice(1-3):");
	        int choice=sc.nextInt;
	        if(length>0&&radius>0&&base>0){
	        	switch(choice){
	        	case1:{
	        	   System.out.print("Rectangle :"+length*base);
	        	   }
	        	   break;
	        	   
	        	case2:{
	        	   System.out.print("Triangle:"+0.5*length*base);
	        	   }
	        	   break;
	        	   
	        	case3:{
	                   System.out.print("circle:"+3.14*(radius*radius));
	                   }
	                   break;
	                   
	                default:{
	                   System.out.print("INVALID CHOICE");
	                   }
	            }
	       }
	}
}     
