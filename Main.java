import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s1 = scanner.next();
        int i=0;
        String s2="";

        while (i<s1.length()) {
            int j=i+1;
            if(s1.charAt(i)=='0'&&s1.charAt(j)=='0'){
                s2+='A';
            }
            if(s1.charAt(i)=='0'&&s1.charAt(j)=='1'){
                s2+='T';
            }
            if(s1.charAt(i)=='1'&&s1.charAt(j)=='0'){
                s2+='C';
            }
            if(s1.charAt(i)=='1'&&s1.charAt(j)=='1'){
                s2+='G';
            }
           i+=2; 
        }
        System.out.println(s2);
    }
}