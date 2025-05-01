package StringInvertida;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        String string  = "nay uos iO";
        ArrayList<Character> list = new ArrayList<>();
        ArrayList<Character> list2 = new ArrayList<>();
        for(int i = 0; i < string.length(); i ++){
            list.add(string.charAt(i));

        }
        System.out.println(list);
        for (int i = 0; !list.isEmpty(); i++){
            list2.add(list.remove(list.size() - 1));
        }
        System.out.println(list2);

        String stringInvertida = "";
        for(char c : list2){
            stringInvertida += c;
        }
        System.out.println("String invertida: " + stringInvertida);
    }
}
