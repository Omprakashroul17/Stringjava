public class StrPallindrome {
    public static void main(String[] args) {
        String s1="madam";
        if(isPllindrome(s1)){
            System.out.println("String is pallindrome");
        }
        else{
            System.out.println("String is not a pallindrome");
        }
    }
    public static boolean isPllindrome(String s){
        s=s.toLowerCase();
        char[] a=s.toCharArray();
        int i=0;
        int j=s.length()-1;
        while(i<j){
            if(a[i]!=a[j]){
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
}
