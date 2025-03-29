public class EncodeDecreasing {
    public static void main(String[] args) {
        System.out.println(encode("java",15));
    }
    public static String encode(String s,int e){
      char[]a=s.toCharArray();
      String s2="";
      for(char c:a){
        s2+= (char) ((c - 'a' - e + 26) % 26 + 'a');
      }
      return s2;
    }
}
