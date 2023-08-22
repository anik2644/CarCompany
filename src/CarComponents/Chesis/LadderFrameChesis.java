package CarComponents.Chesis;

import CarComponents.Chesis.Chesis;

public class LadderFrameChesis implements Chesis {
    @Override
    public void type() {
        System.out.println("Ladder frame chesis");
    }

    @Override
    public double getPrice() {
        return 1500.0;
    }
}
