import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

class ValidParetheses_20{

    // (){}[] =true
    //)(){}=false;

    public static boolean isValidParentheses(String s){
        if(s==null || s.length()<1){
            throw  new IllegalArgumentException("Input is not valid test input");
        }

        Stack<Character> stack= new Stack<>();
        Map<Character, Character> map=new HashMap<>();

        map.put(')','(');
        map.put('}','{');
        map.put(']','[');


        for(char c: s.toCharArray()){
            if(map.containsKey(c)){
                if(!stack.isEmpty() && stack.peek() == map.get(c)){
                    stack.pop();
                }else{
                    return false;
                }

            }else{
            stack.push(c);
            }
        }
        return  stack.isEmpty();

    }






    public static void main(String[] args) {


        String brackets= "[{}()]";
        String brackets2= "[{})]";

        System.out.println(isValidParentheses(brackets));
        System.out.println(isValidParentheses(brackets2));
        
        
    }

}