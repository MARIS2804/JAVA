import java.util.Stack;
class Stackdsa{
    public static void main(String[] args) {
        //Stack is LIFO 
        Stack<String> stack = new Stack<>();
        stack.push("Vijay");
        stack.push("Kamal");
        stack.push("Rajini");
        stack.push("Ajith");
        System.out.println("Stack of Actors");
                for(String actor : stack){
            System.out.println(actor);
        }
        System.out.println("Vijay's Stack Position="+stack.search("Vijay"));
        System.out.println("Favorite Actor="+stack.peek());
        System.out.println("Top Actors");
        int n = stack.size();
        for(int i=0;i<n;i++){
            System.out.println(i+" "+stack.pop());
        }
        System.out.println("Stack is empty="+stack.isEmpty());
        //Application is i) undo-redo  ii) browser forward backward history iii) recursive function calls(backtracking) 
    }
    
}