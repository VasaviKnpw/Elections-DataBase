package day_1;
import java.util.*;
public class Assignment1{
   int noOfUnits;
   double totalBill;  
   public static void main(String[] args){
	 Assignment1 a=new Assignment1();
     Scanner sc=new Scanner(System.in);
   System.out.println("Enter the no.of units :");
   a.noOfUnits=sc.nextInt();
   if(a.noOfUnits<100){
      a.totalBill=a.noOfUnits*1.20;      // standard price per unit=1.20
    }
   else if(a.noOfUnits<=300){
     a.totalBill=((a.noOfUnits-100)*2)+(100*1.20);
    }
   else{
     int temp=a.noOfUnits-300;  //900-300=600  , 600*3=1800 , 200*2=400, 100*1.2=120   , total=1800+400+120=2320
     a.totalBill=(temp*3)+(200*2)+(100*1.20);
   }
   System.out.println("Total Bill : "+a.totalBill);
   sc.close();
 }
}

