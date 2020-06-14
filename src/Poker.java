import java.util.*;

public class Poker {

    public static void main(String[] args) {
        //造牌
        ArrayList<Integer> arr = new ArrayList<Integer>();
        String[] icons = {"♠", "♥", "♣", "♦"};
        String[] numbers = {"3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K", "A", "2"};
        HashMap<Integer, String> poker = new HashMap<Integer, String>();

        int index = 0;
        for (String i : icons) {
            for (String n : numbers) {
                arr.add(index);
                poker.put(index,i.concat(n));
                index++;
            }
        }
        arr.add(index);
        poker.put(index,"joker");
        index++;
        arr.add(index);
        poker.put(index,"JOKER");

        Collections.shuffle(arr);

        //造玩家
        TreeSet<Integer> Grom = new TreeSet<Integer>();
        TreeSet<Integer> Flora = new TreeSet<Integer>();
        TreeSet<Integer> Zephyr = new TreeSet<Integer>();

        for ( int i=0 ; i < arr.size() - 3 ; i++ ){
            if(i % 3 == 0){
                Grom.add(arr.get(i));
            }
            else if (i % 3 == 1){
                Flora.add(arr.get(i));
            }
            else {
                Zephyr.add(arr.get(i));
            }
        }

        showPoker("Grom",Grom,poker);

    }
    public static void showPoker(String name,TreeSet<Integer> player, HashMap<Integer, String> poker){

        System.out.print(name + "的牌是：");
        for (Integer i : player){
            System.out.print(poker.get(i) + " ");
        }


    }
}
