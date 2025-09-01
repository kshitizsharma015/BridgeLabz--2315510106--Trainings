package viva;

import java.util.Scanner;

public class divCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number:");
        int x = sc.nextInt();
        int ans = check(x);
        if(ans==1){
            System.out.print("Yes");
        }
        else{
            System.out.print("No");
        }
    }

public static int check(int x) {
    int r = x - 7 * (x / 7);
    if (r == 0) {
        return 1;
    }
     return 0;
}
}
