public class OccuranceOfChar {
    public static void main(String[] args) {
        String s1 = "aababaccccbbaa";
        char[] a = s1.toCharArray();
        String s3 ="";
        int i = 0;

        while (i < a.length) {
            char c = a[i];
            int count = 1;
            while (i+1 < a.length && a[i] == a[i+1]) {
                count++;
                i++;
            }
            s3+=count;
            s3+=c;
            i++;
        }

        System.out.println(s3);
        
    }
}

