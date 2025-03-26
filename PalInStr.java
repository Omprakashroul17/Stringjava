public class PalInStr {
    public static void main(String[] args) {
        String s1="banana";
        for(int i=0;i<=s1.length()-1;i++){
            for(int j=i+1;j<=s1.length()-1;j++){
                if(isPallindrome(s1,i,j)){
                    System.out.println(s1.substring(i, j+1));
                }
            }
        }
    }
  public static boolean isPallindrome(String s1,int start,int end){
    s1=s1.toLowerCase();
    char[] a=s1.toCharArray();
    while(start<end){
        if(a[start]!=a[end]){
            return false;
        }
        start++;
        end--;
    }
    return true;
  }
}
