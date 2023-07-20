import java.util.Scanner;


public class LongestPalindromicSequence {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string : ");
        String str = sc.next();
        System.out.println(findLongPalinNum(str));
    }
    public static String findLongPalinNum(String str){
        int max_length =0;
        int n=str.length();
        if(n==1){return str;}
        int start=0;
        int end = 0;
        //odd
            for (int i = 0; i < n - 1; i++) {
                int l = i, r = i;
                while (l >= 0 && r < n) {
                    if (str.charAt(l) == str.charAt(r)) {
                        l--;
                        r++;
                    } else {
                        break;
                    }
                }
                int len = r - l - 1;
                if (len > max_length) {
                    max_length = len;
                    start = l+1;
                    end = r-1;
                }
            }
// even
            for (int i = 0; i < n - 1; i++) {
                int l = i, r = i + 1;
                while (l >= 0 && r < n) {
                    if (str.charAt(l) == str.charAt(r)) {
                        l--;
                        r++;
                    } else {
                        break;
                    }
                }
                int len = r - l - 1;
                if (len > max_length) {
                    max_length = len;
                    start = l+1;
                    end = r-1;
                }
            }
        return str.substring(start,end+1);
    }
}
