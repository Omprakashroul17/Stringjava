public class UpToLowToUpSplit {
    public static void main(String[] args) {
        String s1 = "JaVa is Easy";
        String s3 = "";  
        String[] words = s1.split(" ");

        for (String word : words) {
            String s2 = ""; 
            char[] a = word.toCharArray();
            
            for (char c : a) {
                if (c >= 'a' && c <= 'z') {
                    s2 += (char) (c - 32);   
                } 
                 if (c >= 'A' && c <= 'Z') {
                    s2 += (char) (c + 32);   
                } 
                }
            
            s3 += s2 + " ";  
        }

        System.out.println(s3.trim());  
    }
}
