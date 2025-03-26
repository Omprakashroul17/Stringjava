public class WordInRev {
    public static void main(String[] args) {
        String s1="the sky is blue";
        String s2="";
        String[] a=s1.split(" ");
        for(int i=a.length-1;i>=0;i--){
            s2+=a[i];
            if(i>0){
                s2+=" ";
            }

        }
        System.out.println(s2);
    }
}
