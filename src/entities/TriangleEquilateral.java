package entities;

public class TriangleEquilateral extends TriangleRectangle{
    private Double lSide;

    public TriangleEquilateral(Double lSide) {
        super((lSide * Math.sqrt(3)) / 2, lSide / 2);
        this.lSide = lSide;
    }

    public Double getlSide() {
        return lSide;
    }

    public void setlSide(Double lSide) {
        this.lSide = lSide;
    }

    @Override
    public Double CalculateArea(){
        return super.CalculateArea() * 2;


    }
}
