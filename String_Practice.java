import java.util.Stack;

public class String_Practice {
    static boolean ispar(String s)
    {
        // add your code here
        Stack<Character> st = new Stack<>();
        for(int i=0;i<s.length();i++){
            if(s.charAt(i) == '[' || s.charAt(i) == '{' || s.charAt(i)== '('){
                st.push(s.charAt(i));
            }
            else if(s.charAt(i) == ']'){
                System.out.println(st.contains('['));
                if(!st.contains('[')){
                    return false;
                }
                else{
                    st.pop();
                }
            }
            else if(s.charAt(i) == '}'){
                if(!st.contains('{')){
                    System.out.println(st.contains('{'));
                    return false;
                }
                else{
                    st.pop();
                }
            }
            else if(s.charAt(i) == ')'){
                if(!st.contains('(')){

                    return false;
                }
                else {
                    st.pop();
                }
            }
            if(!st.isEmpty()) {
                System.out.println(st.peek());
            }
        }
        return true;
    }
    public static int coutChars(String s1, String s2) {

        //Your code here
        int visited[] = new int[26];
        for(int i: visited){
            System.out.print(i+" ");
        }
        System.out.println("");
        for (char i : s1.toCharArray()) {
            visited[i - 'a']++;
        }
        for (int i: visited){
            System.out.print(i+" ");
        }
        System.out.println("");
        for (char i : s2.toCharArray()) {
            visited[i - 'a']--;
        }
        for (int i: visited){
            System.out.print(i+" ");
        }
        System.out.println("");

        int count = 0;
        for (int i = 0; i < 26; i++) {
            if (visited[i] != 0) {
                System.out.print(visited[i]+ " ");
                count++;
            }
        }
        return count;
    }
    public static void main(String[] args) {
//        boolean visited[] = new boolean[26];
//        System.out.println(visited);
//        for (Boolean x: visited){
//            System.out.println(x);
//        }
//        System.out.println(visited.length);
//        System.out.println('a'-'a');
//        System.out.println('b'-'a');
//        System.out.println('c'-'a');
//        String s = "asdfgh";
//        char[] ch = s.toCharArray();
//        for (char c: ch){
//            System.out.println(c-'a');
//        }
//        int[] a=new int[4];
//        for(Integer i: a){
//            System.out.println(i);
//        }
//        System.out.println('&');
////        String  geeksforgeeks;
////        String geeksforgeekscoursesgeeks;
        int count = coutChars("geeksforgeeks","geeksforgeekscoursesgeeks");
        System.out.println(count);
        byte b = 42;
        byte bb= 0b00101010;
        byte bh = 0x2A;
        System.out.println(" byte is "+b + " " +bh + " " + bb);
        boolean e= ispar("{[]()}");
        System.out.println(e);

    }
}
