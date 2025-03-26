public class SumOfNumStr {
    public static void main(String[] args) {
        String s1="a123bc56";
        System.out.println(sum(s1));
    }
    public static int sum(String s1){
        char[] a=s1.toCharArray();
        int sum=0;
        int i=0;
        while(i<a.length){
            int n=0;
            while(i<a.length &&a[i]>='0'&& a[i]<='9'){
                n=(n*10)+(a[i]-'0');
                i++;
            }
            sum+=n;
            i++;
        }
        return sum;
    }
}
