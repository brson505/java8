package java8;

import lombok.ToString;

@ToString
public class Apple {
    private int weight;
    private String color;

    public Apple(int weight, String color) {
        this.weight = weight;
        this.color = color;
    }

    public String getColor() {
        return color;
    }
}
