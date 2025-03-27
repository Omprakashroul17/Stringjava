public class FirstCap {
    public static void main(String[] args) {
        String s1="java is easy";
        char[] a=s1.toCharArray();
        String s2="";
        if(a[0]>='a'&& a[0]<='z'){
            s2+=(char)(a[0]-32);  
        }
        else{
        s2+=a[0];
        }
        for(int i=1;i<=a.length-1;i++){
            if(a[i-1]==' '){
                if(a[i]>='a'&&a[i]<='z'){
                s2+=(char)(a[i]-32);
                }
                else{
                 s2+=a[i];
            }
        }
        else{
            s2+=a[i];
        }
        }
        
         System.out.println(s2);   
        }

        }
    

