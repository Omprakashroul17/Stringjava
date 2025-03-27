public class UptoLowtoUp {
    public static void main(String[] args) {
        String s1="JaVa iS easY";
        char[] a=s1.toCharArray();
        String s2="";
        for(int i=0;i<a.length;i++){
            if(a[i]>='a'&& a[i]<='z'){
                s2+=(char)(a[i]-32);
            }
            if(a[i]>='A'&& a[i]<='Z'){
                s2+=(char)(a[i]+32);
        }
        if(a[i]==' '){
            s2+=" ";
        }   
    }
    System.out.println(s2);
}
}
