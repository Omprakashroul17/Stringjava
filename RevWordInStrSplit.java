public class RevWordInStrSplit {
    public static void main(String[] args) {
        String s1="Java is easy";
        String[] s=s1.split(" ");
        String s3="";
        for(int i=0;i<s.length;i++){
            char[] a=s[i].toCharArray();
            int x=0;
            int y=a.length-1;
            while(x<y){
                char temp=a[x];
                a[x]=a[y];
                a[y]=temp;
                x++;
                y--;
            }
            String s2=new String(a);
            s3+=s2;
            s3+=" ";
        }
        System.out.println(s3);
    }
}
