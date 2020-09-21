import objects.Die;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        //  Rolling 1 Die 10 times.
        //  System.out.println("Roll Die 10x");
        //  for (int idx = 0; idx < 10; idx++)
        //     System.out.println(die.roll());

        // Making a List of Dice that have been rolled.
        List<Die> dice = new ArrayList<Die>();
        // put 5 Dies into a List
        for (int idx = 0; idx < 5; idx++) {
            Die die = new Die(6);
            dice.add(die);
        }

        for (Die cube : dice)
            System.out.println(cube.getRoll());

    }
    }



