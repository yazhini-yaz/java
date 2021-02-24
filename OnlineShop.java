package Assignment;
import java.util.*;
import java.util.Scanner;
interface list{                                       //methods that are declared in the  interface list are implemented. 

	
     public void  Availabitity();
     public void display();
    
}
class Items implements list{
	int totalCost=0;
Items() { 
 
             System.out.println("WELCOME TO OUR SITE!!!!!!");                //print the available items.
        System.out.println("1.Biscuits=Rs 10 \n2.Bread = Rs 15\n3.jam = Rs 20\n4.diary milk = Rs 45\n5.Lays =Rs 10\nIf you enter 0 means finish the purchase\n");
      }
     
public void display(){                       
      
    System.out.println("totalCost of ur product:" + totalCost);   //just print the totalcost of the user's product
}

public void Availabitity() {
	 int ch;
	    
	    do{
	   System.out.println("enter the product numbers:");
	  
	  
	   Scanner S=new Scanner(System.in);      //By using the Scannner class to get the input from the user.
	    ch=S.nextInt();
	switch(ch){                         //In the Switch case , to call  the two modules totalCost() and Display() is invoked.
	      case 1:
	     	  
	            totalCost(ch-1);
	            break;
	      case 2:
	     	 
	            totalCost(ch-1);
	             break;
	      case 3:
	     	  
	            totalCost(ch-1);
	            break;
	      case 4:
	     		totalCost(ch-1);
	             break;
	      case 5:
	     	 
	            totalCost(ch-1);
	              break;
	     
	        default:
	         System.out.println("thanks for Shopping");   
	}                    
	}while(ch!=0);
	
}
public void totalCost(int ch){
	 int  Available[]={15,16,20,31,25};
     System.out.println("Enter the Quantity of ur product");
        Scanner Q =new Scanner(System.in);
                int Quan=Q.nextInt();
     try{                                           //if exception occur,by using the try and catch block to handle that exception.
              if(Available[ch]< Quan){
            	  
                          if(Available[ch]==0){
                             System.out.println("OUT OF STOCK");
                          }
                             else
                             {
                            	 System.out.println("only "+Available[ch]+" items is available....please check Availability list");
                             }}   
         else
           Available[ch]=Available[ch]-Quan;
              }
      catch(Exception e){
             System.out.println("sorry...exception occour...please enter correct input");  
}
         finally{
       int price[]={10,15,20,45,28};              //prize of the available products list to store the array. 
         
          totalCost+=price[ch] * Quan;
} 
}
} 

public class onlineShop extends Items{                         // Single inheritance is achieved by class onlineShop which extends the class Items.
public static void main(String args[])
{
    Items I = new Items(); 
    I.Availabitity();
    
}
}

     
 