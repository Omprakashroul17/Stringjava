public class RevTwoHalfConcat {
    public static void main(String[] args) {
        String s1="virat kohli";
        int i=0;
        int l=s1.length();
        int l1=l/2-1;
        int i2=l/2+1;
        s1=rev(s1,i,l1);
        s1=rev(s1,i2,l-1);
        System.out.println(s1);

    }
    public static String rev(String s,int i,int j){
        char[] a=s.toCharArray();
        while(i<j){
            char temp=a[i];
            a[i]=a[j];
            a[j]=temp;
            i++;
            j--;
        }
        return new String(a);
    }
}
