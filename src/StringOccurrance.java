

public class StringOccurrance {
   public static String remove(String str){
      if (str.length()==0){
         return str;
      }
      String result = "";
      if (str.charAt(0)!='a') {
         result = result + str.charAt(0);
      }

         String resans = remove(str.substring(1));
         return result+resans;

   }


   public static void main(String[] args) {
      String str = "abcdafa";
      System.out.println(remove(str));
   }
}
