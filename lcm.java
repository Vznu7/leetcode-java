import java.util.Scanner;

public class lcm {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int g=0;
        for(int i =1; i<b ;i++){
            if(a%i==0&& b%i==0)  
             g=i;            
        }
         int lcm = (a*b)/g;
        System.out.println(lcm);
        sc.close();
    }
}