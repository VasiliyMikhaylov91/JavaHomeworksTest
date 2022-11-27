package Lesson004;

import java.util.ArrayDeque;

public class DrinkerGame {
    public static void main(String[] args) {
        String input1 = "1 3 5 7 9";
        String input2 = "2 4 6 8 0";
        game(input1, input2);

    }

    static  ArrayDeque<Integer> formDequeFromString(String input) {
        ArrayDeque<Integer> res = new ArrayDeque<>();
        String[] inp = input.split(" ");
        for (String item: inp) {
            res.addLast(Integer.parseInt(item));
        }
        return res;
    }

    static void game(String cards1, String cards2) {
        ArrayDeque<Integer> deck1 = formDequeFromString(cards1);
        ArrayDeque<Integer> deck2 = formDequeFromString(cards2);
        boolean winner1 = false;
        boolean winner2 = false;
        int moveCount = 0;
        while (!(winner1 || winner2) && moveCount < 100000) {
            int card1 = deck1.pop();
            int card2 = deck2.pop();
            if (card1 > card2 && !(card2 == 0 && card1 == 9) ||
                    card1 == 0 && card2 == 9) {
                deck1.addLast(card1);
                deck1.addLast(card2);
            } else {
                deck2.addLast(card1);
                deck2.addLast(card2);
            }
            if (deck1.isEmpty()) {
                winner2 = true;
            }
            if (deck2.isEmpty()) {
                winner1 = true;
            }
            moveCount++;
        }
        if (winner1) {
            System.out.print("first ");
        } else if (winner2) {
            System.out.print("second ");
        } else {
            System.out.print("botva");
        }
        System.out.println(moveCount);
    }
}
