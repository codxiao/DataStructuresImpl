package com.LinkedList;

import com.Stack.Stack;

public class TestKuoHaoPiPei {
    public static void main(String args[]){
        System.out.println(valid());
    }
    static boolean valid(){
        String s="{}{}()[]";
        StackByLinkedList<Character> stack=new StackByLinkedList<>();
        for (int i=0;i<s.length();i++){
            if (s.charAt(i)=='('||s.charAt(i)=='['||s.charAt(i)=='{'){
                stack.push(s.charAt(i));
            }
            else if(s.charAt(i)==')'){
                if (stack.isEmpty()) return false;
                if (stack.pop()!='(') return false;
            }
            else if(s.charAt(i)==']'){
                if (stack.isEmpty()) return false;
                if (stack.pop()!='[') return false;
            }
            else if(s.charAt(i)=='}'){
                if (stack.isEmpty()) return false;
                if (stack.pop()!='{') return false;
            }


//            if (s.charAt(i)==')'&&stack.isEmpty()||stack.pop()!='('){
//                return false;
//            }
//            if (s.charAt(i)==']'&&!stack.isEmpty()||stack.pop()!='['){
//                return false;
//            }
//            if (s.charAt(i)=='}'&&!stack.isEmpty()||stack.pop()!='{'){
//                return false;
//            }

        }
        return stack.isEmpty();
    }
}
