import java.util.Scanner;
public class Exercise1_3 {
       public static void main(String[] args) {
	   Scanner sc = new Scanner(System.in);
	   int n=sc.nextInt();
	  int sum=0;
      int k =0;
//Use for or while loop do the operation.
while(n>0){
  if(k%3==0){
    sum+=k;
  }
  k+=2;
  n-=1;;
}
System.out.print(sum);
sc.close();
}
}
