import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Test5 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for(int a0 = 0; a0 < t; a0++){
            int n = in.nextInt();
            int k = in.nextInt();
            int a = 0;
            for(int i=0; i < n; i++){
                if(in.nextInt() < 0) {
                    a++;
                }
            }
            if(p >= k){
                System.out.println("NO");
            } else {
                System.out.println("YES");                
            }
        }
    }
}



