/*
This question is asked by Amazon. Given two strings s and t, which represents a sequence of keystrokes, where # denotes a backspace, return whether or not the sequences produce the same result.

Ex: Given the following strings...

s = "ABC#", t = "CD##AB", return true
s = "como#pur#ter", t = "computer", return true
s = "cof#dim#ng", t = "code", return false
*/

public static String keyStrokeEqual(String a){
        if(a.length() < 0 || a == null) return "";
        
        Stack<Character> stack = new Stack<>();
        
        for(char c:a.toCharArray()){
            if(c == '#' && !stack.isEmpty()){
                stack.pop();
            }
            else{
                stack.push(c);
            }
        }
        StringBuilder sb = new StringBuilder();
        while(!stack.isEmpty()){
            sb.append(stack.pop());
        }
        return sb.reverse().toString();
        
    }
