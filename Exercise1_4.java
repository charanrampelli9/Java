import java.util.Scanner;
public class Exercise1_4 {
    public static void main(String[] args) {
	   Scanner sc = new Scanner(System.in);
	   int n=sc.nextInt();
           int result=0;
           int m;
           int sum=0;
           int counter=n;
        //    while(m>0){
        //     m=m/10;
        //     counter++;
        //    }
           while(n>0){
            m=n%10;
            sum += m*m*m;
            n=n/10;
           }
           if(sum==counter){
            result = 1;
           }
           else{
            result = 0;
           }
           System.out.print(result);
           sc.close();
    }
}           