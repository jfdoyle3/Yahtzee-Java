package objects;

import java.util.Random;

public class Die {

    private int faces;
    private int faceUp;
    private Random rand=new Random();


    public Die (int faces){
        this.faces=faces;
        this.faceUp=rand.nextInt(1)+(faces-1);
    }
    public Die (int faces, int faceUp){
        this.faces=faces;
        this.faceUp=faceUp;
    }
}

