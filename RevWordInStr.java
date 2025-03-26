public class RevWordInStr {
    public static void main(String[] args) {
    String s1="java is easy";
    char[] a=s1.toCharArray();
    int i=0;
    int j=0;
    String s2="";
    while(j<a.length){
        while(j<a.length&&a[j]!=' '){
            j++;
        }
        String temp="";
        int k=j-1;
        while(k>=i){
            temp+=a[k--];
        }
       s2+=temp;
       if(j<a.length) s2+=" ";
    j++;
    i=j;
    }
    System.out.println(s2);
}
}