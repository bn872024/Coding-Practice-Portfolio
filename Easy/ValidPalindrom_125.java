public class ValidPalindrom_125 {

    public boolean isPalindrome(String s){
    
        if(s==null || s.isEmpty()){
            return false;
        }
    String a=s.trim().replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
    
    int left=0;
    int right =a.length()-1;

    while (left<right){
        if(a.charAt(left)!=a.charAt(right)){
            return false;
        }
        else{
            left++;
            right--;
        }
    }
    return true;

    }



    public static void main(String[] args) {

        String s1="A man, a plan, a canal: Panama";
        String s2="race a car";
        ValidPalindrom_125 vpo=new ValidPalindrom_125();

        System.out.println("Input :"+ s1 + " is Palirdrome  : "+ vpo.isPalindrome(s1) );
        System.out.println("Input :"+ s2 + " is Palirdrome  : "+ vpo.isPalindrome(s2) );
    }
    
}
