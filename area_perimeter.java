import java.util.Scanner;  
public class area_perimeter {
       public static void main(String[] args) {
Scanner s = new Scanner(System.in); 
       double radius= s.nextDouble();
       double perimeter;
       double area;
       //Calculate the perimeter 
       perimeter = Math.PI*2*radius;
  //Calculate the area
       area = Math.PI*radius*radius;
       if(radius<=0){
         System.out.println("please enter non zero positive number");
       }
       else{
         System.out.println(perimeter);
         System.out.print(area);
       }
      s.close(); 
    }
}         