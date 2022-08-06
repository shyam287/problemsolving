import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Stack;

public class ListPelindrome {

    public static void main(String[] args) {
        List<Integer> list = new LinkedList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(2);
        list.add(1);

        Stack<Integer> stack= new Stack<>();
        Iterator<Integer> iterator= list.iterator();

        while(iterator.hasNext()) {
            stack.push(iterator.next());
        }


        boolean isPelindrome = true;
        iterator= list.iterator();
        while(iterator.hasNext()) {
            if (stack.pop() != iterator.next()) {
                isPelindrome = false;
                break;
            }
        }

        if(isPelindrome) {
            System.out.println("List is palindrome");
        } else {
            System.out.println("List is not palindrome");
        }


    }
}


