import List.MyList;
import List.person;

import java.util.Scanner;

public class TestList {
    public static void main(String[] args) {
        MyList<person> ml = new MyList<person>();
        ml.addFirst(new person(40, "Tom"));
        ml.addFirst(new person(30, "Doc"));
        ml.addFirst(new person(20, "Jerry"));
        ml.addFirst(new person(35, "Marvin"));
        ml.addFirst(new person(15, "Red"));
        ml.addFirst(new person(25, "Lusssy"));
        ml.addFirst(new person(10, "Johnny"));
        ml.print();
        person p2 = new person(15, "Doc");
        ml.addFirst(p2);
        ml.addFirst(new person(10, "Tom"));
        ml.print();
        person p3 = new person(20, "Jerry");
        ml.addLast(p3);
        MyList<person> copy = new MyList<person>(ml);
        copy.print();
        copy.numb();
        try{
        ml.delFirst();
       }catch (Exception NoElements){
            System.out.println("Список пуст");
        }
        try{
            ml.delData(p3);
        }catch (Exception NoElements){
            System.out.println("Список пуст");
        }
        ml.print();
        ml.numb();
        try{
            ml.DelAll();
        }catch (Exception NoElements){
            System.out.println("Список пуст");
        }
        ml.numb();
        try{
            ml.DelAll();
        }catch (Exception NoElements){
            System.out.println("Список пуст");
        }
    }
}
