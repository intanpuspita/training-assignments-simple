package eu.sig.training.ch03;

import java.awt.Color;
import java.util.Arrays;
import java.util.List;

abstract class FlagFactory {
    abstract List<Color> getFlagColor();
}

class Dutch extends FlagFactory {
    public List<Color> getFlagColor(){
        return Arrays.asList(Color.RED, Color.WHITE, Color.BLUE);
    }
}

class German extends FlagFactory {
    public List<Color> getFlagColor(){
        return Arrays.asList(Color.BLACK, Color.RED, Color.YELLOW);
    }
}

class Belgian extends FlagFactory {
    public List<Color> getFlagColor(){
        return Arrays.asList(Color.BLACK, Color.YELLOW, Color.RED);
    }
}

class French extends FlagFactory {
    public List<Color> getFlagColor(){
        return Arrays.asList(Color.BLUE, Color.WHITE, Color.RED);
    }
}

class Italian extends FlagFactory {
    public List<Color> getFlagColor(){
        return Arrays.asList(Color.GREEN, Color.WHITE, Color.RED);
    }
}

class Romania extends FlagFactory {
    public List<Color> getFlagColor(){
        return Arrays.asList(Color.BLUE, Color.YELLOW, Color.RED);
    }
}

class Ireland extends FlagFactory {
    public List<Color> getFlagColor(){
        return Arrays.asList(Color.GREEN, Color.WHITE, Color.ORANGE);
    }
}

class Hungarian extends FlagFactory {
    public List<Color> getFlagColor(){
        return Arrays.asList(Color.RED, Color.WHITE, Color.GREEN);
    }
}

class Bulgarian extends FlagFactory {
    public List<Color> getFlagColor(){
        return Arrays.asList(Color.WHITE, Color.GREEN, Color.RED);
    }
}

class Russia extends FlagFactory {
    public List<Color> getFlagColor(){
        return Arrays.asList(Color.WHITE, Color.BLUE, Color.RED);
    }
}

public class FlagFactory {

    // tag::getFlag[]
    public List<Color> getFlagColors(Nationality nationality) {
        List<Color> result;
        switch (nationality) {
        default:
            result = Arrays.asList(Color.GRAY);
            break;
        }
        return result;
    }
    // end::getFlag[]

}