import objects.Die;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        System.out.println("Roll Die 10x");
        Die die = new Die(6);
        for (int idx=0; idx<10; idx++){
            System.out.println(die.roll());
        }
    }
}

