import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
            Scanner sc=new Scanner(System.in);
            System.out.println("================================");
            for(int i=0;i<3;i++){
                String s1=sc.next();
                int x=sc.nextInt();
                String xFormatted=String.format("%03d", x);
                String s1Padded = String.format("%-15s", s1);
                System.out.println(s1Padded+xFormatted);
            }
            System.out.println("================================");

    }
}
