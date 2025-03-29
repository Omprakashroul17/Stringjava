public class ReapeatChar {
    
        public static void main(String[] args) {
            String s1 = "aababaccccbbaa";
            char[] a = s1.toCharArray();
            String s3 ="";
            int i = 0;
            while (i < a.length) {
                int count=1;
                String s2=s1.charAt(i)+"";
                while (i+1 < a.length && a[i] == a[i+1]) {
                   s2+=a[i+1]; 
                    i++;
                    count++;
                }
               if(count>1) s3+=s2;
                i++;
            }
    
            System.out.println(s3);
            
        }
    }
    
    

