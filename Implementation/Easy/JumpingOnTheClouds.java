import java.util.Scanner;

public class JumpingOnTheClouds {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] c = new int[n];
        for (int i=0;i<n;i++) {
            c[i] = sc.nextInt();
        }
        int count=-1;
        for (int i=0;i<n;i++,count++) {
            if (i<n-2 && c[i+2]==0) {
                i++;
            }
        }
        System.out.println(count);
    }
}
