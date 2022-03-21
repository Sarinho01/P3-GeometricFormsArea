package entities;

public class Square extends Rectangle{

    private Double side;

    public Square(Double side) {
        super(side, side);
        this.side = side;
    }

    public Double getSide() {
        return side;
    }

    public void setSide(Double side) {
        this.side = side;
    }
}
