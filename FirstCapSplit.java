public class FirstCapSplit {
    public static void main(String[] args) {
        String s1="java is easy";
        String s3="";
        String[] s=s1.split(" ");
        for(int i=0;i<=s.length-1;i++){
            String s2="";
            char[]a=s[i].toCharArray();
            for(int j=0;j<a.length;j++){
                if(j==0){
                    if(a[j]>='a'&&a[j]<='z'){
                    s2+=(char)(a[j]-32);
                    }
                else{
                    s2+=a[j];
                }
             }
             else{
                s2+=a[j];
             }
            }
            s3+=s2+" ";
        }
        System.out.println(s3.trim());
    }
}
