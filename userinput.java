import java.util.Scanner;
public class userinput {
    public static void main(String[] args){
        System.out.println("taking input from user");
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number 1");
        int a= sc.nextInt();
        System.out.println("enter the number 2");
        int b = sc.nextInt();
        int sum= a+b;

        System.out.println("the sum of all number is :");
        System.out.println(sum);

    }
}
