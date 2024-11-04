import java .util.Scanner;
public class Main{
    public static void main(String[] args)
    {
        Scanner scan=new Scanner(System.in);
            int a;
        a=scan.nextInt();
        int sum=0;
        while(a!=0)
        {
            int last=a%10;
            sum=sum+last;
            a=a/10;
        }
      System.out.println(sum);
    }
}    