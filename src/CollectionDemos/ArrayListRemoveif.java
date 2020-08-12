package CollectionDemos;

import java.util.ArrayList;

public class ArrayListRemoveif {

    public static void main(String[] args) {

        ArrayList<Integer> al = new ArrayList<>();

        al.add(23);
        al.add(13);//
        al.add(3);//
        al.add(231);
        al.add(15);//

        // remove if removes the element from list based on some conditions

        // remove elements less than 20
       // int a;
        System.out.println(al);
        al.removeIf(a->(a<20));
        System.out.println(al);


        ArrayList<Character> alChar = new ArrayList<>();

        alChar.add('a');
        alChar.add('m');
        alChar.add('o');
        alChar.add('l');
        alChar.add('p');
        alChar.add('r');
        alChar.add('i');
        alChar.add('y');
        alChar.add('k');

        System.out.println(alChar);

        // vowels -> a,e ,i,o,u

        alChar.removeIf(ch->ch =='a' ||ch =='e' ||ch =='o' ||ch =='i' ||ch =='u'  );

        System.out.println(alChar);

    }


}
