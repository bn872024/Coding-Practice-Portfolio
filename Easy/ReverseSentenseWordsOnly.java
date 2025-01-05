public class ReverseSentenseWordsOnly {

        public String revverseSentece(String s){

            String [] words=s.split(" ");

            StringBuilder sb=new StringBuilder();

            for(int i=0; i<words.length;i++ ){
                sb.append(reverseWord(words[i]));
                if(i<words.length-1){
                    sb.append(" ");
                }

            }
            return sb.toString();

        }

        public String reverseWord(String s){
            char[] chArray=s.toCharArray();
            int left=0;
            int right=s.length()-1;

            while(left<right){
                char temp=chArray[left];
                chArray[left]=chArray[right];
                chArray[right]=temp;
                left++;
                right--;
            }
            return new String(chArray);
        }


    public static void main(String[] args) {

        ReverseSentenseWordsOnly rs=new ReverseSentenseWordsOnly();

        String input1="This is my technology";

        String result=rs.revverseSentece(input1);
        
        System.out.println("This reversed sentence is:  "+ result);
        System.out.println("This orginal sentence is:  "+ rs.revverseSentece(result));
        
    }
    
}
