public class MyString {
    public static void main(String[] args) {
        System.out.println("Testing lowercase:");
        System.out.println("UnHappy : " + lowerCase("UnHappy"));
        System.out.println("This costs 15 Sheksls : " + lowerCase("This costs 15 Sheksls"));
        System.out.println("TLV : " + lowerCase("TLV"));
        System.out.println("lowercase : " + lowerCase("lowercase"));

        System.out.println("Testing contains:");
        System.out.println(contains("unhappy", "happy")); // true
        System.out.println(contains("happy", "unhappy")); // false
        System.out.println(contains("historical", "story")); // false
        System.out.println(contains("psychology", "psycho")); // true
        System.out.println(contains("personality", "son")); // true
        System.out.println(contains("personality", "dad")); // false
        System.out.println(contains("resignation", "sign")); // true
    }

    /** Returns the lowercase version of the given string. */
    public static String lowerCase(String str) {
       String str1="ABCDEFGHIJKLMNOPQRSTUVWXYZ";
      String str2="abcdefghijklmnopqrstuvwxyz";
        char[] arr=new char[str.length()];
         String newstr="";
        for(int i=0;i<str.length();i++){
              arr[i]=str.charAt(i);
            for(int j=0;j<26;j++){
            if(arr[i]==str1.charAt(j)){
                arr[i]=str2.charAt(j);
            } 
                
            
        }
    } 
        for(int i=0;i<str.length();i++){
            newstr+=arr[i];
        }
        return newstr;
    }

    /** If str1 contains str2, returns true; otherwise returns false. */
    public static boolean contains(String str1, String str2) {
        if(str2.length()==0){
            return true;}
        if(str1.length()<str2.length()){
            return false;
        }
         for(int i=0;i<=str1.length()-str2.length();i++){
            int j;
            for(j=0;j<str2.length();j++){
                if(str1.charAt(i+j)!=str2.charAt(j)){
                    break;
                } 
            } if(j==str2.length()){
                return true;
            }
        }     
        
        return false;
    
} 
}
