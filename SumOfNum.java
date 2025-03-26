public class SumOfNum {
    public static void main(String[] args) {
        String s1="ab123cde43f";
        int sum=0;
        char[] a=s1.toCharArray();
        for(int i=1;i<=a.length-1;i++){
            if(a[i]>='1'&& a[i]<='9'){
              sum+=a[i]-'0';
            }
        }
        System.out.println(sum);
    }
}
