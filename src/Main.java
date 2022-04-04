import jdk.swing.interop.SwingInterOpUtils;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        // reverse stack (data type: Integer)
        Stack<Integer> wStack= new Stack<>();

       ArrayList<Integer> mWord=new  ArrayList<>();
        mWord.add(1);
        mWord.add(2);
        System.out.println("Array before reverse:"+ mWord);
        for (int i =mWord.size()-1 ; i >=0 ; i--) {
                  wStack.push(mWord.remove(i));
        }
        System.out.println("Array after reversing :"+wStack);
        // reverse stack (data type : String)
        Stack<String> wStrack= new Stack<>();
        ArrayList<String> mword= new ArrayList<>();
        mword.add("MOT ");
        mword.add("HAI ");
        System.out.println("Array before reversing :"+mword);
        for (int i = mword.size()-1; i >=0; i--) {
            wStrack.push(mword.remove(i));
        }
        System.out.println("array after reversing: "+wStrack);
    }


}
